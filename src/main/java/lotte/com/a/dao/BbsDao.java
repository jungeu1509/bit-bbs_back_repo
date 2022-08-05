package lotte.com.a.dao;

import java.time.Instant;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import lotte.com.a.dto.BbsDto;
import lotte.com.a.dto.BbsParam;

@Mapper
@Repository
public interface BbsDao {
	
	public BbsDto getBbsBySeq(int seq);

	
	public List<BbsDto> getBbsList();
	public void addBbs(BbsDto dto);
	public void deleteBbs(int seq);
	public void updateBbs(BbsDto dto);
	
	public List<BbsDto> getBbsSearchList(BbsParam param);
	public List<BbsDto> getBbsSearchPageList(BbsParam param);
	public int getBbsCount(BbsParam param);
	
	public void bbsStepUpdate(int seq);
	public void addBbsRewrite(BbsDto dto);
	
	// eunu
	public List<BbsDto> bbslist(BbsParam bbs);
	//public int getBbsCount(BbsParam bbs);

	public Instant selectReadcountByMemberId(Map<String, Object> map);
	public void addReadcount(Map<String, Object> map);
	public void updateReadcount(Map<String, Object> map);
	public void updateBbsReadcount(int seq);
}
