package com.ohgiraffers.hw2.controller;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import com.ohgiraffers.hw2.view.ResultPrinter;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class BoardManager {

    private ArrayList<BoardDTO> boardList;
    private ResultPrinter rp;

    /* 새 게시글 등록용 메소드 */ //새 게시글 등록용 메소드 boardList객체에 추가
    public void insertBoard(BoardDTO b) {

        if(boardList == null) {
            boardList = new ArrayList<>();
        }

        // 글번호 0으로 초기화
        b.setBoardNo(0);

        // 조회내역이 있는 경우
            //- 조회된 내역이 있는 경우 새로운 리스트 생성
            //- 글 번호를 1로 변경
        // 조회내역이 없는 경우
            //- 조회 내역이 있는 경우 기존 리스트의 마지막 인덱스의 글번호 조회
       int newBoardNo = boardList.isEmpty() ? 1
               : boardList.get(boardList.size()-1).getBoardNo()+1;
       b.setBoardNo(newBoardNo);
       boardList.add(b);

        // 출력값 결정(successPage)
        if(rp == null){
            rp = new ResultPrinter();
        }
        rp.successPage("insertBoard");

    }

    /* 게시글 전체 조회용 메소드 */
    public void selectAlllist(){
        // 게시글 전체 조회 후 전체 출력 (printAllList() 이용)

        if(rp == null){
            rp = new ResultPrinter();
        }
        rp.printAllList(boardList);

    }

    /* 게시물 1개 조회용 메소드 */
    public void selectOneBoard(int boardNo){

        if(rp == null){
            rp = new ResultPrinter();
        }
        // 전체 게시물을 조회

        // 일치하는 게시물이 없으면 에러출력,


        boolean found = false;
        // 조회성공 시 조회수 1증가
        for(BoardDTO b : boardList) {
        // 조회에 성공하면 게시물 번호와 일치하는 게시물을 리스트에서 탐색
            if(boardNo == b.getBoardNo()) {
                // 조회성공 시 조회수 1증가
                b.setReadCount(b.getReadCount()+1);
                // 일치하는 내용이 있으면 게시물 출력
                rp.printBoard(b);
                found = true;
                break;
            }
        }


        if(found){
            rp.successPage("selectOneBoard");
        }else {
            rp.errorPage("selectOneBoard");
        }


    }

    /* 게시물 제목 변경용 메소드 */
    public void updateBoardTitle (int boardNo, String title){

        if(rp == null){
            rp = new ResultPrinter();
        }

        boolean found = false;
        // 전체 리스트 조회
        for(BoardDTO b : boardList) {
        // 일치하는 게시물 조회
        // 조회 결과가 있는 경우 제목 수정 (
            if(b.getBoardNo() == boardNo) {
                b.setBoardTitle(title);
                found = true;
                break;
            }
        }

        // 결과 출력(successPage)
        if(found){
            rp.successPage("updateBoardTitle");
        }else {
            rp.errorPage("updateBoardTitle");
        }



    }

    /* 게시물 내용 변경용 메소드 */
    public void updateBoardContent(int boardNo, String content){

        if(rp == null){
            rp = new ResultPrinter();
        }
        // 전체 리스트 조회
        // 일치하는 게시물 조회

        boolean found = false;
        for(BoardDTO b : boardList) {
        //        조회 결과가 있는 경우 내용 수정 (
            if(b.getBoardNo() == boardNo) {
                b.setBoardContent(content);
                found = true;
                break;
            }
        //                수정 후 다시 파일에 저장

        }
        // 결과 출력(successPage)
        if(found) {
            rp.successPage("updateBoardContent");
        } else {
            rp.errorPage("updateBoardContent");
        }

    }

    /* 게시물 삭제용 메소드 */
    public void deleteBoard(int boardNo){
        if(rp == null){
            rp = new ResultPrinter();
        }

        boolean found = false;
        // 전체 게시물 조회
        boolean removed = boardList.removeIf(b -> b.getBoardNo() == boardNo);
        // 게시물 번호와 일치하는 게시물 조회

        //->일치하는 게시물이 있는경우 삭제
        // 결과 출력(successPage())
        if(removed) {
            rp.successPage("deleteBoard");
        } else {
            rp.errorPage("deleteBoard");
        }



    }

    /* 제목으로 조회 */
    public void searchBoard(String title){
        if(rp == null){
            rp = new ResultPrinter();
        }

        ArrayList<BoardDTO> searchResult = new ArrayList<>();
        // 전체 게시물 조회
        for(BoardDTO b : boardList) {
            if(b.getBoardTitle().equalsIgnoreCase(title)){
                searchResult.add(b);
            }

        }

        if(searchResult.isEmpty()){
            rp.noSearchResult();
            rp.errorPage("searchBoard");
        } else {
            rp.printAllList(searchResult);
            rp.successPage("searchBoard");
        }

        // 검색 결과를 담을 리스트 생성
        // 제목을 포함하고 있는 게시물을 결과 리스트에 저장
        // 검색결과 리스트가 비어있는 경우 에러 출력, 비어 있지 않은 경우 결과 출력



    }

    /* 정렬 처리용 메소드 */
    public void sortList(Comparator<BoardDTO> c){
        if(rp == null){
            rp = new ResultPrinter();
        }

        // 리스트 전체 조회
        if(boardList != null && !boardList.isEmpty()){
            boardList.sort(c);
        }
            // 정렬

        rp.printAllList(boardList);

        // 출력

    }
}
