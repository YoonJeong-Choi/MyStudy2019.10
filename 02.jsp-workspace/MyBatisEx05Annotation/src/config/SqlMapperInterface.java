package config;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import model1.DeptTO;

public interface SqlMapperInterface {
	// 원래 List로나오는데 ArrayList로 바꿔줬음
	@Select("select * from dept")
	public ArrayList<DeptTO> selectList();
	
	// selectByDeptno의 인자로 들어온 deptno가 아래의 deptno로 들어간다
	@Select("select * from dept where deptno=#{deptno}")
	public DeptTO selectByDeptno(String deptno);
	
	@Insert("insert into dept values(#{deptno}, #{dname}, #{loc})")
	public int insertDept(DeptTO to);
}
