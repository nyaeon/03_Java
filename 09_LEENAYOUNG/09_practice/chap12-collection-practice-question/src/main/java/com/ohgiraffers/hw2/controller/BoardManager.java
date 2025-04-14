package com.ohgiraffers.hw2.controller;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import com.ohgiraffers.hw2.view.ResultPrinter;

import java.util.ArrayList;
import java.util.Comparator;

public class BoardManager {

    private ArrayList<BoardDTO> boardList;
    private ResultPrinter rp = new ResultPrinter();

    /* 새 게시글 등록용 메소드 */
    public void insertBoard(BoardDTO b) {
        // 글번호 0으로 초기화
        int setBoardNo = 0;

        // 조회내역이 없는 경우
        // 조회된 내역이 없는 경우 새로운 리스트 생성 & 글 번호를 1로 변경
        if (boardList == null) {
            boardList = new ArrayList<>();
            setBoardNo = 1;
        } else {
            // 조회내역이 있는 경우
            // 기존 리스트의 마지막 인덱스의 글번호 조회
            setBoardNo = boardList.get(boardList.size()-1).getBoardNo() + 1;
        }
        b.setBoardNo(setBoardNo);
        boardList.add(b);

        // 출력값 결정(successPage)
        rp.successPage("insertBoard");
    }

    /* 게시글 전체 조회용 메소드 */
    public void selectAllList() {
        // 게시글 전체 조회 후 전체 출력 (printAllList() 이용)
        ResultPrinter rp = new ResultPrinter();
        rp.printAllList(boardList);
    }

    /* 게시물 1개 조회용 메소드 */
    public void selectOneBoard(int boardNo) {
        // 전체 게시물을 조회
        // 조회에 성공하면 게시물 번호와 일치하는 게시물을 리스트에서 탐색
        BoardDTO selectedBoard = null;
        if (boardList != null) {
            for (int i = 0; i < boardList.size(); i++) {
                if (boardList.get(i).getBoardNo() == boardNo) {
                    selectedBoard = boardList.get(i);
                    // 조회성공 시 조회수 1증가
                    boardList.get(i).setReadCount(boardList.get(i).getReadCount() + 1);
                    break;
                }
            }
        }
        // 일치하는 게시물이 없으면 에러출력,
        // 일치하는 내용이 있으면 게시물 출력
        if (selectedBoard != null) {
            rp.printBoard(selectedBoard);
        } else {
            rp.errorPage("selectOne");
        }

    }

    /* 게시물 제목 변경용 메소드 */
    public void updateBoardTitle(int boardNo, String title) {
        // 전체 리스트 조회
        // 일치하는 게시물 조회
        int result = 0;
        for (int i = 0; i < boardList.size(); i++) {
            if (boardList.get(i).getBoardNo() == boardNo) {
                // 조회 결과가 있는 경우 제목 수정
                boardList.get(i).setBoardTitle(title);
                result = 1;
                break;
            }
        }
        if(result == 0) {
            // 결과 출력(errorPage)
            rp.errorPage("updateTitle");
            System.out.println("해당 번호 글은 존재하지 않습니다.");
        } else {
            // 결과 출력(successPage)
            rp.successPage("updateTitle");
        }
    }

    /* 게시물 내용 변경용 메소드 */
    public void updateBoardContent(int boardNo, String content) {
        // 전체 리스트 조회
        // 일치하는 게시물 조회
        int result = 0;
        for (int i = 0; i < boardList.size(); i++) {
            if (boardList.get(i).getBoardNo() == boardNo) {
                // 조회 결과가 있는 경우 내용 수정
                // 수정 후 다시 파일에 저장
                boardList.get(i).setBoardContent(content);
                result = 1;
                break;
            }
        }
        if(result == 0) {
            // 결과 출력(errorPage)
            rp.errorPage("updateContent");
            System.out.println("해당 번호 글은 존재하지 않습니다.");
        } else {
            // 결과 출력(successPage)
            rp.successPage("updateContent");
        }
    }

    /* 게시물 삭제용 메소드 */
    public void deleteBoard(int boardNo) {
        // 전체 게시물 조회
        // 게시물 번호와 일치하는 게시물 조회
        int result = 0;
        for (int i = 0; i < boardList.size(); i++) {
            if (boardList.get(i).getBoardNo() == boardNo) {
                // 일치하는 게시물이 있는경우 삭제
                boardList.remove(i);
                result = 1;
                break;
            }
        }
        if(result == 0) {
            // 결과 출력(errorPage)
            rp.errorPage("deleteBoard");
            System.out.println("해당 번호 글은 존재하지 않습니다.");
        } else {
            // 결과 출력(successPage)
            rp.successPage("deleteBoard");
        }
    }

    /* 제목으로 조회 */
    public void searchBoard(String title) {
        // 전체 게시물 조회
        // 검색 결과를 담을 리스트 생성
        ArrayList<BoardDTO> searchedBoardList = new ArrayList<>();
        for (int i = 0; i < boardList.size(); i++) {
            if (boardList.get(i).getBoardTitle().contains(title)) {
                // 제목을 포함하고 있는 게시물을 결과 리스트에 저장
                searchedBoardList.add(boardList.get(i));
            }
        }

        // 검색결과 리스트가 비어있는 경우 에러 출력, 비어 있지 않은 경우 결과 출력
        if (searchedBoardList.isEmpty()) {
            rp.noSearchResult();
        } else {
            rp.printAllList(searchedBoardList);
        }
    }

    /* 정렬 처리용 메소드 */
    public void sortList(Comparator<BoardDTO> c) {
        // 리스트 전체 조회
        // 정렬
        boardList.sort(c);
        // 출력
        rp.printAllList(boardList);
    }
}
