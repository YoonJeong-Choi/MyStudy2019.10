package ServletModelPagingSubControllerAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ServletModelPagingModel.ServletPagingBoardDAO;
import ServletModelPagingModel.ServletPagingBoardTO;

public class ServletPagingDeleteOkAction implements ServletPagingAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println("Delete1OkAction 호출");

		ServletPagingBoardDAO dao = new ServletPagingBoardDAO();
		ServletPagingBoardTO to = new ServletPagingBoardTO();

		to.setSeq(request.getParameter("seq"));
		to.setPassword(request.getParameter("password"));

		int flag = dao.boardDeleteOk(to);

		request.setAttribute("flag", flag);
	}

}
