package lotte.com.a.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lotte.com.a.dto.CommentDto;
import lotte.com.a.service.CommentService;

@RestController
public class CommentController {

	@Autowired
	CommentService service;
	
	@RequestMapping(value = "/addComment", method = RequestMethod.POST)
	public boolean addComment(CommentDto dto) {
		System.out.println("CommentController addComment() " + new Date());
		service.addComment(dto);
		return true;
	}
	
	@RequestMapping(value = "/getComments", method = RequestMethod.GET)
	public List<CommentDto> getComments(int seq) {
		System.out.println("CommentController getComments() " + new Date());
		return service.getCommentsbySeq(seq);
	}
}
