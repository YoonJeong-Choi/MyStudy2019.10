package ServletModelPagingSubControllerAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ServletModelPagingModel.ServletPagingBoardDAO;
import ServletModelPagingModel.ServletPagingBoardTO;

public class ServletPagingWriteAction implements ServletPagingAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println("Write1Action 호출");
	}

}
