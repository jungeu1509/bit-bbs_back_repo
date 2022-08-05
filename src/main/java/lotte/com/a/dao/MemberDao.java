package lotte.com.a.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import lotte.com.a.dto.MemberDto;

@Mapper
@Repository
public interface MemberDao {

	public MemberDto login(MemberDto dto);
	
	public int countMemberById(String id);
	
	public int countMemberByEmail(String email);
	
	public MemberDto findMemberById(String id);
	
	public void addMember(MemberDto dto);
}
