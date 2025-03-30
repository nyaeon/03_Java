package HOMEWORK2_week.chep02;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신 성별은? (M/F) 선택하세요 :");
        char gander = sc.nextLine().charAt(0);

        String result = (gander == 'M') ? "남자입니다" :
                (gander == 'F') ? "여자입니다" : "다시 입력하세요" ;
        System.out.println("결과는 :" + result);


    }
        /*
            System.out.println("남자입니다.");
        } else if (gander == 'F') {
            System.out.println("여자입니다.");
        } else{
            System.out.println("다시 입력해주새요");
        }
*/
}