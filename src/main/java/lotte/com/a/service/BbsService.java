package lotte.com.a.service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lotte.com.a.dao.BbsDao;
import lotte.com.a.dto.BbsDto;
import lotte.com.a.dto.BbsListResponseDto;
import lotte.com.a.dto.BbsParam;

@Service
@Transactional
public class BbsService {
	
	@Autowired
	BbsDao dao;
	
	public List<BbsDto> getAllBbsList() {
		return dao.getBbsList();
	}
	
	public void addBbs(BbsDto dto) {
		dao.addBbs(dto);
	}
	
	public void deleteBbs(int seq) {
		dao.deleteBbs(seq);
	}
	
	public void updateBbs(BbsDto dto) {
		dao.updateBbs(dto);
	}
	
	public List<BbsDto> getBbsSearchList(BbsParam param) {
		return dao.getBbsSearchList(param);
	}
	
	public List<BbsDto> getBbsSearchPageList(BbsParam param) {
		return dao.getBbsSearchPageList(param);
	}
	
	public int getBbsCount(BbsParam param) {
		return dao.getBbsCount(param);
	}
	
	public void addBbsRewrite(BbsDto dto) {
		dao.bbsStepUpdate(dto.getSeq());
		dao.addBbsRewrite(dto);
	}
	
	// eunu
	public BbsListResponseDto getBbsList(BbsParam param) {
		List<BbsDto> list = dao.bbslist(param);
		int len = dao.getBbsCount(param);
		int bbsPage = len / 10;
		if((len%10) > 0) {
			bbsPage = bbsPage + 1;
		}
		
		return new BbsListResponseDto(param.getChoice(), param.getSearch(), list, bbsPage, param.getPageNumber());
	}

	public BbsDto getbbsbyMemberId(int seq, String memberId) {
		Map<String,Object> map = new HashMap<>();
		map.put("seq", seq);
		map.put("memberId", memberId);
		Instant rdate = dao.selectReadcountByMemberId(map);
		
		// 처음 읽거나 rdate가 현재에서 20분 뺀거보다 이전일때 조회수 추가
		if(rdate==null) {
			dao.updateBbsReadcount(seq);
			dao.addReadcount(map);
		}
		else if(rdate.isBefore(Instant.now().minus(20, ChronoUnit.MINUTES))) {
			dao.updateBbsReadcount(seq);
			dao.updateReadcount(map);
		}
		
		return dao.getBbsBySeq(seq);
	}
	
	public BbsDto getBbsBySeq(int seq) {
		return dao.getBbsBySeq(seq);
	}
}
