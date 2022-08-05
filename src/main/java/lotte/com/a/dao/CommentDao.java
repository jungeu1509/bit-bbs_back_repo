package lotte.com.a.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import lotte.com.a.dto.BbsDto;
import lotte.com.a.dto.BbsParam;
import lotte.com.a.dto.CommentDto;

@Mapper
@Repository
public interface CommentDao {
	
	public List<CommentDto> getCommentsbySeq(int seq);
	
	public void addComment(CommentDto dto);
}
