package repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mapper.BookMapper;
import vo.MemberVO;

@Component("dao")
public class BookDAO {
	
	@Autowired
	private SqlSessionTemplate session;
	
	public void setSession(SqlSessionTemplate session) {
		
		this.session = session;
		
	}
	
	public int insertBook (MemberVO book) {
		
		BookMapper mapper = session.getMapper(BookMapper.class);
		
		return mapper.insert(book);
		
	}
	
	public MemberVO selectOne (int bookNum) {
		
		BookMapper mapper = session.getMapper(BookMapper.class);
		
		return mapper.selectOne(bookNum);
		
	}
	
	public List<MemberVO> selectAll () {
		
		BookMapper mapper = session.getMapper(BookMapper.class);
		
		return mapper.selectAll();
		
	}
	
}
