package com.naver.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.naver.service.BoardService;
import com.naver.service.MovieService;
import com.naver.vo.BoardVO;
import com.naver.vo.Criteria;
import com.naver.vo.MovieVO;
import com.naver.vo.PageMaker;
import com.naver.vo.SearchCriteria;

@Controller
@RequestMapping("/movie/*")
public class MovieController {

	private static final Logger logger = LoggerFactory.getLogger(MovieController.class);

	@Inject
	MovieService service;
	
	// 영화 리스트 목록 출력 (view)
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list() throws Exception {
		logger.info("list");
		return "movie/movie";
	}

	// 게시판 목록 조회
	@RequestMapping(value = "/getmv", method = RequestMethod.GET)
	public @ResponseBody List<MovieVO> getmv() throws Exception {
		logger.info("getmv");
//		service.list(); // 디비에서 정보를 받아 와야함
		
		// json  형태로 출력
		return service.list(); 

	}


}