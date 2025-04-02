package com.ohgiraffers.section01.level02.normal;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Application6 {

    public static void main(String[] args) {

        /*
         * 사용자가 입력한 값이 배열에 있는지 검색하여
         * 있으면 "OOO 치킨 배달 가능", 없으면 "OOO 치킨은 없는 메뉴입니다."를
         * 출력하세요.
         * 단, 치킨메뉴가 들어가 있는 배열은 본인이 스스로 정하세요
         *
         * ex.
         * 치킨 이름을 입력하세요 : 양념     치킨 이름을 입력하세요 : 불닭
         * 양념치킨 배달 가능              불닭치킨은 없는 메뉴입니다.
         * */

        String[] chicken = new String[] {"후라이드", "핫후라이드", "양념", "파닭", "간장", "마늘", "뿌링클", "불닭", "굽네", "옛날통닭"};
        Scanner sc = new Scanner(System.in);
        System.out.print("치킨 이름을 입력하세요 : ");
        String str = sc.nextLine();

        for (int i = 0; i < chicken.length; i++) {
            if (chicken[i].equals(str)) {
                System.out.println(chicken[i] + " 치킨 배달 가능");
                break;
            } else {
                System.out.println(str + " 치킨은 없는 메뉴입니다.");
            }
        }






    }
}
