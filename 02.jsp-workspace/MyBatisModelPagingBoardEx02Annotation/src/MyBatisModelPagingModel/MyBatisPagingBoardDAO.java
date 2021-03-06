package MyBatisModelPagingModel;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisPagingBoardDAO {
	private SqlSession sqlSession;
	private MapperInter mapper;

	public MyBatisPagingBoardDAO() {
		String resource = "myBatisConfig.xml";

		InputStream is = null;

		try {
			is = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			this.sqlSession = sqlSessionFactory.openSession(true);

			sqlSession.getConfiguration().addMapper(MapperInter.class);
			this.mapper = sqlSession.getMapper(MapperInter.class);
		} catch (IOException e) {
			System.out.println("error : " + e.getMessage());
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
				}
			}
		}

	}

	public MyBatisPagingBoardListTO boardList(MyBatisPagingBoardListTO listTO) {
		// 현재 페이지
		int cpage = listTO.getCpage();
		// 한 페이지당 보일 글 수
		int recordPerPage = listTO.getRecordPerPage();
		// 한 페이지에 보일 페이지 이동 번호 수
		int blockPerPage = listTO.getBlockPerPage();
		// 현재페이지에서 보이는 글의 시작번호
		int fromIndex = (cpage -1) * recordPerPage;
		listTO.setFromIndex(fromIndex);
		// 전체 글 수
		int totalRecord = mapper.selectTotalRecord();
		listTO.setTotalRecord(totalRecord);
		
		// DB에서 받아온 후 설정해주기
		listTO.setBoardLists(mapper.selectList(listTO));
		
		// 총 페이지 수
		int totalPage = ((totalRecord - 1) / recordPerPage) + 1;
		listTO.setTotalPage(totalPage);
		// 현재 보이는 페이지 이동 번호의 시작번호
		int startBlock = ((cpage - 1) / blockPerPage) * blockPerPage + 1;
		listTO.setStartBlock(startBlock);
		// 현재 보이는 페이지 이동 번호의 끝번호
		int endBlock = startBlock + blockPerPage - 1;
		listTO.setEndBlock(endBlock);

		if (sqlSession != null) {
			sqlSession.close();
		}
		
		return listTO;
	}

	public void boardWrite() {
	}

	public int boardWriteOk(MyBatisPagingBoardTO to) {
		int flag = 1;
		int result = mapper.insertWriteOk(to);
		
		if (result == 1) {
			flag = 0;
		}

		if (sqlSession != null) {
			sqlSession.close();
		}

		return flag;
	}

	public MyBatisPagingBoardTO boardView(MyBatisPagingBoardTO to) {
		// 조회수올리고
		mapper.updateViewHit(to.getSeq());
		// 글 찾아온다.
		to = mapper.selectView(to.getSeq());

		if (sqlSession != null)
			sqlSession.close();

		return to;
	}

	public MyBatisPagingBoardTO boardModify(MyBatisPagingBoardTO to) {

		to = mapper.selectModify(to.getSeq());

		if (sqlSession != null)
			sqlSession.close();

		return to;
	}

	public int boardModifyOk(MyBatisPagingBoardTO to) {
		int flag = 2;

		int result = mapper.updateModifyOk(to);

		if (result == 1) {
			flag = 0;
		} else if (result == 0) {
			flag = 1;
		}
		return flag;
	}

	public MyBatisPagingBoardTO boardDelete(MyBatisPagingBoardTO to) {
		to = mapper.selectDelete(to.getSeq());

		if (sqlSession != null)
			sqlSession.close();

		return to;
	}

	public int boardDeleteOk(MyBatisPagingBoardTO to) {
		int flag = 2;
		int result = mapper.deleteDeleteOk(to);

		if (result == 0) {
			flag = 1;
		} else if (result == 1) {
			flag = 0;
		}

		if (sqlSession != null)
			sqlSession.close();

		return flag;
	}
}
