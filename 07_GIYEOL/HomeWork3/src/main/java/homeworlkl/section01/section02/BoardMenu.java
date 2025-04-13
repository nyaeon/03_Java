package homeworlkl.section01.section02;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/*1. 게시글 쓰기   // insertBoard(inputBoard()이 리턴한 객체) 실행
 2. 게시글 전체보기       // selectAllList() 실행
 3. 게시글 한 개보기     // selectOneBoard(inputBoardNo()) 실행
 4. 게시글 제목 수정    // updateBoardTitle(inputBoardNo(),inputBoardTitle()) 실행
 5. 게시글 내용 수정    // updateBoardContent(inputBoardNo(),inputBoardContent()) 실행
 6. 게시글 삭제       // deleteBoard(inputBoardNo()) 실행
     7. 게시글 제목 검색   // searchBoard(inputBoardTitle()) 실행
     8, 정렬하기           // sortSubMenu() 실행*/
public class BoardMenu {
    public void mainMenu(){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("""
                ====서비스 프로그램 ====
                1.게시글쓰기
                2.게시글 전체보기
                3.게시글 한 개 보기
                4.게시글 제목 수정
                5.게시글 내용 수정
                6.게시글 삭제
                7.게시글 제목 검색
                8.정렬
                9.끝내기
                메뉴 선택 :
                """);
        ArrayList<BoardDTO> br = new ArrayList<>();

    }
    public void sortSubmenu(){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("""
                =====게시글 정렬 메뉴 ====
                1. 글번호순 오름차순 정렬 // sortList(AscBoardNo())\s
                2. 글번호순 내림차순 정렬 // sortList(DescBoardNo())\s
                3. 작성날짜순 오름차순 정렬 // sortList(AscBoardDate())\s
                4. 작성날짜순 내림차순 정렬// sortList(DescBoardDate())\s
                5. 글제목순 오름차순 정렬 // sortList(AscBoardTitle())\s
                6. 글제목순 내림차순 정렬 // sortList(DescBoardTitle())\s
                7. mainMenu()메소드로 이동
                메뉴 입력 :
                """);

    }
    public class inputBoard{
        public BoardDTO inputboard(){
            Scanner scan = new Scanner(System.in);
            int boardNo = scan.nextInt(inputboard().getBoardNo());
            Date date = new Date();
            return new BoardDTO();
        }
        public int inputBoardTitle(){
            Scanner scan = new Scanner(System.in);
            int boardtitle = scan.nextInt(inputBoardTitle());
            return boardtitle;
        }
        public String inputBoardContent(){
            Scanner scan = new Scanner(System.in);
            String boardContent = scan.nextLine();
            return boardContent;
        }
    }
    





}
