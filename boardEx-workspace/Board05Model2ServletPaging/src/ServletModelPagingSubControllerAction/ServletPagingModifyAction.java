package ServletModelPagingSubControllerAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ServletModelPagingModel.ServletPagingBoardDAO;
import ServletModelPagingModel.ServletPagingBoardTO;

public class ServletPagingModifyAction implements ServletPagingAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println("Modify1Action 호출");
		
		ServletPagingBoardDAO dao = new ServletPagingBoardDAO();
		
		ServletPagingBoardTO to = new ServletPagingBoardTO();
		to.setCpage(request.getParameter("cpage"));
		to.setSeq(request.getParameter("seq"));
		to = dao.boardModify(to);
		
		request.setAttribute("to", to);
	}

}
