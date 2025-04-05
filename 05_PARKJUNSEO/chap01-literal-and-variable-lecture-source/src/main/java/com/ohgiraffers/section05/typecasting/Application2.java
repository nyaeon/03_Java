package com.ohgiraffers.section05.typecasting;
public class Application2 {
    public static void main(String[] args) {

        /* 1. 정수 끼리의 강제 형변환 */
        long lnum = 8000000000000L;
        //int inum = lnum;			  //데이터 손실 가능성을 컴파일러가 알려준다. (에러남)
        int inum = (int) lnum;		//변경하려는 자료형을 명시하여 강제 형변환을 해야 함

        short snum = (short) inum;
        byte bnum = (byte) snum;

        System.out.println(inum);

        /* 2. 실수 끼리의 강제 형변환 */
        double dnum = 8.0;
        //float fnum = dnum;			//데이터 손실 가능성을 컴파일러가 알려준다. (에러남)
        float fnum = (float) dnum;

        System.out.println(fnum);
    }
}
