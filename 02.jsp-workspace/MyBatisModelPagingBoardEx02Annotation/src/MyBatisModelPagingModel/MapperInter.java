package MyBatisModelPagingModel;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface MapperInter {
	@Select("select seq, subject, writer, hit, date_format(wdate, '%Y-%m-%d') wdate, datediff(now(), wdate) wgap from board1 order by seq desc limit #{fromIndex}, #{recordPerPage}")
	public ArrayList<MyBatisPagingBoardTO> selectList(MyBatisPagingBoardListTO listTO);
	
	@Select("select count(seq) from board1")
	public int selectTotalRecord();
	
	@Select("select seq, subject, writer, mail, content, hit, wip, wdate from board1 where seq=#{seq}")
	public  MyBatisPagingBoardTO selectView(String seq);
	
	@Update("update board1 set hit=hit+1 where seq=#{seq}")
	public void updateViewHit(String seq);
	
	@Insert("insert into board1 values(0, #{subject}, #{writer}, #{mail}, #{password}, #{content}, 0, #{wip}, now())")
	public  int insertWriteOk(MyBatisPagingBoardTO to);
	
	@Select("select seq, subject, writer, mail, content from board1 where seq=#{seq}")
	public  MyBatisPagingBoardTO selectModify(String seq);
	
	@Update("update board1 set subject=#{subject}, mail=#{mail}, content=#{content} where seq=#{seq} and password=#{password}")
	public  int updateModifyOk(MyBatisPagingBoardTO to);
	
	@Select("select seq, subject, writer from board1 where seq=#{seq}")
	public  MyBatisPagingBoardTO selectDelete(String seq);
	
	@Delete("delete from board1 where seq=#{seq} and password=#{password}")
	public  int deleteDeleteOk(MyBatisPagingBoardTO to);
}
