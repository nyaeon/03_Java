package com.ohgiraffers.section02.looping;

public class Application {

    public static void main(String[] args) {
        //A_for a = new A_for();
        //a.testSimpleForStatement();

        //A_nestedFor b = new B_nastedFor();

        //b.printStarInputRowTimes();
        B_while b_while = new B_while();
        //b_while.testSimpleWhileStatement();
        b_while.testWhileExample();

        D_dowhile d_while = new D_dowhile();
        //d_while.testSimpleDoWhileStatement();
        d_while.testDoWhile();
    }
}
