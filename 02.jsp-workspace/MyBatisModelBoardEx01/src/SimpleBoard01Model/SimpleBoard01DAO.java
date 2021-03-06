package SimpleBoard01Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SimpleBoard01DAO {
	private DataSource dataSource = null;
	private SqlSession sqlSession;

	public SimpleBoard01DAO() {
		String resource = "myBatisConfig.xml";

		InputStream is = null;

		try {
			is = Resources.getResourceAsStream(resource);

			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

			this.sqlSession = sqlSessionFactory.openSession(true);
		} catch (IOException e) {
			System.out.println("error : " + e.getMessage());
		}
	}

	// board_write1.jsp
	public void boardWrite() {
		// 사용하지 않음

	}

	// board_write1_ok.jsp
	public int boardWriteOk(SimpleBoard01TO to) {
		int flag = 1;

		int result = sqlSession.insert("writeOk", to);

		if (result == 1) {
			flag = 0;
		}
		
		if (sqlSession != null) {
			sqlSession.close();
		}
		
		return flag;
	}

	// DB에서 정보를 빼오는 메소드
	public ArrayList<SimpleBoard01TO> boardList() {

		ArrayList<SimpleBoard01TO> boardLists = (ArrayList) sqlSession.selectList("list");

		if (sqlSession != null) {
			sqlSession.close();
		}

		return boardLists;
	}

	public SimpleBoard01TO boardView(SimpleBoard01TO to) {
		String seq = to.getSeq();
		to = (SimpleBoard01TO) sqlSession.selectOne("view", seq);
		to.setSeq(seq);
		
		if (sqlSession != null) {
			sqlSession.close();
		}

		if (sqlSession != null) {
			sqlSession.close();
		}
		
		return to;
	}

	public SimpleBoard01TO boardModify(SimpleBoard01TO to) {
		String seq = to.getSeq();
		to = (SimpleBoard01TO) sqlSession.selectOne("modify", seq);
		to.setSeq(seq);
		
		if (sqlSession != null) {
			sqlSession.close();
		}
		
		return to;
	}

	public int boardModifyOk(SimpleBoard01TO to) {
		int flag = 2;

		int result = sqlSession.update("modifyOk", to);

		if (result == 0) {
			flag = 1;
		} else if (result == 1) {
			flag = 0;
		}
		
		if (sqlSession != null) {
			sqlSession.close();
		}

		return flag;
	}

	public SimpleBoard01TO boardDelete(SimpleBoard01TO to) {
		String seq = to.getSeq();
		to = (SimpleBoard01TO) sqlSession.selectOne("delete", seq);
		to.setSeq(seq);
		
		if (sqlSession != null) {
			sqlSession.close();
		}
		
		return to;
	}

	public int boardDeleteOk(SimpleBoard01TO to) {
		int flag = 2;
		
		int result = sqlSession.delete("deleteOk", to);

		if (result == 0) {
			flag = 1;
		} else if (result == 1) {
			flag = 0;
		}
		
		if (sqlSession != null) {
			sqlSession.close();
		}

		return flag;
	}
}
