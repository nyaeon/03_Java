package com.ohgiraffers.hw2.controllor;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import com.ohgiraffers.hw2.view.ResultPrinter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class BoardManager {

    private ArrayList<BoardDTO> boardList = new ArrayList<>();
    private ResultPrinter resultPrinter = new ResultPrinter();
    private int boardNoCount = 1; // 게시글 번호 자동 생성을 위한 카운터


    /* 새 게시글 등록용 메소드 */
    public void insertBoard(BoardDTO b){
        // 글번호 0으로 초기화
        // 조회내역이 있는 경우 - -
        //        조회된 내역이 있는 경우 새로운 리스트 생성
        //        글 번호를 1로 변경
        // 조회내역이 없는 경우 -
        //        조회 내역이 있는 경우 기존 리스트의 마지막 인덱스의 글번호 조회
        // 출력값 결정(successPage)
        b.setBoardNo(boardNoCount++); // 글 번호 자동 부여 및 카운터 증가
        b.setBoardDate(new Date()); // 현재 날짜 설정
        boardList.add(b);
        resultPrinter.successPage("insertBoard");//왜 이러는지 모르겠음
    }

    /* 게시글 전체 조회용 메소드 */
    public void selectAllList(){
        // 게시글 전체 조회 후 전체 출력 (printAllList() 이용)
        if (boardList.isEmpty()){
            resultPrinter.printAllList(boardList);//없으면 "게시물이 없습니다."
        } else {
            resultPrinter.printAllList(boardList);
        }
    }


    /* 게시물 1개 조회용 메소드 */
    public void selectOneBoard(int boardNo){
        // 전체 게시물을 조회
        // 조회에 성공하면 게시물 번호와 일치하는 게시물을 리스트에서 탐색
        // 조회성공 시 조회수 1증가
        // 일치하는 게시물이 없으면 에러출력,
        // 일치하는 내용이 있으면 게시물 출력
        BoardDTO selectedBoard = null;
        for (BoardDTO b : boardList){
            if (b.getBoardNo() == boardNo){
                selectedBoard = b;
                break;
            }
        }

        if (selectedBoard != null){
            selectedBoard.setReadCount(selectedBoard.getReadCount() + 1);//조회수 증가
            ArrayList<BoardDTO> singleBoardList = new ArrayList<>();
            singleBoardList.add(selectedBoard);
            resultPrinter.printBoard(singleBoardList);
        } else {
            resultPrinter.errorPage("selectOneBoard");
        }
    }

    /* 게시물 제목 변경용 메소드 */
    public void updateBoardTitle(int boardNo, String title) {
        // 전체 리스트 조회

        // 일치하는 게시물 조회
        //        조회 결과가 있는 경우 제목 수정 (
        // 결과 출력(successPage)
        boolean updated = false;
        for (BoardDTO b : boardList){
            if (b.getBoardNo() == boardNo){
                b.setBoardTitle(title);
                updated = true;
                break;
            }
        }

        if (updated){
            resultPrinter.successPage("updateTitle");
        } else {
            resultPrinter.errorPage("updateTitle");
        }
    }

    /* 게시물 내용 변경용 메소드 */
    public void updateContent(int boardNo, String content) {
        // 전체 리스트 조회
        // 일치하는 게시물 조회
        //        조회 결과가 있는 경우 내용 수정 (
        //                수정 후 다시 파일에 저장
        // 결과 출력(successPage)
        boolean updated = false;
        for (BoardDTO b : boardList){
            if (b.getBoardNo() == boardNo){
                b.setBoardContent(content);
                updated = true;
                break;
            }
        }

        if (updated){
            resultPrinter.printBoard(boardList);
        } else {
            resultPrinter.errorPage("updateContent");
        }

    }

    /* 게시물 삭제용 메소드 */
    public void deleteBoard(int boardNo) {
        // 전체 게시물 조회
        // 게시물 번호와 일치하는 게시물 조회
        //       ->일치하는 게시물이 있는경우 삭제
        // 결과 출력(successPage())
        boolean deleted = false;
        for(int i=0; i<boardList.size(); i++){
            if (boardList.get(i).getBoardNo() == boardNo){
                boardList.remove(i);
                deleted = true;
                break;
            }
        }

        if (deleted){
            resultPrinter.successPage("updateContent"); //꼭 성공용메세지만 오류남
        } else {
            resultPrinter.errorPage("deleteBoard");
        }
    }

    /* 제목으로 조회 */
    public void searchBoard(String title) {
        // 전체 게시물 조회
        // 검색 결과를 담을 리스트 생성
        // 제목을 포함하고 있는 게시물을 결과 리스트에 저장
        // 검색결과 리스트가 비어있는 경우 에러 출력, 비어 있지 않은 경우 결과 출력
        ArrayList<BoardDTO> searchResult = new ArrayList<>();
        for (BoardDTO b : boardList){
            if (b.getBoardTitle().equals(title)){
                searchResult.add(b);
            }
        }
        if (searchResult.isEmpty()){
            resultPrinter.errorPage("searchBoard"); // 에러 메세지 추가 필요
        } else {
            resultPrinter.printBoard(searchResult);
        }
    }

    /* 정렬 처리용 메소드 */
    public void sortList(Comparator<BoardDTO> c) {
        // 리스트 전체 조회
        // 정렬
        // 출력
        if(!boardList.isEmpty()){
            boardList.sort(c);
            resultPrinter.printBoard(boardList);
        } else {
            resultPrinter.printAllList(boardList);//"게시물이 없습니다." 출력
        }
    }

}
