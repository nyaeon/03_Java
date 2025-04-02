package com.ohgiraffers.section01.method;

public class Application5 {
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cec8712 (왜 안돼~~)

    public static void main(String[] args) {

        Application5 app = new Application5();
        app.testMethod();
    }

    public void testMethod() {

        System.out.println("testMethod() 동작 확인");

        return; // 메소드를 호출한 곳으로 돌아가기 위해서 return;을 작성 안적어도 컴파일러가 자동으로 추가해준다.
    }
}
<<<<<<< HEAD
=======
    public static void main(String[] args) {

                /* 메소드 리턴 테스트 */
                /* 모든 메소드 내부에는 return; 이 존재한다.
                 * void 메소드의 경우 return;을 명시적으로 작성하지 않아도 마지막줄에 컴파일러가 자동으로 추가를 해준다.
                 * return은 현재 메소드를 강제 종료하고 호출한 구문으로 다시 돌아가는 명령어이다.
                 * */

                /* main() 메소드가 시작하는지 확인하기 위해 출력 구문 작성 */
                System.out.println("main() 메소드 시작함...");

                Application5 app = new Application5();
                app.testMethod();

                /* main() 메소드가 종료되는지 확인하기 위해 출력 구문 작성 */
                System.out.println("main() 메소드 종료됨...");
            }

            public void testMethod() {
                System.out.println("testMethod() 동작 확인...");

                /* 컴파일러에 의해 자동으로 추가되는 구문이다.
                 * 가장 마지막에 작성해야 하고, 마지막에 작성되지 않을 경우 컴파일 에러를 발생시킨다.
                 *  */
                return; // 메소드를 호출한 곳으로 돌아가기 위해서 return;을 작성 안적어도 컴파일러가 자동으로 추가해준다.

                //System.out.println("test");			// return 아래 다른 구문이 있을 경우 에러 발생, return은 메소드 가장 마지막에 작성해야 한다.
            }
        }
>>>>>>> a8fb790 (수정4)
=======
>>>>>>> cec8712 (왜 안돼~~)
