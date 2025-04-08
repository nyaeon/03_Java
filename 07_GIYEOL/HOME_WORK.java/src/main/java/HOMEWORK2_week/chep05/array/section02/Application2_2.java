package HOMEWORK2_week.chep05.array.section02;

import org.w3c.dom.ls.LSOutput;

public class Application2_2 {
    public static void main(String[] args) {
        String[] student = {"홍길동","이순신","유관순","윤봉길"
                          ,"장영실","임꺾정","장보고","이태백","김정희"
                              ,"대조영","김유신","이사부"};
        String[][] arr1 = new String[3][2];
        String[][] arr2 = new String[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                arr1[i][j] = student[i * 2 + j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                arr2[i][j] = student[6 + (i * 2 + j)];
            }
        }
        System.out.println("===1분단===");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===2분단===");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
        System.out.println();
        }
    }
}
