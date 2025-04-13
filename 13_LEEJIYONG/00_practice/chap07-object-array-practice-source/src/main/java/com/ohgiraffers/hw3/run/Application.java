package com.ohgiraffers.hw3.run;

import com.ohgiraffers.hw3.controller.ProductController;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        ProductController controller = new ProductController(10, new Scanner(System.in));

        controller.mainMenu();
    }
}
