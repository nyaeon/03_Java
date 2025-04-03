package com.ohgiraffers.hw1.model.view;

import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Arrays;
import java.util.Scanner;

public class LibraryMenu {

    private final LibraryManager lm = new LibraryManager();

    Scanner sc = new Scanner(System.in);

    public void mainMenu() {

        System.out.println("------ Welcome to the Library Manager ------");
        System.out.println("Please enter the name: ");
        String name = sc.nextLine();

        System.out.println("Please enter the age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Please enter the gender: ");
        char gender = sc.next().charAt(0);

        Member member = new Member(name, age, gender);
        lm.insertMember(member);
        System.out.println(member);


        while(true) {
            System.out.println("\n---- Menu ----");
            System.out.println("1. My page");
            System.out.println("2. Display all books");
            System.out.println("3. Search books");
            System.out.println("4. Rent books");
            System.out.println("0. Exit");

            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 1:
                    System.out.println("Here's the User information: ");
                    System.out.println("\n" + lm.myInfo());
                    break;
                case 2:
                    System.out.println("Here's the Book information: ");
                    System.out.println("\n" + Arrays.toString(lm.getbList()));
                    break;
//                case 3:
//                    System.out.println("Plase enter the title: ");
//                    String title = sc.nextLine();
//                    System.out.println(searchBook());

            }

        }




    }

    public void selectAll() {
        Book[] bList = lm.selectAll();
        for (int i = 0; i < bList.length; i++) {
            System.out.println(bList[i]);
        }

    }

    public void searchBook() {}

    public void rentBook() {}


}
