package homeworlkl.section01.coll1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class BookMenu {

    Scanner scanner = new Scanner(System.in);
    private BookManger booklist = new BookManger();
    public void menu() {

        do{
            System.out.println("""
                    ====도서 관리 프로그램 ===
                    1.도서 추가
                    2.정렬 후 출력 
                    3.삭제
                    4.검색
                    5.전체 출력
                    6.종료
                    메뉴 선택 :
                    """);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: booklist.addBook(inputBook());
                break;
                case 2:
                    System.out.print("정렬 방식 (1. 오름차순 2.내림차순) : ");
                    int select = scanner.nextInt();
                    if (select == 1 || select == 2) {
                        booklist.printBookList(booklist.sortedBookList(select));
                    }else {
                        System.out.println("잘못된 접근");
                    }break;
                    case 3:
                        System.out.print("삭제 도서 :");
                        int rm = scanner.nextInt();
                        booklist.deleteBook(rm);
                        break;
                        case 4:
                            booklist.printBook(booklist.searchBook(inputBookTitle()));
                            break;
                        case 5:
                            booklist.displayAll();
                            break;
                        case 6:
                            System.out.print("끝내기 (y,n) : ");
                            char aw = scanner.next().charAt(0);
                            if (aw == 'y') {
                                System.out.println("종료");
                                return;
                            }else System.out.println("재선택");
                            break;
                            default:
                                System.out.println("다시 선택해주세여");
            }
        }while (true);
    }

    public BookDTO inputBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("내용 입력 ");
        System.out.print("도서 번호 :");
        int bNO = sc.nextInt();
        System.out.print("1.인문 2.자연과학 3.의료 4.기타 :");
        String category = sc.nextLine();
        System.out.print("책 제목 :");
        String title = sc.nextLine();
        System.out.print("저자 :");
        String author = sc.nextLine();



        return new BookDTO(bNO,category,title,author);
      //  BookDTO book = new BookDTO();
      //  System.out.println("번호 : ");
      //  book.setbNO(book.getbNO());
      //  System.out.println("제목 : ");
      //  book.setTitle(scanner.nextLine());
      //  //book.setCategory(book.getCategory());
      //  System.out.println("장르 : ");
      //  book.setCategory(scanner.nextInt());
      //  System.out.println("저자 : ");
      //  book.setAuthor(scanner.nextLine());
      //      return book;
    }

    public String inputBookTitle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("확인할 도서명");
        System.out.println("제목 :");
        return sc.nextLine();
        // inputBook.setTitle(BookDTO);
       // book1.getTitle(from(inputBook()));
      //  System.out.println(booklist.size());
      //  return null;
    }

}
