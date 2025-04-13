package com.ohgiraffers.hw2.controller;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import com.ohgiraffers.hw2.view.ResultPrinter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BoardManager {
    private ArrayList<BoardDTO> boardList;
    private ResultPrinter rp = new ResultPrinter();

    /* 새 게시물 등록용 메소드 */
    public void insertBoard(BoardDTO b) {
        /* 글 번호를 0으로 초기화 */
        int boardNo = 0;

        /* 조회 내역이 있는지 확인 */
        if(boardList == null) {
            /* 조회 내역이 없는 경우 새로운 리스트 생성 */
            boardList = new ArrayList<>();
            /* 글 번호를 1로 변경 */
            boardNo++;
        } else {
            /* 조회 내역이 있는 경우 기존 리스트의 마지막 인덱스의 글 번호 조회 */
            boardNo = boardList.get(boardList.size() - 1).getBoardNo() + 1;
        }
        /* 입력하려는 board 객체에 boardNo변경 */
        b.setBoardNo(boardNo);
        /* 리스트에 board객체 추가 */
        boardList.add(b);

       rp.successPage("insertBoard");

    }

    /* 게시물 전체 조회용 메소드 */
    public void selectAllList() {

        for(BoardDTO board : boardList) {
            System.out.println(board);
        }
    }

    /* 게시물 1개 조회용 메소드 */
    public void selectOneBoard(int boardNo) {

        /* 일치하는 board 정보를 담을 레퍼런스 변수 초기화 */
        BoardDTO selectedBoard = null;
        /* 조회에 성공하면 게시물 번호와 일치하는 게시물을 리스트에서 탐색 */
        if(boardList != null) {
            for(int i = 0; i < boardList.size(); i++) {
                /* 일치하는 게시물 번호의 글을 board레퍼런스에 담기 */
                if(boardList.get(i).getBoardNo() == boardNo) {
                    selectedBoard = boardList.get(i);
                    /* 조회수 1 증가 */
                    boardList.get(i).setReadCount(boardList.get(i).getReadCount() + 1);
                    break;
                }
            }
        }
        /* 일치하는 게시물이 없으면 에러출력, 있으면 파일에 다시 기록 후 조회한 게시물 출력 */
        if (selectedBoard == null) {
            rp.errorPage("selectOne");
        } else {
            rp.printBoard(selectedBoard);
        }
    }

    /* 게시물 제목 변경용 메소드 */
    public void updateBoardTitle(int boardNo, String title) {
          /* 결과를 컨트롤할 변수 선언 */
        int result = 0;

        /* 일치하는 게시물 탐색 */
        for(int i = 0; i < boardList.size(); i++) {
            if(boardList.get(i).getBoardNo() == boardNo) {
                /* 탐색 결과가 있는 경우 제목 수정 */
                boardList.get(i).setBoardTitle(title);
                break;
            }
        }

       rp.successPage("updateTitle");
    }

    public void updateBoardContent(int boardNo, String content) {
        /* 결과를 컨트롤할 변수 선언 */
        int result = 0;

        /* 게시물 탐색하여 글번호와 일치하는 게시물 탐색 */
        for(int i = 0; i < boardList.size(); i++) {
            if(boardList.get(i).getBoardNo() == boardNo) {
                boardList.get(i).setBoardContent(content);
                break;
            }
        }

        rp.successPage("updateContent");

    }

    /* 게시물 삭제용 메소드 */
    public void deleteBoard(int boardNo) {
        /* 성공 실패 여부를 담을 변수 선언 */
        int result = 0;

        /* 게시물번호와 일치하는 게시물 탐색 */
        for(int i = 0; i < boardList.size(); i++) {
            /* 일치하는 게시물이 있는 경우 삭제 */
            if(boardList.get(i).getBoardNo() == boardNo) {
                boardList.remove(i);
                break;
            }
        }

        rp.successPage("deleteBoard");
    }

    public void searchBoard(String title) {
        /* 검색 결과를 담을 리스트 생성 */
        ArrayList<BoardDTO> searchList = new ArrayList<BoardDTO>();

        /* 제목을 포함하고 있는 게시물을 결과 리스트에 저장 */
        for (int i = 0; i < boardList.size(); i++) {
            /* 검색하려는 텍스트와 제목이 일치하는 문자가 있는 경우 */
            if (boardList.get(i).getBoardTitle().contains(title)) {
                /* 검색 결과를 담을 리스트에 추가 */
                searchList.add(boardList.get(i));
            }
        }

        /* 검색결과 리스트가 비어 있는 경우 에러출력, 비어 있지 않은 경우 결과 출력 */
        if (searchList.isEmpty()) {
            rp.noSearchResult();
        } else {
            rp.printAllList(searchList);
        }

    }

    /* 정렬 처리용 메소드 */
    public void sortList(Comparator<BoardDTO> c) {

        /* 정렬 */
        boardList.sort(c);
        /* 출력 */
        rp.printAllList(boardList);
    }
}
