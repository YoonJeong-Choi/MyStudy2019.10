package ServletModelPagingSubControllerAction;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ServletModelPagingModel.ServletPagingBoardDAO;
import ServletModelPagingModel.ServletPagingBoardListTO;
import ServletModelPagingModel.ServletPagingBoardTO;

public class ServletPagingListAction implements ServletPagingAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println("List1Action 호출");

		ServletPagingBoardDAO dao = new ServletPagingBoardDAO();
		ServletPagingBoardListTO listTO = new ServletPagingBoardListTO();

		// 현재 페이지 cpage
		int cpage = 0;

		if (request.getParameter("cpage") == null || request.getParameter("cpage").equals("")) {
			// 만약 cpage값이 없으면 1
			cpage = 1;
		} else if (request.getParameter("cpage") != null || !request.getParameter("cpage").equals("")) {
			// 만약 이전 페이지에서 cpgae값이 들어온다면 cpage값 설정해주기
			cpage = Integer.parseInt(request.getParameter("cpage"));
		}

		// listTO에도 cpage 설정해주기
		listTO.setCpage(cpage);

		// boardList메소드를 실행하여 페이징값과, 글목록10개가 저장된 BoardListTO 객체를 받아온다.
		listTO = dao.boardList(listTO);

		// 현재 페이지에서 보여줘야할 목록을 다음으로 넘김
		request.setAttribute("listTO", listTO);
	}

}
