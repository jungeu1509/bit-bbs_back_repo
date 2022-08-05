package lotte.com.a.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lotte.com.a.dao.CommentDao;
import lotte.com.a.dto.CommentDto;



@Service
@Transactional
public class CommentService {
	
	@Autowired
	CommentDao dao;
	
	public List<CommentDto> getCommentsbySeq(int seq) {
		return dao.getCommentsbySeq(seq);
	}
	
	public void addComment(CommentDto dto) {
		dao.addComment(dto);
	}
}
