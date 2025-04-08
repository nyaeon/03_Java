package HOMEWORK2_week.chep10.api.practicequestion;

public class String {
public static void main(String[] args) {
 //  1. `+preChar(String s): String` 문자열을 넘겨받아, 첫글자를 대문자로 바꾸는 메서드 작성
 //  2. `+charSu(String s, char ch):int` 문자열에서 찾는 문자가 몇개 포함되어 있는지 반환하는 메서드 작성
  //  StringBuilder preChar = new StringBuilder("String s");
  //  System.out.println(preChar);
    StringBuilder sb = new StringBuilder("hello world");
    System.out.println(sb.hashCode());

    sb.append("application car cable");
    System.out.println(sb.hashCode());

}

}
//StringProcess sp = new StringProcess();
//String result = sp.preChar("hello world");
//System.out.println(result);
//
//int num = sp.charSu("application car cable", 'c');
//System.out.println(num);
