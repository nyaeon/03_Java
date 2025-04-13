package com.ohgiraffers.hw2.controller;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import com.ohgiraffers.hw2.view.ResultPrinter;

import java.util.ArrayList;
import java.util.Comparator;

public class BoardManager {

    private ArrayList<BoardDTO> boardList = new ArrayList<>();
    ResultPrinter resultPrinter = new ResultPrinter();

    /* 새 게시글 등록용 메소드 */
    public void insertBoard(BoardDTO b) {
        // 글번호 0으로 초기화
        // 조회내역이 있는 경우
        // -조회된 내역이 있는 경우 새로운 리스트 생성
        // -글 번호를 1 로 변경
        // 조회내역이 없는 경우
        // -조회 내역이 있는 경우 기존 리스트의 마지막 인덱스의 글번호 조회
        if (b == null) {
            resultPrinter.errorPage("insertBoard");
            return;
        }

        if (boardList.isEmpty()) {
            b.setBoardNo(1);
        } else {
            int lastIndex = boardList.size() - 1;
            int lastBoardNo = boardList.get(lastIndex).getBoardNo();
            b.setBoardNo(lastBoardNo + 1);
        }

        boardList.add(b);
        resultPrinter.successPage("insertBoard");

        // 출력값 결정(successPage)
    }

    /* 게시글 전체 조회용 메소드 */
    public void selectAllList() {
        // 게시글 전체 조회 후 전체 출력 (printAllList() 이용)
        resultPrinter.printAllList(boardList);
    }

    /* 게시물 1개 조회용 메소드 */
    public void selectOneBoard(int boardNo) {
        // 전체 게시물을 조회
        // 조회에 성공하면 게시물 번호와 일치하는 게시물을 리스트에서 탐색
        // 조회성공 시 조회수 1증가
        // 일치하는 게시물이 없으면 에러출력,
        // 일치하는 내용이 있으면 게시물 출력
        boolean found = false;

        for (BoardDTO b : boardList) {
            if (b.getBoardNo() == boardNo) {
                b.setReadCount(b.getReadCount() + 1);  // 기존 조회수 + 1
                System.out.println(b);
                resultPrinter.successPage("selectOne");
                found = true;
                break;
            }
        }
        if (!found) {
            resultPrinter.errorPage("selectOne");
        }
    }

    ///* 게시물 제목 변경용 메소드 */
    public void updateBoardTitle(int boardNo, String title) {
        // 전체 리스트 조회
        // 일치하는 게시물 조회
        // 조회 결과가 있는 경우 제목 수정
        // 결과 출력(successPage)
        boolean found = false;

        for (BoardDTO b : boardList) {
            if (b.getBoardNo() == boardNo) {
                b.setBoardTtile(title);
                System.out.println(b);
                resultPrinter.successPage("updateTitle");
                found = true;
                break;
            }
        }
        if (!found) {
            resultPrinter.errorPage("updateTitle");
        }

    }

    /* 게시물 내용 변경용 메소드 */
    public void updateContent(int boardNo, String content) {
        // 전체 리스트 조회
        // 일치하는 게시물 조회
        // 조회 결과가 있는 경우 내용 수정
        // 수정 후 다시 파일에 저장
        // 결과 출력(successPage)
        boolean found = false;

        for (BoardDTO b : boardList) {
            if (b.getBoardNo() == boardNo) {
                b.setBoardContent(content);
                System.out.println(b);
                resultPrinter.successPage("updateContent");
                found = true;
                break;
            }
        }

        if (!found) {
            resultPrinter.errorPage("updateContent");
        }

    }

    //* 게시물 삭제용 메소드 */
    public void deleteBoard(int boardNo) {
        // 전체 게시물 조회
        // 게시물 번호와 일치하는 게시물 조회
        // ->일치하는 게시물이 있는경우 삭제
        // 결과 출력(successPage())
        boolean found = false;

        for (BoardDTO b : boardList) {
            if (b.getBoardNo() == boardNo) {
                boardList.remove(b);
                resultPrinter.successPage("deleteBoard");
                found = true;
                break;
            }
        }
        if (!found) {
            resultPrinter.errorPage("deleteBoard");
        }
    }

    ///* 제목으로 조회 */
    public void searchBoard(String title) {
        // 전체 게시물 조회
        // 검색 결과를 담을 리스트 생성
        // 제목을 포함하고 있는 게시물을 결과 리스트에 저장
        // 검색결과 리스트가 비어있는 경우 에러 출력, 비어 있지 않은 경우 결과 출력
        boolean found = false;

        for (BoardDTO b : boardList) {
            if (b.getBoardTtile().contains(title)) {
                System.out.println(b);
                resultPrinter.successPage("searchBoard");
                found = true;
                break;
            }
        }
        if (!found) {
            resultPrinter.noSearchResult();

        }
    }
    //
    ///* 정렬 처리용 메소드 */
    public void sortList(Comparator<BoardDTO> c) {
        // 리스트 전체 조회
        // 정렬
        // 출력
        boardList.sort(c);
        resultPrinter.printAllList(boardList);
    }
}


