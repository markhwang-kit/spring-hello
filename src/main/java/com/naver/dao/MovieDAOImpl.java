package com.naver.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.naver.vo.MovieVO;

@Repository
public class MovieDAOImpl implements MovieDAO {

	@Inject
	private SqlSession sqlSession;

	@Override
	public List<MovieVO> list() throws Exception {
		return sqlSession.selectList("movieMapper.list");
	}


}