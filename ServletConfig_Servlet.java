import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;

public class ServletConfig_Servlet implements Servlet {

	ServletConfig config;
	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		this.config = config;
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("We are in getServletConfig");
		return config;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws IOException {
		System.out.println("We are in service");
	}

	@Override
	public String getServletInfo() {
		System.out.println("We are in getServletINFO");
		return "ServletConfig_Servlet";
	}

	@Override
	public void destroy() {
		System.out.println("We are in destroy");
	}


}