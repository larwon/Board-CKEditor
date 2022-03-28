package com.freehoon.web.board.service;



import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.freehoon.web.board.dao.BoardDAO;

import com.freehoon.web.board.model.BoardVO;



@Service

public class BoardServiceImpl implements BoardService{



	//@Inject
	@Autowired

	private BoardDAO boardDAO;

	

	public List<BoardVO> getBoardList() throws Exception {

		return boardDAO.getBoardList();

	}



	@Override
	public BoardVO getBoardContent(int bid) throws Exception {
		// TODO Auto-generated method stub
		boardDAO.updateViewCnt(bid);
		return boardDAO.getBoardContent(bid);
	}


	@Override
	public int insertBoard(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.insertBoard(boardVO);
	}


	@Override
	public int updateBoard(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.updateBoard(boardVO);
	}



	@Override
	public int deleteBoard(int bid) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.deleteBoard(bid);
	}



	@Override
	public int updateViewCnt(int bid) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}











}