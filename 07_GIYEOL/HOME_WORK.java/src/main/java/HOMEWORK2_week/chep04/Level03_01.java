package HOMEWORK2_week.chep04;

import java.util.Scanner;

public class Level03_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수:");
        int a = sc.nextInt();
        System.out.print("두번째 정수:");
        int b = sc.nextInt();
        System.out.print("연산기호를 입력:");
        char num = sc.next().charAt(0);
        switch (num){
                  case '+':
                System.out.println(a+"+"+ b +"="+(a+b));
                  break;
                  case '-':
                  System.out.println(a+"-"+ b+ "="+(a-b));
                  break;
                  case '*':
                System.out.println(a+"*"+ b +"="+(a*b));
                break;
                case '/':
               System.out.println(a+"/"+ b +"="+(a/ b));
               break;
            case '%':
                System.out.println(a+"%"+ b +"="+(a% b));
                break;
               default:
                   System.out.println("입력하신 연산은 없습니다.");
        }
    }
}
