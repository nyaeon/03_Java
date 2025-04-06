package com.ohgiraffers.api.string;

/**
 * <pre>
 *
 * 클래스 명 : com.ohgiraffers.string.StringProcess.java
 * 메소드 작성 : 1.문자열을 넘겨받아, 첫글자를 대문자로 바꾸는 메서드 작성
 * +preChar(String s): String
 *
 * 2.문자열에서 찾는 문자가 몇개 포함되어 있는지 반환하는 메서드 작성
 * +charSu(String s, char ch):int
 *
 * 테스트 클래스 : com.ohgiraffers.string.StringTest.java
 * - 키보드(Scanner)로 부터 문자열과 문자를 입력받아, 두 개의 메소드 실행 테스트 - 결과값들 출력 확인
 *
 * </pre>
 *
 */
public class StringProcess {

    /**
     * 1.문자열을 넘겨받아, 첫글자를 대문자로 바꾸는 메서드 작성 +preChar(String s): String
     *
     * @param s
     * @return
     */
    public String preChar(String s) {
//		char[] c = s.toCharArray();
//		if(c[0]>='a' && c[0]<='z')
//			c[0] = (char)(c[0]-32);
//
//		return new String(c);

        return s.substring(0, 1).toUpperCase() + s.substring(1);

    }

    /**
     *
     * 2.문자열에서 찾는 문자가 몇개 포함되어 있는지 반환하는 메서드 작성 : +charSu(String s, char ch):int
     *
     * @param string
     * @param c
     * @return
     */
    public int charSu(String s, char c) {
        char[] cStr = s.toCharArray();
        int cnt = 0; // 개수 체크용
        for (int i = 0; i < cStr.length; i++) {
            if (cStr[i] == c)
                cnt++;
        }
        return cnt;
    }

}