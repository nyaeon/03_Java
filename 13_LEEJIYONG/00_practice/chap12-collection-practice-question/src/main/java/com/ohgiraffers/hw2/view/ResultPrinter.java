package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import java.util.ArrayList;

public class ResultPrinter {

    public void printAllList(ArrayList<BoardDTO> list) {
        if (list.isEmpty()) {
            System.out.println("게시물이 없습니다.");
            return;
        }
        for (BoardDTO board : list) {
            System.out.println(board);
        }
    }

    public void printBoard(BoardDTO b) {
        System.out.println(b);
    }

    public void errorPage(String msg) {
        if (msg.equals("insertBoard")) {
            System.out.println("게시물 등록 실패");
        } else if (msg.equals("selectOne")) {
            System.out.println("조회된 글이 없습니다.");
        } else if (msg.equals("updateTitle")) {
            System.out.println("게시물 제목 수정 실패!");
        } else if (msg.equals("updateContent")) {
            System.out.println("게시글 내용 수정 실패!");
        } else if (msg.equals("deleteBoard")) {
            System.out.println("게시글 삭제 실패!");
        }
    }

    public void successPage(String msg) {
        if (msg.equals("insertBoard")) {
            System.out.println("게시물 등록 성공!");
        } else if (msg.equals("updateTitle")) {
            System.out.println("게시물 제목 수정 성공!");
        } else if (msg.equals("updateContent")) {
            System.out.println("게시글 내용 수정 성공!");
        } else if (msg.equals("deleteBoard")) {
            System.out.println("게시물 삭제 성공!");
        }
    }

    public void noSearchResult() {
        System.out.println("검색 결과가 없습니다.");
    }
}
