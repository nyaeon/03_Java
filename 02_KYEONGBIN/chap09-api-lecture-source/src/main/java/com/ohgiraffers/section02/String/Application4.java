package com.ohgiraffers.section02.String;

public class Application4 {

    public static void main(String[] args) {

        /*
         *  이스케이프(escape) 문자
         *  문자열 내에서 사용하는 문자 중 특수문자를 표현하거나 특수기능을 사용할 때 사용하는 문자이다.
         *  이스케이프문자        의미
         *     \n         개행(줄바꿈)
         *     \t         탭
         *     \'         작은 따옴표
         *     \"         큰따옴표
         *     \\         역슬래쉬 표시
         * */

        System.out.println("안녕하세요. \n저는 홍길동 입니다.");
        System.out.printf("%s\n%s\n", "안녕하세요", "저는 홍길동 입니다.");
        System.out.println("test");
        System.out.println("안녕하세요. \t저는 홍길동 입니다.");
        System.out.println("안녕하세요 저는 '홍길동' 입니다.");
        System.out.println("안녕하세요 저는 \'홍길동\' 입니다."); // \'\' 생략해도 되는 걸 불필요하게 씀
        System.out.println('\''); // \'는 이럴 때 씀
        System.out.println("안녕하세요 저는 \"홍길동\" 입니다.");
        System.out.println("안녕하세요 저는 \\홍길동\\ 입니다.");

        /*
         * split()을 사용할 때, 일부 특수문자는 그냥 사용해도 되지만,
         * 일부 특수문자는 정규표현식에서 특별한 의미를 가지므로 앞에 \\(백슬래시 2개)를 붙여야 한다.
         *
         * ✅ 그냥 사용해도 되는 특수문자:
         *   ~ ` ! @ # % & - _ = ; : ' " , < > /
         *   → 이런 문자는 split() 안에서 그냥 사용해도 된다.
         *
         * ✅ 반드시 \\를 붙여야 하는 특수문자:
         *   $ ^ * ( ) + | { } [ ] . ?
         *   → 이런 문자는 정규표현식에서 특별한 의미를 가지므로, split()에서 구분자로 사용하려면 앞에 \\를 붙여야 한다.
         *
         * 예제 1) 쉼표(,)를 기준으로 나누기
         * String str = "사원1,사원2,사원3";
         * String[] arr = str.split(","); // 쉼표는 그냥 사용 가능
         * 결과: ["사원1", "사원2", "사원3"]
         *
         * 예제 2) 달러($)를 기준으로 나누기
         * String str = "100$200$300";
         * String[] arr = str.split("\\$"); // $ 앞에 \\ 추가해야 정상 동작
         * 결과: ["100", "200", "300"]
         *
         * ❌ 주의) 아래처럼 $를 그냥 쓰면 오류 발생!
         * String[] arr = str.split("$"); // 정규표현식에서 $는 "문자열의 끝"을 의미하기 때문!
         *
         * ✅ 해결 방법: split("\\$")로 작성해야 한다.
         */


        String str = "java$mysql$jdbc";
        String[] sarr = str.split("\\$");
        for (String s : sarr) {
            System.out.println(s);
        }


    }

}
