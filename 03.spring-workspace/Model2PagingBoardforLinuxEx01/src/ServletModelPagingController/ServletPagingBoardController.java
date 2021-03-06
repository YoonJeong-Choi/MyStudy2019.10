package ServletModelPagingController;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ServletModelPagingSubControllerAction.ServletPagingAction;
import ServletModelPagingSubControllerAction.ServletPagingDeleteAction;
import ServletModelPagingSubControllerAction.ServletPagingDeleteOkAction;
import ServletModelPagingSubControllerAction.ServletPagingListAction;
import ServletModelPagingSubControllerAction.ServletPagingModifyAction;
import ServletModelPagingSubControllerAction.ServletPagingModifyOkAction;
import ServletModelPagingSubControllerAction.ServletPagingViewAction;
import ServletModelPagingSubControllerAction.ServletPagingWriteAction;
import ServletModelPagingSubControllerAction.ServletPagingWriteOkAction;

/**
 * Servlet implementation class ServletPagingBoardController
 */
@WebServlet("/pagingController")
public class ServletPagingBoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
			String action = request.getParameter("action");

			String url = "";

			ServletPagingAction baction = null;

			if (action == null || action.equals("") || action.equals("list")) {
				baction = new ServletPagingListAction();

				baction.execute(request, response);

				url = "/WEB-INF/paging1/board_list1.jsp";

			} else if (action.equals("view")) {
				baction = new ServletPagingViewAction();
				baction.execute(request, response);

				url = "/WEB-INF/paging1/board_view1.jsp";

			} else if (action.equals("write")) {
				baction = new ServletPagingWriteAction();
				baction.execute(request, response);

				url = "/WEB-INF/paging1/board_write1.jsp";

			} else if (action.equals("writeOk")) {
				baction = new ServletPagingWriteOkAction();
				baction.execute(request, response);

				url = "/WEB-INF/paging1/board_write1_ok.jsp";

			} else if (action.equals("modify")) {
				baction = new ServletPagingModifyAction();
				baction.execute(request, response);

				url = "/WEB-INF/paging1/board_modify1.jsp";

			} else if (action.equals("modifyOk")) {
				baction = new ServletPagingModifyOkAction();
				baction.execute(request, response);

				url = "/WEB-INF/paging1/board_modify1_ok.jsp";
			} else if (action.equals("delete")) {
				baction = new ServletPagingDeleteAction();
				baction.execute(request, response);

				url = "/WEB-INF/paging1/board_delete1.jsp";

			} else if (action.equals("deleteOk")) {
				baction = new ServletPagingDeleteOkAction();
				baction.execute(request, response);

				url = "/WEB-INF/paging1/board_delete1_ok.jsp";
			} else {
				url = "/WEB-INF/paging1/error.jsp";
			}

			RequestDispatcher dispatcher = request.getRequestDispatcher(url);
			dispatcher.forward(request, response);
		} catch (UnsupportedEncodingException e) {
			System.out.println("error : " + e.getMessage());
		} catch (ServletException e) {
			System.out.println("error : " + e.getMessage());
		} catch (IOException e) {
			System.out.println("error : " + e.getMessage());
		}
	}
}
