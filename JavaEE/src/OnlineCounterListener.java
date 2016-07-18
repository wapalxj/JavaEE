/**
 * Created by Administrator on 2016/7/10.
 * 监听访问用户数。只需要用不同的浏览器访问http://localhost:8080/vero/即可
 */

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
@WebListener()//空注解即可，同样不需要在web.xml中配置
public class OnlineCounterListener implements HttpSessionListener{

    private int count = 0;
    // Public constructor is required by servlet spec
    public OnlineCounterListener() {
    }

    // -------------------------------------------------------
    // HttpSessionListener implementation
    // -------------------------------------------------------
    public void sessionCreated(HttpSessionEvent se) {
      /* Session is created. */
        count++;
        System.out.println("+1---->总:"+count);
    }

    public void sessionDestroyed(HttpSessionEvent se) {
      /* Session is destroyed. */
        count--;
        if (count<0) count=0;
        System.out.println("-1---->总:"+count);
    }

}
