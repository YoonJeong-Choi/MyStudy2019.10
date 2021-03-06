package SimpleBoard01ActionSubController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import SimpleBoard01Model.SimpleBoard01DAO;
import SimpleBoard01Model.SimpleBoard01TO;

public class SimpleBoard01Delete1Ok implements SimpleBoard01Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Delete1Ok SubController 호출");

		SimpleBoard01TO to = new SimpleBoard01TO();

		to.setSeq(request.getParameter("seq"));
		to.setPassword(request.getParameter("password"));

		SimpleBoard01DAO dao = new SimpleBoard01DAO();

		int flag = dao.boardDeleteOk(to);

		request.setAttribute("flag", flag);
	}

}
