package com.naver.service;

import java.util.List;

import com.naver.vo.MovieVO;

public interface MovieService {
	// 영화정보 리스트 보기
	public List<MovieVO> list() throws Exception;
}
