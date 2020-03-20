package mysql.model2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mysql.model1.BoardDAO;
import mysql.model1.BoardTO;

public class ModifyAction implements BoardAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println("ModifyAction 호출");
		
		BoardTO to = new BoardTO();
		to.setSeq(request.getParameter("seq"));

		BoardDAO dao = new BoardDAO();
		to = dao.boardModify(to);
		String mail = to.getMail();
		
		request.setAttribute("seq", to.getSeq());
		request.setAttribute("subject", to.getSubject());
		request.setAttribute("writer", to.getWriter());
		request.setAttribute("mail", mail);
		request.setAttribute("content", to.getContent());
	}
}







