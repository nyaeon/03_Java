package homeworlkl.section01.coll1;

import homeworlkl.section01.coll1.model.AscCa;
import homeworlkl.section01.coll1.model.DescCa;

import java.util.ArrayList;

public class BookManger {
    private ArrayList<BookDTO> bookList;
    public void BookManger() {
    bookList = new ArrayList<BookDTO>();
    }
    public void addBook(BookDTO book) {
     bookList.add(book);

    }

    public void deleteBook(int index) {
        bookList.remove(index);
    }

    public int searchBook(String title) {
        int result = -1;
        for (int i =0; i< bookList.size(); i++) {
            if (bookList.get(i).getTitle().equals(title)) {
                result = i;
                break;
            }
        }
        return result;

    }

    public void printBook (int index){
       if (index == -1){
           System.out.println("그런 책은 없음");
       }else {
               System.out.println(bookList.get(index));

       }
    }

    public void displayAll() {
        if(bookList.isEmpty()){
            System.out.println("출력핧 도서가 없음");
        }else {
            for (int i =0; i<bookList.size(); i++){
                System.out.println(bookList.get(i));
            }
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select) {
        if (select == 1) {

            bookList.sort(new AscCa());
        }else {
            bookList.sort(new DescCa());
        }
        return bookList;
    }

    public void printBookList(ArrayList<BookDTO> br) {
        for (BookDTO bk : br) {
            System.out.println(bk);
        }
    }
}
