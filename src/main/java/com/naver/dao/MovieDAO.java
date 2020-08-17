package com.naver.dao;

import java.util.List;

import com.naver.vo.MovieVO;

public interface MovieDAO {

	//  영화정보 넣기
//	public void insert(MovieDAO movieVO) throws Exception;

	// 영화정보 리스트 보기
	public List<MovieVO> list() throws Exception;

}