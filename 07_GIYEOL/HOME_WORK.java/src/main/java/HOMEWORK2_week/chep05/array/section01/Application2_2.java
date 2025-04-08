package HOMEWORK2_week.chep05.array.section01;

import java.util.Scanner;

public class Application2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민등록 번호 입력:");
        String id = sc.nextLine();
        String num = id.substring(0,8)+ "-";
        num += id.substring(9,10)+ "**********";
        System.out.println(num);

        //  System.out.println(Arrays.toString(ID.toCharArray()));
//    if(ID.length()==14 && ID.charAt(6)=='-'){
//        for(int i=8;i>ID.length();i--){
//            String num = ID.substring(-1,-8)+"********";
//        System.out.println(num);
//        }
        //  String num = ID.substring(0,7)="*******";

      }
    }
//4번 중복값 x