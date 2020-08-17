package com.naver.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.naver.dao.MovieDAO;
import com.naver.vo.MovieVO;

@Service
public class MovieServiceImpl implements MovieService {

	@Inject
	private MovieDAO dao;

	@Override
	public List<MovieVO> list() throws Exception {
		return dao.list();
	}


}