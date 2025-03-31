package com.ojgiraffers.section02.looping;

import com.ojgiraffers.section02.D_doWhile;

public class Application {
    public static void main(String[] args) {
        A_for a= new A_for();
//        a.testSimpleForStatement();
//        a.test1();
//        a.test2();
//        a.test3();
        A_nestedFor b = new A_nestedFor();
//        b.printGugudanFromToNine();
//        b.printTriangleSters();
        B_while c = new B_while();
//        c.testSimpleWhileStatement();
        D_doWhile d = new D_doWhile();
//        d.testSimpleDoWhileStatement();
        d.testDoWhile();
   }
}
