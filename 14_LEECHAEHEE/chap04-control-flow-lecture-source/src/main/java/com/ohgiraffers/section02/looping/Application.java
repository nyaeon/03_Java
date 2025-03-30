package com.ohgiraffers.section02.looping;

public class Application {
    public static void main(String[] args) {
        A_for a = new A_for();
//        a.testSimpleForStatement();

        A_nestedFor a2 = new A_nestedFor();
//       a2.printGugudanFromTwoToNine();
//       a2.printStarInputRowTimes();

        B_while b = new B_while();
//        b.testSimpleWhileStatement();
//        b.testWhileExample();

        D_doWhile d = new D_doWhile();
//        d.testSimpleDoWhileStatement();
        d.testDoWhile();
    }
}
