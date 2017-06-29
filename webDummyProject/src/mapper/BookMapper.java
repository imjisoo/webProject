package mapper;

import java.util.List;

import vo.MemberVO;

public interface BookMapper {
	
	public int insert (MemberVO book);
	
	public MemberVO selectOne (int bookNum);
	
	public List<MemberVO> selectAll ();
	
}
