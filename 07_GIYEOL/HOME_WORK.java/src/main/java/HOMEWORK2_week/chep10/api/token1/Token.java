package HOMEWORK2_week.chep10.api.token1;

public class Token {
       public static void main(String[] args) {

           //String str = new String {"J a v a P r o g r a m"};
           //String[] str = new String[10];

           java.lang.String[] str = new java.lang.String[]{"J a v a P r o g r a m"};
           //str = new java.lang.String "J a v a P r o g r a m";
           // 2. 토큰 처리 전 글자 및 개수 출력
           System.out.println("원본 문자열: " + str);
           System.out.println("원본 문자열 길이: " + str.length());

           // 3. 문자열을 공백 기준으로 토큰 처리
           String[] tokens = str.split(" "); // 공백 단위로 토큰 분리

           // 4. 토큰 처리 후 char[] 배열에 저장
           int totalLength = 0;
           for (String token : tokens) {
               totalLength += token.length(); // 토큰들의 문자 길이 합산
           }

           // 최종 char[] 배열을 선언하고 값을 저장
           char[] charArray = new char[totalLength];
           int index = 0;
           for (String token : tokens) {
               for (int i = 0; i < token.length(); i++) {
                   charArray[index++] = token.charAt(i); // char[]에 각 문자를 삽입
               }
           }

           // 5. 토큰 처리 후 문자배열 길이 출력 확인
           System.out.println("토큰 처리 후 문자배열 길이: " + charArray.length);

           // 6. char[] 값 출력
           System.out.print("char[] 배열 값: ");
           for (char c : charArray) {
               System.out.print(c); // char[] 값 출력
           }
           System.out.println();

           // 7. char[] 을 다시 String 으로 변환 후 모두 대문자로 변환하여 출력
           String result = new String(charArray).toUpperCase(); // char[] -> String으로 변환 후 대문자로 변환
           System.out.println("대문자로 변환한 결과: " + result);
       }//}
}


