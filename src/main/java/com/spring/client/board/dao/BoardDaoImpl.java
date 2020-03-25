package com.spring.client.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.spring.client.board.vo.BoardVO;

@Repository
public class BoardDaoImpl implements BoardDao {
	
	@Autowired
	private SqlSession session;
	
	// 글목록 구현
	@Override
	public List<BoardVO> boardList(BoardVO bvo) {
		return session.selectList("boardList");
		
	}
	
	// 전체 레코드 건수 구현
	@Override
	public int boardListCnt(BoardVO bvo) {
		return (Integer)session.selectOne("boardListCnt");
	}
	
}
