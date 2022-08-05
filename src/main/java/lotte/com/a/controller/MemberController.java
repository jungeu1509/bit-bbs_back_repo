package lotte.com.a.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lotte.com.a.dto.MemberDto;
import lotte.com.a.service.MemberService;

@RestController
public class MemberController {

	@Autowired
	MemberService service;
	
	@RequestMapping(value = "/member/login", method = RequestMethod.POST)
	public MemberDto login(MemberDto dto) {
		System.out.println("MemberController login() " + new Date());
		System.out.println(dto.toString());
		MemberDto ret = service.login(dto);
		//System.out.println("out :" + ret.toString());
		return ret;
	}
	
	@RequestMapping(value = "/member/idCheck", method = RequestMethod.POST)
	public boolean idCheck(String id) {
		System.out.println("MemberController checkId() " + new Date());
		System.out.println(id);
		boolean ret = false;
		ret = service.idCheck(id);
		System.out.println("out :" + ret);
		return ret;
	}
	
	@RequestMapping(value = "/member/emailCheck", method = RequestMethod.POST)
	public boolean emailCheck(String email) {
		System.out.println("MemberController emailCheck() " + new Date());
		System.out.println(email);
		boolean ret = false;
		ret = service.idCheck(email);
		System.out.println("out :" + ret);
		return ret;
	}
	
	@RequestMapping(value = "/member/addMember", method = RequestMethod.POST)
	public boolean addMember(MemberDto dto) {
		System.out.println("MemberController addMember() " + new Date());
		System.out.println(dto.toString());
		boolean ret = false;
		ret = service.addMember(dto);
		//System.out.println("out :" + ret);
		return ret;
	}
	
}
