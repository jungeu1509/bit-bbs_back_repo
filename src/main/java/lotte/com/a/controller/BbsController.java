package lotte.com.a.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lotte.com.a.dto.BbsDto;
import lotte.com.a.dto.BbsListRequestDto;
import lotte.com.a.dto.BbsListResponseDto;
import lotte.com.a.dto.BbsParam;
import lotte.com.a.service.BbsService;

@RestController
public class BbsController {
	
	@Autowired
	BbsService service;
	
	// 조회수 확인
	@RequestMapping(value = "/getbbsbyMemberId", method = RequestMethod.GET)
	public BbsDto getbbsbyMemberId(int seq, String memberId) {
		System.out.println("BbsController getbbsbyMemberId() " + new Date());
		return service.getbbsbyMemberId(seq, memberId);
	}
	
	// 조회수 미확인
	@RequestMapping(value = "/getBbsBySeq", method = RequestMethod.GET)
	public BbsDto getBbsBySeq(int seq) {
		System.out.println("BbsController getBbsBySeq() " + new Date());
		return service.getBbsBySeq(seq);
	}
	
	@RequestMapping(value = "/deleteBbs", method = RequestMethod.GET)
	public boolean deleteBbs(int seq) {
		System.out.println("BbsController deleteBbs() " + new Date());
		service.deleteBbs(seq);
		return true;
	}
	
	@RequestMapping(value = "/updateBbs", method = RequestMethod.POST)
	public boolean updateBbs(BbsDto dto) {
		System.out.println("BbsController updateBbs() " + new Date());
		//System.out.println("input : " + dto.toString());
		service.updateBbs(dto);
		return true;
	}

	@RequestMapping(value = "/getBbsList", method = RequestMethod.GET)
	public List<BbsDto> getBbsList() {
		System.out.println("BbsController getBbsList() " + new Date());
		return service.getAllBbsList();
	}
	
	@RequestMapping(value = "/addBbs", method = RequestMethod.POST)
	public boolean addBbs(BbsDto dto) {
		System.out.println("BbsController addBbs() " + new Date());
		service.addBbs(dto);
		return true;
	}
	
	@RequestMapping(value = "/addBbsRewrite", method = RequestMethod.POST)
	public boolean addBbsRewrite(BbsDto dto) {
		System.out.println("BbsController addBbsRewrite() " + new Date());
		service.addBbsRewrite(dto);
		return true;
	}
	
	@RequestMapping(value = "/getBbsSearchList", method = RequestMethod.GET)
	public List<BbsDto> getBbsSearchList(BbsParam param) {
		System.out.println("BbsController getBbsSearchList() " + new Date());
		return service.getBbsSearchList(param);
	}
	
	@RequestMapping(value = "/getBbsSearchPageList", method = RequestMethod.GET)
	public List<BbsDto> getBbsSearchPageList(BbsParam param) {
		System.out.println("BbsController getBbsSearchPageList() " + new Date());
		
		int sn = param.getPageNumber();
		int start = sn * 10 + 1;
		int end = (sn + 1) * 10;
		
		param.setStart(start);
		param.setEnd(end);
		
		return service.getBbsSearchPageList(param);
	}
	
	@RequestMapping(value = "/getBbsReactList", method = RequestMethod.GET)
	public Map<String, Object> getBbsReactList(BbsParam param) {
		System.out.println("BbsController getBbsSearchPageList() " + new Date());
		
		int sn = param.getPageNumber();
		int start = sn * 10 + 1;
		int end = (sn + 1) * 10;
		
		param.setStart(start);
		param.setEnd(end);
		
		List<BbsDto> list = service.getBbsSearchPageList(param);
		int count = service.getBbsCount(param);
		
		Map<String, Object> map = new HashMap<>();
		map.put("bbslist", list);
		map.put("cnt", count);
		
		return map;
	}
	
	@RequestMapping(value = "/getBbsCount", method = RequestMethod.GET)
	public int getBbsCount(BbsParam param) {
		System.out.println("BbsController getBbsCount() " + new Date());
		return service.getBbsCount(param);
	}
	
	// eunu
	@RequestMapping(value = "/bbslist", method = RequestMethod.GET)
	public BbsListResponseDto bbsList(BbsListRequestDto req) {
		System.out.println("BbsController bbsList() " + new Date());
		
		int sn = req.getPageNumber();
		int start = 1 + sn * 10;
		int end = (sn + 1) * 10;
		
		BbsParam param = new BbsParam(req.getSearch(), req.getChoice(), req.getPageNumber(), start, end );
		
		return service.getBbsList(param);
	}
}
