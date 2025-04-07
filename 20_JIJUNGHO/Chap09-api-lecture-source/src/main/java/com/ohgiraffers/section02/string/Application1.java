package com.ohgiraffers.section02.string;

public class Application1 {

    public static void main(String[] args) {
        /*
         * charAt(int index) : 해당 문자열의 특정 인덱스에 해당하는 문자를 반환한다.
         * 인덱스는 0부터 시작하는 숫자 체계를 의미하며
         * 인덱스를 벗어난 정수를 인자로 전달하는 경우에는 IndexOutOfBoundException이 발생한다.
         * */
        String str = "apple";

        for (int i = 0; i < str.length(); i++) {
            System.out.println("chatAt(" + i + ") : " + str.charAt(i));
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
        String str5 = "orcle";

        System.out.println("compareTo() : " + (str2.compareTo(str3))); // 0 (같다)
        // J의 아스키코드 106, j의 아스키코드 74
        // 106 - 74 = 32
        System.out.println("compareTo() : " + (str2.compareTo(str4))); // 32 (str4가 크다)
        // 74 - 106 = -32
        System.out.println("compareTo() : " + (str4.compareTo(str2))); // -32 (str4가 크다)
        System.out.println("compareTo() : " + (str2.compareTo(str5))); // -5
        System.out.println("compareTo() : " + (str5.compareTo(str2))); // 5

        // compareToIgnoreCase : 대소문자 관계없이 문자만 비교
        System.out.println("compareToIgnoreCase() : " + (str3.compareToIgnoreCase(str4)));

        /*
         * concat() : 문자열에 인자로 전달된 문자열을 합치기해서 새로운 문자열을 반환한다.
         * 원본 문자열에는 영향을 주지 않는다.
         * */
        System.out.println("concat() : " + str2.concat(str5));
        System.out.println("str2 : " +  str2);

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
        System.out.println("lastIndexOf('a') : " + indexOf.lastIndexOf('a'));

        // trim() : 문자열의 앞뒤의 공백을 제거한 문자열을 반환한다.
        String trimStr = "    java    ";
        System.out.println("trimStr : #" + trimStr + "#");
        System.out.println("trim() : " + trimStr.trim());
        // 원본은 변하지 않음
        System.out.println(trimStr);

        /*
         * toLowerCase() : 모든 문자를 소문자로 변환시킨다. (원본 영향 X)
         * toUpperCase() : 모든 문자를 대문자로 변환시킨다. (원본 영향 X)
         * */
        String castStr = "JavaMySql";
        System.out.println("toLowerCase() : " + castStr.toLowerCase());
        System.out.println("toUpperCase() : " + castStr.toUpperCase());

        // subString() : 문자열의 일부분을 잘라내어 새로운 문자열을 반환한다. (원본 영향 X)
        String javamysql = "javamysql";

        // 3부터 6미만
        System.out.println("substring() : " + javamysql.substring(3,6));
        // 시작 인덱스부터 끝까지 (3부터 끝까지)
        System.out.println("substring() : " + javamysql.substring(3));
        System.out.println("javamysql : " + javamysql);

        // length() : 문자열의 길이를 정수형으로 반환
        System.out.println("length() : " + javamysql.length());
        System.out.println("빈 문자열의 길이 : " + "".length());

        // isEmpty() : 문자열의 길이가 0이면 true를 반환, 아니면 false를 반환한다. 길이가 0인 문자열은 null과는 다르다.
        System.out.println("isEmpty() : " + javamysql.isEmpty());
        System.out.println("isEmpty() : " + "".isEmpty());

    }

}
