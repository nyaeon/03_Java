package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {

        /* 깊은 복사를 하는 4가지 방법
        * 1. for문을 이용한 동일한 인덱스 값을 일일이 복사
        * 2. Object의 clone()을 이용한 복사 (사용 빈도 높음)
        * 3. System의 arraycopy()를 이용한 복사
        * 4. Arrays의 copyOf()를 이용한 복사
         */

        int[] originArr = new int[]{1,2,3,4};
        print(originArr, "원본");

        // 1. for문 활용  -> 원래 배열과 꼭 길이가 같을 필요 없음. 나머지는 0으로 채워줌. 혹은 그냥 잘림 (길이 조절 가능)
        int[] copyArr1 = new int[originArr.length];
        for (int i = 0; i < originArr.length; i++) {
            copyArr1[i] = originArr[i];
        }

        print(copyArr1,"for문을 활용한 사본");   // originArr1과 copyArr1은 주소값이 다르기 때문에 내용을 바꿔도 다른놈에 영향을 주지 못함
        copyArr1[0] = 100;
        print(originArr, "확인용");
        print(copyArr1, "확인용");


        // 2. clone() 활용 (길이 조절은 불가능)
        int[] copyArr2 = originArr.clone();
        print(copyArr2, "clone()을 활용한 사본");

        // 3. arraycopy()를 이용한 복사 -> 길이 조절, 복사를 시작할 인덱스 지정 모두 가능함
        int[] copyArr3 = new int[originArr.length + 3];  // 원본보다 길이가 3 더 긴 배열 할당
//      System.arraycopy(원본배열, 원본에서 복사를 시작할 인덱스 , 복사본 배열, 복사를 시작할 인덱스, 복사할 길이);
        System.arraycopy(originArr, 0, copyArr3, 2, originArr.length);
        print(copyArr3, "arraycopy()를 활용한 사본");

        // 4. copyOf()를 이용한 복사 (원본의 처음부터만 가능) -> 길이 조절은 가능함
        int[] copyArr4 = Arrays.copyOf(originArr, 3);
        print(copyArr4, "copyOf()를 활용한 사본");

    }

    /*
    * 전달받은 배열의 정보 출력용 메솓
    * arr 출력발 배열의 주솟값
    * desc 출력할 이름
     */

    public static void print (int[] Arr, String desc) {
        System.out.printf("================================ %s ================================\n", desc);
        System.out.println("넘어온 배열의 hashCode 값 : " + Arr.hashCode());
        System.out.println(Arrays.toString(Arr));
    }
}
