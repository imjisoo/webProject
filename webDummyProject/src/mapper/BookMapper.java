package mapper;

import java.util.List;

import vo.BookVO;

public interface BookMapper {
	
	public int insert (BookVO book);
	
	public BookVO selectOne (int bookNum);
	
	public List<BookVO> selectAll ();
	
}
