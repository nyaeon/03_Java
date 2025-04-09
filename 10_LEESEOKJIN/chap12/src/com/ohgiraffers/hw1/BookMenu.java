package com.ohgiraffers.hw1;

import java.util.Scanner;

public class BookMenu {
    BookManager manager = new BookManager();
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("*** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서 정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");
            System.out.print("> ");

            int choice = scanner.nextInt(); scanner.nextLine();
            switch (choice) {
                case 1 -> manager.addBook(inputBook());
                case 2 -> printSortedBookList();
                case 3 -> deleteBook();
                case 4 -> searchBook();
                case 5 -> {
                    manager.displayAll();
                    waitForContinue();
                }
                case 6 -> { return; }
            }

            System.out.println();
        }
    }

    private BookDTO inputBook() {
        System.out.print("도서 번호: ");
        var bNo = scanner.nextInt(); scanner.nextLine();

        System.out.print("도서 제목: ");
        var title = scanner.nextLine();

        System.out.print("도서 분류 (1:인문 / 2:자연과학 / 3:의료 / 4:기타): ");
        var category = scanner.nextInt(); scanner.nextLine();

        System.out.print("도서 저자: ");
        var author = scanner.nextLine();

        return new BookDTO(bNo, category, title, author);
    }

    private void printSortedBookList() {
        System.out.print("정렬 방식 선택 (1:오름차순 / 2:내림차순): ");
        var orderBy = scanner.nextInt(); scanner.nextLine();
        try {
            var descending = switch (orderBy) {
                case 1 -> false;
                case 2 -> true;
                default -> throw new IllegalArgumentException();
            };
            BookManager.printBookList(manager.getSortedBookList(descending));
        } catch (IllegalArgumentException e) {
            System.out.println("잘못된 입력입니다.");
        }
        waitForContinue();
    }

    private void deleteBook() {
        System.out.print("삭제할 도서의 인덱스: ");
        var index = scanner.nextInt(); scanner.nextLine();
        try {
            manager.deleteBook(index);
            System.out.println("성공적으로 삭제했습니다.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("존재하지 않는 도서입니다.");
        }
        waitForContinue();
    }

    private void searchBook() {
        System.out.print("검색할 도서 제목: ");
        var title = scanner.nextLine();
        var index = manager.searchBook(title);
        if (index != -1) {
            manager.printBook(index);
        } else {
            System.out.println("일치하는 도서가 존재하지 않습니다.");
        }
        waitForContinue();
    }

    private void waitForContinue() {
        System.out.print("계속...");
        scanner.nextLine();
    }
}
