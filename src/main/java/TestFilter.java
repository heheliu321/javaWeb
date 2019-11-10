
import java.io.IOException;
 
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
public class TestFilter implements Filter {
	private Logger logger = LoggerFactory.getLogger(TestFilter.class);
 
	public void destroy() {
        System.out.println("..............execute TestFilter destory()..............");
	}
 
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,FilterChain arg2) throws IOException, ServletException {
        System.out.println("..............execute TestFilter doFilter()..............");
        System.out.println(servletRequest.getRemoteAddr());
		arg2.doFilter(servletRequest, servletResponse);
	}
 
	public void init(FilterConfig arg0) throws ServletException {
        System.out.println("..............execute TestFilter  init()..............");
	}
}