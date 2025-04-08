package com.ohgiraffers.section02;

import com.ohgiraffers.section02.userexeception.Moneynagativeexcepation;
import com.ohgiraffers.section02.userexeception.NotEnougmoneyexcepation;
import com.ohgiraffers.section02.userexeception.Pricenegativeexcepation;

public class ExceptionTest {
    public void checkEnougMoney(int price, int money)
            throws Pricenegativeexcepation, Moneynagativeexcepation, NotEnougmoneyexcepation {
          //  throws Exception {
        if(price < 0){
            //throw를 이용해 강제로 예외 발생
            throw new Pricenegativeexcepation("가격이 음수 일 수 없다");
        }if(money < 0){
            throw new Moneynagativeexcepation("가진 돈이 음수 일 수 없다");

        }if(money < price){
            throw new NotEnougmoneyexcepation("가진돈이 상품 보다 바쌈");
        }
        System.out.println("홈플러스 가격이 착해");
    }

}
