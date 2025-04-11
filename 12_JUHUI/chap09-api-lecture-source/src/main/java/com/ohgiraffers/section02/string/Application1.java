package com.ohgiraffers.section02.string;

public class Application1 {

    public static void main(String[] args) {

        int[] arr = new int[4];
        System.out.println(arr.length); //배열은 length 사용시 메소드로 사용하는게 아님. 필드의 들어가있는 값 참조함.
        /*
         * charAt(int index) : 해당 문자열의 특정 인덱스에 해당하는 문자를 반환한다.
         * 인덱스는 0부터 시작하는 숫자 체계를 의미하며
         * 인덱스를 벗어난 정수를 인자로 전달하는 경우에는 IndexOutOfBoundException이 발생한다.
         * */

       String str1 = "apple";

       for (int i = 0; i < str1.length(); i++) { //string의 길이는 length() 메소드를 사용하는 것임.
           System.out.println("charAt(" + i + ") = " + str1.charAt(i));
       }
        /*
         * compareTo() : 인자로 전달된 문자열과 사전 순으로 비교를 하여
         * 두 문자열이 같다면 0을 반환, 인자로 전달된 문자열보다 작으면 음수를,
         * 크면 양수를 반환한다.
         * 단, 이 메소드는 대소문자를 구분하여 비교한다.
         * */
        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";

        System.out.println("compareTo() " + (str2.compareTo(str3))); // 두 문자열이 같아 0이 반환.

        System.out.println("compareTo() " + (str2.compareTo(str4))); // 아스키코드값 차이인 32가 나옴.

        System.out.println("compareTo() " + (str4.compareTo(str2))); // 작아서 -32.

        System.out.println("compareTo() " + (str2.compareTo(str5))); // -5. j에서 o를 뺀 아스키 코드값.

        System.out.println("compareTo() " + (str5.compareTo(str2))); // 5, 반대니까

        // compareToIgnoreCasse() : 대소문자를 구분하지 않고 비교
        System.out.println("compareToIgnoreCase() : " + (str3.compareToIgnoreCase(str4))); //대소비교없이 문자열이 같은지만 비교

        /*
         * concat() : 문자열에 인자로 전달된 문자열을 합치기해서 새로운 문자열을 반환한다.
         * 원본 문자열에는 영향을 주지 않는다.
         * */
        System.out.println("concat() : " + str2.concat(str5));
        System.out.println("str2 : " + str2); //원본 잘 살아있는지 확인

        /*
         * indexOf() : 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환한다.
         * 단, 일치하는 문자가 없는 경우 -1을 반환한다.
         * */
        String indexOf = "java mysql";

        System.out.println("indexOf('a') : " + indexOf.indexOf('a'));
        System.out.println("indexOf('z') : " + indexOf.indexOf('z'));

        /*
         * lastIndexOf() : 문자열 탐색을 뒤에서부터 하고 처음 일치하는 위치의 인덱스를 반환한다.
         * 단, 일치하는 문자가 없는 경우 -1을 반환한다.
         * */
        // 탐색을 뒤에서부터 진행하고 값에 대한 내용은 앞에서 찾음.
        System.out.println("lastIndexOf('a') : " + indexOf.lastIndexOf('a')); //3이 나옴
        System.out.println("lastIndexOf('z') : " + indexOf.lastIndexOf('z')); // 없는 문자라 -1이 나옴

        // trim() : 문자열의 앞 뒤에 공백을 제거한 문자열을 반환한다.
        String trimStr = " java ";
        System.out.println("trimStr : #" + trimStr + "#");
        System.out.println("trimStr : #" + trimStr.trim() + "#");//공백제거
        System.out.println("trimStr : #" + trimStr + "#"); //원본 확인

        /*
         * toLowerCase() : 모든 문자를 소문자로 변환시킨다.
         * toUpperCase() : 모든 문자를 대문자로 변환시킨다.
         */
        String caseStr = "JavaMysql";
        System.out.println("toLowerCase() : " + caseStr.toLowerCase());
        System.out.println("toUpperCase() : " + caseStr.toUpperCase());

        // substring() : 문자열의 일부분을 잘라내어 새로운 문자열을 반환한다. 인덱스에는 시작번호와 마지막번호를 적는데, 마지막 번호 전까지 나온다.
        String javamysql = "javamysql";

        System.out.println("substring(3,6) : " + javamysql.substring(3, 6));
        System.out.println("substring(3) : " + javamysql.substring(3)); // 시작인덱스만 잡아주면 시작부터 끝까지 다
        System.out.println("javamysql : " + javamysql); // 원본 확인

        // length() : 문자열의 길이를 정수형으로 반환
        System.out.println("length() : " + javamysql.length());
        System.out.println("빈 문자열의 길이 " + "".length());

        // isEmpty() : 앞에 is가 붙으면 결과가 boolean값인 경우가 많음.
        // 문자열의 길이가 0이면 true를 반혼, 아닌면 false를 반환
        System.out.println("isEmpty() : " + "".isEmpty());
        System.out.println("isEmpty() : " + "abc".isEmpty());
    }
}
