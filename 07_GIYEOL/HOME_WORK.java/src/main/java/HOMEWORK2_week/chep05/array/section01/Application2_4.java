package HOMEWORK2_week.chep05.array.section01;


import java.util.Random;

public class Application2_4 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random rand = new Random();
        int count = 0;
        while (count < 6) {
            int num = rand.nextInt(45) + 1;
            boolean sum = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    sum = true;
                    break;
                }
            }
            if (sum == false) {
                arr[count] = num;
                count++;
            }
        }
        System.out.println("번호 : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }

 //        while (rand.size() <6) {
 //          int num = (int)(Math.random() *45) +1;
 //            rand.add(num);
 //     }
 //     System.out.println(rand);
 // }
    }
}