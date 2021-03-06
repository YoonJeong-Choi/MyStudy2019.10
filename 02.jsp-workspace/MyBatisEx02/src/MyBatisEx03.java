import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resource = "myBatisConfig.xml";

		InputStream is = null;
		SqlSession sqlSession = null;

		try {
			is = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

			sqlSession = sqlSessionFactory.openSession(true);

			DeptTO to = new DeptTO();
			to.setDeptno("80");

			int result = sqlSession.delete("delete1", to);

			if (result == 0) {
				System.out.println("실패");
			} else {
				System.out.println("성공");
			}

			/*
			 * DeptTO to = new DeptTO(); to.setDeptno("80"); to.setDname("홍보");
			 * 
			 * int result = sqlSession.update("update1", to);
			 * 
			 * if (result == 0) { System.out.println("실패"); } else {
			 * System.out.println("성공"); }
			 */

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (sqlSession != null)
				sqlSession.close();
			if (is != null)
				try {
					is.close();
				} catch (IOException e) {
				}
		}
	}

}
