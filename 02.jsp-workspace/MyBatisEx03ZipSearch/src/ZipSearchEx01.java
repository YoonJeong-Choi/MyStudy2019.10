import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ZipSearchEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resource = "myBatisConfig.xml";

		InputStream is = null;
		SqlSession sqlSession = null;

		try {
			is = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

			sqlSession = sqlSessionFactory.openSession();
			System.out.print("동을 입력해 주세요. : ");
			String searchDong = new Scanner(System.in).next();

			ArrayList<ZipcodeSearchTOEx01> lists = (ArrayList) sqlSession.selectList("searchZip01",
					"%" + searchDong + "%");

			if (lists.size() == 0) {
				System.out.println("검색 결과가 없습니다.");
			} else {
				System.out.println();
				System.out.printf("%s  %s  %s  %s  %s  %s", "우편번호", "시도", "구군", "동", "리", "주소");
				System.out.println();
				for (int i = 0; i < lists.size(); i++) {
					ZipcodeSearchTOEx01 to = lists.get(i);

					System.out.printf("%7s|%4s|%4s|%6s|%15s|%s", to.getZipcode(), to.getSido(), to.getGugun(),
							to.getDong(), to.getRi(), to.getBunji());
					System.out.println();
				}
			}
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
