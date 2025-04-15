package com.ohgiraffers.section03.dto;

import java.util.Date;

public class Application {
    public static void main(String[] args) {

        /*
         *  캡슐화의 원칙에는 일부 어긋나긴 하지만 다른 목적을 가진 클래스와 객체를 추상화 하는 기법이 있다.
         *  행위 위주가 아닌 데이터를 하나로 뭉치기 위한 객체(Data Transfer Object)의 경우이다.
         *  이러한 객체를 설계할 때는 행위가 아닌 데이터가 위주이며, 캡슐화의 원칙을 준수하여
         *  모든 필드를 private로 직접 접근을 막고, 각 필드값을 변경하거나 반환하는 메소드를 세트로 미리 작성해둔다.
         *  어떤것을 쓸 줄 모르니 미리 다 준비해두는 종합선물세트 같은 개념이다.
         *  private 필드와 필드값을 수정하는 설정자(setter), 필드에 접근하는 접근자(getter)들로 구성된다.
         *  주로 계층간 데이터를 주고 받을 목적으로 사용한다.
         * */

        /*
         *  캡슐화 원칙에 따라 작성을 하긴 했지만 실제로는 캡슐화가 의미가 없을 정도로
         *  필드명을 그대로 사용한 설정자와 접근자로 인해 캡슐화 효과가 없다. (유지보수성 악화)
         *  하지만 데이터를 주로 다루는 객체의 경우 행위를 추상화하지 않고
         *  미리 모든 필드에 접근 가능성을 염두해두고 작성해두는 관례로 인해 현재도 많이 사용되고 있다.
         *  (엄밀히 말하자면 EJB의 java bean 작성 규칙에 따르는 것이다.)
         *
         * */

        UserDTO user1 = new UserDTO();
        System.out.println(user1);
        user1.setId("user01");
        System.out.println(user1.getId());
        System.out.println(user1);

        UserDTO user2 = new UserDTO("user02","pass02","홍길동",new Date());
        System.out.println(user2);
    }
}
