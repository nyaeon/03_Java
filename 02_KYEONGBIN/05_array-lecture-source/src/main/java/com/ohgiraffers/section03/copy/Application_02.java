package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application_02 {
    public static void main(String[] args) {

        /***
         * [ 깊은 복사 (Deep Copy) 방법 4가지 ]
         * 1. for 문을 이용한 동일한 인덱스 값을 복사
         * 2. Object의 clone()을 이용한 복사
         * 3. System의 arraycopy()를 이용한 복사
         * 4. Arrays의 copyOf()를 이용한 복사
         */

        // 원본 배열을 생성 (1부터 4까지의 값을 가진 배열)
        int[] originArr = new int[] {1, 2, 3, 4};

        // 1. for문을 이용한 깊은 복사
        // for문을 사용하여 원본 배열의 값을 하나하나 복사하여 새로운 배열을 만든다.
        int[] copyArr1 = new int[originArr.length];  // 새로운 배열의 크기는 원본 배열과 동일
        for (int i = 0; i < originArr.length; i++) {  // 원본 배열의 길이만큼 반복
            copyArr1[i] = originArr[i];  // 원본 배열의 각 값을 새로운 배열에 복사
        }

        // 2. clone()을 이용한 깊은 복사
        // clone() 메서드를 사용하여 배열을 복제한다. clone은 원본 배열의 복사본을 새로운 배열로 반환한다.
        int[] copyArr2 = originArr.clone();

        // 3. System.arraycopy()를 이용한 깊은 복사
        // System.arraycopy()는 원본 배열에서 지정된 범위의 값을 복사하여 새로운 배열에 저장한다.
        int[] copyArr3 = new int[originArr.length];  // 새로운 배열의 크기는 원본 배열과 동일
        System.arraycopy(originArr, 0, copyArr3, 0, originArr.length);  // 원본 배열의 모든 값을 새로운 배열에 복사

        // 4. Arrays.copyOf()를 이용한 깊은 복사
        // Arrays.copyOf() 메서드를 사용하면 원본 배열의 값을 새로운 배열로 복사할 수 있다.
        // 또한, 두 번째 인자로 복사할 배열의 길이를 지정할 수 있다.
        int[] copyArr4 = Arrays.copyOf(originArr, originArr.length);

        // 각 배열을 출력하여 결과를 확인
        print(originArr, "원본 배열");  // 원본 배열 출력
        print(copyArr1, "for문 복사 배열");  // for문으로 복사한 배열 출력
        print(copyArr2, "clone() 복사 배열");  // clone()으로 복사한 배열 출력
        print(copyArr3, "System.arraycopy() 복사 배열");  // System.arraycopy()로 복사한 배열 출력
        print(copyArr4, "Arrays.copyOf() 복사 배열");  // Arrays.copyOf()로 복사한 배열 출력
    }

    /***
     * 배열의 내용을 출력하는 메소드
     * 이 메소드는 배열의 내용과 해당 배열의 hashCode 값을 출력한다.
     * @param arr  출력할 배열
     * @param desc 배열 설명 (출력할 문구)
     */
    public static void print(int[] arr, String desc) {
        // 배열 설명 출력 (각 배열을 어떤 방식으로 복사했는지 알려주는 설명)
        System.out.printf("\n---------------------------- %s ----------------------------\n", desc);

        // 배열의 hashCode 출력
        // hashCode는 배열의 주소값을 나타내는 값으로, 동일한 배열이면 hashCode 값이 동일하다.
        System.out.println("배열의 hashCode(): " + arr.hashCode());

        // Arrays.toString()을 사용하여 배열의 내용을 출력
        System.out.println("배열 내용: " + Arrays.toString(arr));
    }
}
