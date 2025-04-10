package com.ohgiraffers.hw2.controller;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import com.ohgiraffers.hw2.view.ResultPrinter;
import java.util.ArrayList;
import java.util.Comparator;

public class BoardManager {

    private ArrayList<BoardDTO> boardList;
    ResultPrinter rp;

    public BoardManager() {
        boardList = new ArrayList<>();
        rp = new ResultPrinter();
    }

    /* 새 게시글 등록용 메소드 */
    public void insertBoard(BoardDTO b) {
        if (boardList.isEmpty()) {
            b.setBoardNo(1);
        } else {
            int max = -1;
            for (BoardDTO board : boardList) {
                max = Math.max(max, board.getBoardNo());
            }
            b.setBoardNo(max + 1);
        }
        boardList.add(b);
        rp.successPage("insertBoard");
        // 출력값 결정(successPage)
    }

    /* 게시글 전체 조회용 메소드 */
    public void selectAllList() {
        if (boardList.isEmpty()) {
            rp.errorPage("selectOne");
            return;
        }
        rp.printAllList(boardList);
    }

    /* 게시물 1개 조회용 메소드 */
    public void selectOneBoard(int boardNo) {
        for (BoardDTO board : boardList) {
            if (board.getBoardNo() == boardNo) {
                board.increaseReadCount();
                rp.printBoard(board);
                return;
            }
        }
        rp.errorPage("selectOne");
    }

    /* 게시물 제목 변경용 메소드 */
    public void updateBoardTitle(int boardNo, String title) {
        for (BoardDTO board : boardList) {
            if (board.getBoardNo() == boardNo) {
                board.setBoardTitle(title);
                rp.successPage("updateTitle");
                return;
            }
        }

        rp.errorPage("updateTitle");
    }

    /* 게시물 내용 변경용 메소드 */
    public void updateContent(int boardNo, String content) {
        for (BoardDTO board : boardList) {
            if (board.getBoardNo() == boardNo) {
                board.setBoardContent(content);
                rp.successPage("updateContent");
                return;
            }
        }
        rp.errorPage("updateContent");
    }

    /* 게시물 삭제용 메소드 */
    public void deleteBoard(int boardNo) {
        for (int i = 0; i < boardList.size(); i++) {
            if (boardList.get(i).getBoardNo() == boardNo) {
                boardList.remove(i);
                rp.successPage("deleteBoard");
                return;
            }
        }
        rp.errorPage("deleteBoard");
    }

    /* 제목으로 조회 */
    public void searchBoard(String title) {
        // 전체 게시물 조회
        // 검색 결과를 담을 리스트 생성
        // 제목을 포함하고 있는 게시물을 결과 리스트에 저장
        // 검색결과 리스트가 비어있는 경우 에러 출력, 비어 있지 않은 경우 결과 출력

        ArrayList<BoardDTO> res = new ArrayList<>();

        for (BoardDTO board : boardList) {
            if (board.getBoardTitle().contains(title)) {
                res.add(board);
            }
        }

        if (res.isEmpty()) {
            rp.noSearchResult();
            return;
        }

        rp.printAllList(res);
    }

    /* 정렬 처리용 메소드 */
    public void sortList(Comparator<BoardDTO> c) {
        // 리스트 전체 조회
        // 정렬
        // 출력

        boardList.sort(c);
        rp.printAllList(boardList);
    }
}
