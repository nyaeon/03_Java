package com.ohgiraffers.section02.variable;

public class Application2 {
    public static void main(String[] args){

        // 1. 정수를 취급하는 변수에 값 대입
        byte bnum = 1;
        short snum = 2;
        int inum = 4;
        //long lnum = 8;			//아무 문제 없는 것 같지만 사실 뒤에 대문자 L을 붙여야 한다. 그 이유는 뒤에 형변환에서 다루게 될 것이다.
        long lnum = 8L;			  //소문자로 'l'을 써도 되지만 글꼴에 따라 숫자 1과 혼선이 빚어질 수 있어서 대문자로 하는 것이 권장이다.

        System.out.println("bnum의 값 : " + bnum);
        System.out.println("snum의 값 : " + snum);
        System.out.println("inum의 값 : " + inum);
        System.out.println("lnum의 값 : " + lnum);

        // 2. 실수를 취급하는 변수에 값 대입
        //float fnum = 4.0;		  //실수 형태의 값을 fnum에 사용하는 것은 불가능하다.
        float fnum = 4.0f;		  //실수 뒤에 'f'를 붙여야 한다. 대문자 'F'도 가능하지만 소문자를 사용하는 것이 일반적이다.
        double dnum = 8.0;

        System.out.println("fnum의 값 : " + fnum);
        System.out.println("dnum의 값 : " + dnum);

        // 3. 문자를 취급하는 변수에 값 대입
        char ch = 'a';			//문자 형태의 값을 저장할 수 있다.
        char ch2 = 97;			//'a'는 97이라는 숫자이다. 그래서 숫자로도 저장할 수 있다.

        System.out.println("ch의 값 : " + ch);
        System.out.println("ch2의 값 : " + ch2);

        // 4. 논리를 취급하는 변수에 값 대입
        boolean isTrue = true;
        isTrue = false;		//true 혹은 false 중 한 가지의 값만 사용 가능하다.

        System.out.println("isTrue의 값 : " + isTrue);

        String str = "안녕하세요";

        System.out.println("str의 값 : " + str);

        // 5. **문자열을 취급하는 변수에 값 대입**
       //  String str = "안녕하세요";

        System.out.println("str의 값 : " + str);
    }
}
