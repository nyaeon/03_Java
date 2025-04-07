package HOMEWORK2_week.chep05.array.section01;

import java.util.Random;

public class Application2_7 {
    public static void main(String[] args) {
        int[] num = new int[10];
           Random rand = new Random();
           for (int i = 0; i < num.length; i++) {
               num[i] = rand.nextInt(10)+1;
        }

           for ( int sum : num){
                     System.out.print(sum + " ");

        }
          int max = num[0];
          int min = num[0];
        for(int sum : num) {
            if (sum > max) {
                max = sum;
            }
            if (sum < min) {
                min = sum;
            }
        }
        System.out.println();
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);

    }
}

        //  for (int i = 0; i < rand.length; i++) {
     //      rand[i] = new Random();
     //      if (rand[i].nextBoolean()) {
     //          System.out.println(rand[i].nextBoolean());
     //      }else {
     //          System.out.println(rand[i].nextBoolean());
     //      }
     //  }
