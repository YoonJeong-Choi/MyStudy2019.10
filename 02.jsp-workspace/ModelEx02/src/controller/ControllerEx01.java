package controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model2.Action;
import model2.View1Action;
import model2.View2Action;

// .do로 들어오는 페이지는 모두 여기로 연결된다.
@WebServlet("*.do")
public class ControllerEx01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

			try {
				request.setCharacterEncoding("utf-8");

				// http://localhost/ModelEx02/view1.do
				// http://localhost/ModelEx02과 view1.do을 분리하여야 어떤 페이지로 갈지 정할수있다.
				String path = request.getRequestURI().replaceAll(request.getContextPath(), "");

				String url = null;
				
				Action action = null;

				if (path.equals("/*.do") || path.equals("/view1.do")) {
					action = new View1Action();
					action.execute(request, response);
					
					url = "/WEB-INF/views/view1.jsp";
				} else if (path.equals("/view2.do")) {
					action = new View2Action();
					action.execute(request, response);
					
					url = "/WEB-INF/views/view2.jsp";
				} else {
					url = "/WEB-INF/views/error.jsp";
				}

				RequestDispatcher dispatch = request.getRequestDispatcher(url);
				dispatch.forward(request, response);
			} catch (UnsupportedEncodingException e) {
				System.out.println(e.getMessage());
			} catch (ServletException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
	}
}
