package com.ogiraffers.section02;

import com.ogiraffers.section02.userException.moneyNegativeException;
import com.ogiraffers.section02.userException.notEnoughMoneyException;
import com.ogiraffers.section02.userException.priceNegativeException;

public class Application2 {

    public static void main(String[] args) {

        // ExceptionTest 클래스의 객체 생성
        ExceptionTest et = new ExceptionTest();

        try {
            // checkEnoughMoney(가격, 가진 돈)
            // 현재 가진 돈이 음수(-30000)이므로 moneyNegativeException 예외가 발생할 수 있음
            et.checkEnoughMoney(20000, 30000);

            // 가격이 음수일 경우 발생하는 예외
        } catch (priceNegativeException e) {
            // 예외를 RuntimeException으로 다시 던져서 강제 종료 또는 로깅 등에 활용
            System.out.println("PriceNegativeException occurs.");
            System.out.println(e.getMessage());
            System.out.println(e.getClass());

            // 가진 돈이 음수일 경우 발생하는 예외
        } catch (moneyNegativeException e) {
            System.out.println("moneyNegativeException is occurs.");
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
//            e.printStackTrace();
//            throw new RuntimeException(e);
            // 가진 돈이 가격보다 부족할 경우 발생하는 예외
        } catch (notEnoughMoneyException e) {
            System.out.println("notEnoughMoneyException is occurs.");
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        } finally {
            System.out.println("Finally occurs.");
            // try 구문이 정상적으로 동작하던  exception이건 동작하게 함
            // 한번은 이 코드에 끝에 도달해라 이런거라고 함

        }

        System.out.println("Exit the Application.");
        /*
         💡 주의사항!
         - catch문은 구체적인 예외 → 더 포괄적인 예외 순으로 작성해야 함.
         - 그렇지 않으면 하위 예외가 실행되지 않고 건너뜀.
         - 예외를 RuntimeException으로 감싸 던지는 이유는 예외를 한 번에 처리하거나 종료시키기 위함.
        */
    }
}
