package homeworlkl.section01.section02;

import homeworlkl.section01.coll1.BookDTO;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BoardManager {
        private ArrayList<BoardDTO>  boardList;
        private ResultPrinter rp = new ResultPrinter();
public void insertBoard(BoardDTO board) {
        int no =0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter board title: ");
        String boardTitle = scan.nextLine();
        switch(boardTitle) {
        case "1":break;
        default:break;
        }
       // System.out.print(succesPage);
}
public void selectAllList(){
  //  ArrayList<BoardDTO> board1 = new boardAllList();
  // for(BoardDTO board : board1) {
  //     System.out.println(board);
  // }
}

public void selectOneBoard(int boardNo){
        selectAllList();
        if (board.get(boardNo) != null) {
            System.out.println(board.get(boardNo));
            //조회 수++;
        }else {
            System.out.println("일치 여부 없음+");
        }
}
public void updateBoardTitle(int boardNo, String title){
 //   int result = selectOneBoard(get.boardNo);
 //   if (result == 1) {
 //       System.out.println(board.get(boardNo));
 //       return;
 //   }
    System.out.println("없음");
}
public void deleteBoard(int boardNo){
    selectAllList();
}
}
