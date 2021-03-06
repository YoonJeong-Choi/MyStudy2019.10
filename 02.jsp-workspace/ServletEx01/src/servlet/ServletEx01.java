package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex01")
public class ServletEx01 extends HttpServlet {
	// 우리가 실행하는 메서드가 아니라 tomcat에 의하여 실행된다.(callback 시스템에 의하여 실행되는 메서드)
	// init()은 클라이언트가 최초로 서블릿에 요청할 때 실행된다. 1번만 실행
	// service는 클라이언트의 요청이 있을 때 마다 실행된다.
	// destroy는 서버가 종료될때만 실행된다.

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init() 실행");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy() 실행");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("service() 실행");
		// HTML을 실행할 때 가장 위에 적어준다.
		resp.setContentType("text/html;charset=utf-8");
		
		StringBuffer html = new StringBuffer();
		html.append("<!DOCTYPE html>");
		html.append("<head>");
		html.append("<meta charset='usf-8'>");
		html.append("</head>");
		html.append("<body>");
		html.append("Hello Servlet");
		html.append("</body>");
		html.append("</html>");
		
		PrintWriter out = resp.getWriter();
		out.println(html);
	}
}
