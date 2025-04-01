package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cec8712 (왜 안돼~~)

//import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;
//import static com.ohgiraffers.section01.method.Calculator.minNumberOf;
import static com.ohgiraffers.section01.method.Calculator.*;

public class Application2 {

    public static void main(String[] args) {

        // non-static method
<<<<<<< HEAD
=======
public class Application2 {
    public static void main(String[] args) {

>>>>>>> a8fb790 (수정4)
=======
>>>>>>> cec8712 (왜 안돼~~)
        Calculator cal = new Calculator();
        int result = cal.plusTwoNumbers(10, 20);
        System.out.println("result = " + result);

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cec8712 (왜 안돼~~)
        int result2 = maxNumberOf(10, 20);
        System.out.println("result2 = " + result2);

        com.ohgiraffers.section02.package_and_import.test.Calculator cal2
                = new com.ohgiraffers.section02.package_and_import.test.Calculator();

        int result3 = maxNumberOf(10, 20);
        int result4 = minNumberOf(20, 30);

<<<<<<< HEAD
=======
        int result2 = cal.plusTwoNumbers(10, 20);
        System.out.println("result2 = " + result);

        com.ohgiraffers.section02.package_and_import.test.Calculator Cal2
                = new com.ohgiraffers.section02.package_and_import.test.Calculator();

        int result3 = cal.maxNumberOf(10, 20);
        int result4 = cal.minNumberOf(20, 30);
>>>>>>> a8fb790 (수정4)
=======
>>>>>>> cec8712 (왜 안돼~~)
    }
}
