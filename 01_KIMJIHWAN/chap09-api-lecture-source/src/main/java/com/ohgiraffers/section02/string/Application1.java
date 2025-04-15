package com.ohgiraffers.section02.string;

public class Application1 {
    /*
     * charAt(int index) : 해당 문자열의 특정 인덱스에 해당하는 문자를 반환한다.
     * 인덱스는 0부터 시작하는 숫자 체계를 의미하며
     * 인덱스를 벗어난 정수를 인자로 전달하는 경우에는 IndexOutOfBoundException이 발생한다.
     * */
    public static void main(String[] args) {
        int[] arr = new int[4];
        System.out.println(arr.length);

        String str1 = "apple";

        for (int i = 0; i < str1.length(); i++) {
            System.out.println("charAt(" + i + ") : " + str1.charAt(i));
        }
        /*
         * compareTo() : 인자로 전달된 문자열과 사전 순으로 비교를 하여
         * 두 문자열이 같다면 0을 반환, 인자로 전달된 문자열보다 작으면 음수를,
         * 크면 양수를 반환한다.
         * 단, 이 메소드는 대소문자를 구분하여 비교한다.
         * */
        System.out.println("=======================================");
        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";

        System.out.println("compareTo() : " + (str2.compareTo(str3))); // 0
        System.out.println("compareTo() : " + (str2.compareTo(str4))); // 32 문자 첫 글자의 서로 다른 부분의 차를 보여준다.
        System.out.println("compareTo() : " + (str4.compareTo(str2))); // 32 문자 첫 글자의 서로 다른 부분의 차를 보여준다.
        System.out.println("compareTo() : " + (str2.compareTo(str5)));
        System.out.println("compareTo() : " + (str5.compareTo(str2)));

        System.out.println("compareToIgnoreCase() : "  + (str2.compareToIgnoreCase(str4)));
        // IgnoreCase를 붙히면 대소문자 관계 없이 같은 지만 비교한다.
        System.out.println("=======================================");
        /*
         * concat() : 문자열에 인자로 전달된 문자열을 합치기해서 새로운 문자열을 반환한다.
         * 원본 문자열에는 영향을 주지 않는다.
         * */
        System.out.println("concat() : "  + (str2.concat(str5)));
        System.out.println("str2 : "  + str2);

        System.out.println("=======================================");
        /*
         * indexOf() : 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환한다.
         * 단, 일치하는 문자가 없는 경우 -1을 반환한다.
         * */
        String indecOf = "java mysql";

        System.out.println("indecOf('a') : " + indecOf.indexOf('a'));
        System.out.println("indecOf('z') : " + indecOf.indexOf('z'));
        System.out.println("=======================================");

        /*
         * lastIndexOf() : 문자열 탐색을 뒤에서부터 하고 처음 일치하는 위치의 인덱스를 반환한다.
         * 단, 일치하는 문자가 없는 경우 -1을 반환한다.
         * */

        System.out.println("lastIndexOf('a') : " + indecOf.lastIndexOf('a'));
        System.out.println("lastIndexOf('z') : " + indecOf.lastIndexOf('z'));

        // trim() : 문자열의 앞 뒤에 공백을 제거한 문자열을 반환한다.
        System.out.println("=======================================");

        String tirmStr = "        java         ";
        System.out.println("trimStr : #"   + tirmStr + "#" );
        System.out.println("trimStr : #"   + tirmStr.trim() + "#" );
        System.out.println("trimStr : #"   + tirmStr + "#" );

        /*
         * toLowerCase() : 모든 문자를 소문자로 변환시킨다.
         * toUpperCase() : 모든 문자를 대문자로 변환시킨다.
         * */
        System.out.println("=======================================");

        String caseStr = "JAVAMySql";
        System.out.println("toLowerCase() : " + caseStr.toLowerCase());
        System.out.println("toUpperCase() : " + caseStr.toUpperCase());

        //substring()  : 문자열의 일부분을 잘라내어 새로운 문자열을 반환한다.
        String javamysql = "javamysql";

        System.out.println("substring(3,6) : " +javamysql.substring(3,6) );
        // substring (시작,끝) : 시작지점 초과 끝지점 미만의 자릿수를 살리고 나머지를 자른다.
        System.out.println("substring(3) : " +javamysql.substring(3) );
        // (3)만 쓰는 경우 3번째 인덱스 뒤에를 다 살린다.
        System.out.println("javamysql = " + javamysql);;
        System.out.println("=======================================");

        // legnth() : 문자형의 길이를 정수형으로 반환

        System.out.println("length() : " + javamysql.length());
        System.out.println("빈 문자열의 길이 : " + "".length());
        System.out.println("=======================================");

        // isEmpty() : 문자열의 길이가 0이면 true를 반환, 아니면 false 반환
        System.out.println("isEmpty() : " + "".isEmpty());
        System.out.println("isEmpty() : " + "abc".isEmpty());

    }

}

