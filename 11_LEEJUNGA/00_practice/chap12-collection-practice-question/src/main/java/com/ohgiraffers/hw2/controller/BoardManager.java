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
        b.setBoardNo(0);

        // 조회내역이 있는 경우
        //        - 조회된 내역이 있는 경우 새로운 리스트 생성
        //        - 글 번호를 1로 변경
        // 조회내역이 없는 경우
        //        - 조회 내역이 있는 경우 기존 리스트의 마지막 인덱스의 글번호 조회


        if (boardList == null) {
            // 게시글이 하나도 없을 때 리스트 생성 후 글 번호 1로 변경
            boardList = new ArrayList<>();
            b.setBoardNo(1);
        } else {
            // 게시글이 있을 경우 마지막 게시글 번호 + 1
            BoardDTO lastB = boardList.get(boardList.size() - 1);
            b.setBoardNo(lastB.getBoardNo() + 1);
        }

        // 게시물 등록
        boardList.add(b);

        // 출력값 결정(successPage)
        rp.successPage("insertBoard");
    }

    /* 게시글 전체 조회용 메소드 */
    public void selectAllList() {
        // 게시글 전체 조회 후 전체 출력 (printAllList() 이용)
        rp.printAllList(boardList);
    }

    /* 게시물 1개 조회용 메소드 */
    public void selectOneBoard(int boardNo) {
        // 전체 게시물을 조회
        // 조회에 성공하면 게시물 번호와 일치하는 게시물을 리스트에서 탐색
        // 조회성공 시 조회수 1증가
        // 일치하는 내용이 있으면 게시물 출력

        if (boardList == null || boardList.isEmpty()) {
            // 일치하는 게시물이 없으면 에러출력
            rp.errorPage("selectOne");
            return;
        }

        for (BoardDTO b : boardList) {
            if (b.getBoardNo() == boardNo) {
                System.out.println(b);
                b.setReadCount(b.getReadCount() + 1);
                return;
            }
        }
    }

    /* 게시물 제목 변경용 메소드 */
    public void updateBoardTitle(int boardNo, String title) {
        // 전체 리스트 조회
        // 일치하는 게시물 조회
        //        조회 결과가 있는 경우 제목 수정 (
        // 결과 출력(successPage)

        if (boardList == null || boardList.isEmpty()) {
            rp.errorPage("updateTitle");
            return;
        }

        for (BoardDTO b : boardList) {
            if (b.getBoardNo() == boardNo) {
                b.setBoardTtile(title);
                rp.successPage("updateTitle");
                return;
            }
        }
    }

    /* 게시물 내용 변경용 메소드 */
    public void updateBoardContent(int boardNo, String content) {
        // 전체 리스트 조회
        // 일치하는 게시물 조회
        //        조회 결과가 있는 경우 내용 수정 (
        //                수정 후 다시 파일에 저장
        // 결과 출력(successPage)

        if (boardList == null || boardList.isEmpty()) {
            rp.errorPage("updateContent");
            return;
        }

        for (BoardDTO b : boardList) {
            if (b.getBoardNo() == boardNo) {
                b.setBoardContent(content);
                rp.successPage("updateContent");
                return;
            }
        }
    }

    /* 게시물 삭제용 메소드 */
    public void deleteBoard(int boardNo) {
        // 전체 게시물 조회
        // 게시물 번호와 일치하는 게시물 조회
        // ->일치하는 게시물이 있는경우 삭제
        // 결과 출력(successPage())

        if (boardList == null || boardList.isEmpty()) {
            rp.errorPage("deleteBoard");
            return;
        }

        for (BoardDTO b : boardList) {
            if (b.getBoardNo() == boardNo) {
                boardList.remove(b);
                rp.successPage("deleteBoard");
                return;
            }
        }
    }

    /* 제목으로 조회 */
    public void searchBoard(String title) {
        // 전체 게시물 조회
        // 검색 결과를 담을 리스트 생성
        // 제목을 포함하고 있는 게시물을 결과 리스트에 저장

        if (boardList == null || boardList.isEmpty()) {
            rp.errorPage("selectOne");
            return;
        }

        ArrayList<BoardDTO> result = new ArrayList<>();
        for (BoardDTO b : boardList) {
            if (b.getBoardTtile().contains(title)) {
                result.add(b);
            }
        }

        // 검색결과 리스트가 비어있는 경우 에러 출력, 비어 있지 않은 경우 결과 출력
        // -> printAllList 에서 처리됨
        rp.printAllList(result);
    }

    /* 정렬 처리용 메소드 */
    public void sortList(Comparator<BoardDTO> c) {
        // 리스트 전체 조회
        // 정렬
        // 출력

        if (boardList == null || boardList.isEmpty()) {
            rp.errorPage("selectOne");
            return;
        }

        boardList.sort(c);
        rp.printAllList(boardList);
    }

}
