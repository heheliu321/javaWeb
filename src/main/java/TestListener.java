import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
public class TestListener implements HttpSessionListener, ServletRequestListener, ServletRequestAttributeListener
{
 
    private Logger logger = LoggerFactory.getLogger(TestListener.class);
 
 
    public void sessionCreated(HttpSessionEvent arg0)
    {
        System.out.println(".......TestListener sessionCreated().......");
    }
 
 
    public void sessionDestroyed(HttpSessionEvent arg0)
    {
        System.out.println(".......TestListener sessionDestroyed().......");

}

    public void requestInitialized(ServletRequestEvent arg0)
    {
        System.out.println("......TestListener requestInitialized()......");
    }


    public void requestDestroyed(ServletRequestEvent arg0)
    {
        System.out.println("......TestListener requestDestroyed()......");
    }
 
    public void attributeAdded(ServletRequestAttributeEvent srae)
    {
        System.out.println("......TestListener attributeAdded()......");
    }
 
 
    public void attributeRemoved(ServletRequestAttributeEvent srae)
    {
        System.out.println("......TestListener attributeRemoved()......");
    }
 
 
    public void attributeReplaced(ServletRequestAttributeEvent srae)
    {
        System.out.println("......TestListener attributeReplaced()......");
    }
}