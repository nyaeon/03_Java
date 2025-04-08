package com.ohgiraffers.section04.parameter;

import java.util.Arrays;

public class Parametertest {
public void testPrimitivetypeparameter(int num) {
   // num =10;
    System.out.println("매개변수로 전달받은 값 :" +num);
}
public void testPrimitivetypeparameter(int[] iArr) {
    iArr[0] =100;
    System.out.println("매개변수 전달받은 값: "+ Arrays.toString(iArr));
}
public void testPrimitivetypeparameter(Rectangle r) {
    r.calarea();
    r.calround();

}
public void testvariablelengthArrayparamenter(String... str){
    System.out.println("str = "+ Arrays.toString(str));


}
}
