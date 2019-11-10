import java.io.IOException;
 
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
public class TestServlet extends HttpServlet {
 
	private Logger logger = LoggerFactory.getLogger(TestServlet.class);
 
	/**
	 * 
	 */
	private static final long serialVersionUID = -4263672728918819141L;
 
	@Override
	public void init() throws ServletException {
		System.out.println("...TestServlet init() init..........");
		super.init();
	}
	
	@Override
	public void destroy() {
		System.out.println("...TestServlet init() destory..........");
		super.destroy();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("...TestServlet doGet()..........");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("...TestServlet doPost() start..........");
		//操作attribute
		request.setAttribute("a", "a");
		request.setAttribute("a", "b");
		request.getAttribute("a");
		request.removeAttribute("a");
		//操作session
		request.getSession().setAttribute("a", "a");
		request.getSession().getAttribute("a");
		request.getSession().invalidate();
		System.out.println("...TestServlet doPost() end..........");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("..........TestServlet service............");
		super.service(req, res);
	}
}