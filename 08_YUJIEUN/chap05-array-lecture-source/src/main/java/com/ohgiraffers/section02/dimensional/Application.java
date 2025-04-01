package com.ohgiraffers.section02.dimensional;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        // 자료형[][]  변수명 =   new  자료형[할당할 배열의 갯수][항당할 배열의 길이];

        int [][] iArr1;
        int [] iArr2[];   // 추천 x
        int iArr3[][];    // 추천 x

        iArr1 = new int[3][2]; // 정변 배열을 위한 선언(관리하는 1차원 배열의 길이가 동일)
        iArr2 = new int[3][]; // 가변 배열을 위한 선언(관리하는 1차원 배열의 길이가 다를 시)
//        iArr3 = new int[][]; // 컴파일 에러 발생

        // Arrays.toString() 1차원 배열만 확인 가능
        System.out.println(Arrays.toString(iArr1));
        System.out.println(Arrays.toString(iArr2));


        int num = 0;
        for(int i=0; i<iArr1.length; i++) {//iAee1.length =>3

            System.out.println("iArr1[" + i + "] = " +iArr1[i]);
            for(int j=0; j<  iArr1[i].length; j++) { //iArr[i].length =>2
                iArr1[i][j] = num++;
            }
            System.out.println(Arrays.toString(iArr1[i]));

        }


        iArr2[0] = new int[]{1,2,3};

        for( int i=0; i<  iArr2[0].length; i++) {
            System.out.println(Arrays.toString(iArr2[i]));
        }

    }


}
