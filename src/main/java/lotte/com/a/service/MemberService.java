package lotte.com.a.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lotte.com.a.dao.MemberDao;
import lotte.com.a.dto.MemberDto;

@Service
@Transactional
public class MemberService {
	@Autowired
	MemberDao dao;
	
	public MemberDto login(MemberDto dto) {
		return dao.login(dto);
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 * true : 아이디 생성 가능
	 * false : 아이디 생성 불가
	 */
	public boolean idCheck(String id) {
		boolean ret = true;
		if(dao.countMemberById(id) > 0) ret = false;
		return ret;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 * true : 아이디 생성 가능
	 * false : 아이디 생성 불가
	 */
	public boolean emailCheck(String email) {
		boolean ret = true;
		if(dao.countMemberByEmail(email) > 0) ret = false;
		return ret;
	}
	
	/**
	 * 
	 * @param dto
	 * @return
	 * true : 아이디 생성 완료
	 * false : 아이디 생성 실패
	 */
	public boolean addMember(MemberDto dto) {
		boolean ret = false;
		dao.addMember(dto);
		if(dao.countMemberById(dto.getId()) > 0) ret = true;
		
		return ret;
	}
}
