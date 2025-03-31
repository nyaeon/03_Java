public class Application {
    public static void main(String[] args) {
//        bitwiseOperator();
        overFlowUnderFlow();
    }

    static void overFlowUnderFlow() {
//        오버플로우 (Overflow) :
//        자료형의 최대값을 초과했을 때 발생하는 현상입니다.
//        자바에서 정수형(byte, short, int, long)은 고정된 크기의 비트(이진수) 로 저장되므로,
//        최대값을 넘어가면 최소값부터 다시 시작하는 순환 현상이 발생합니다.

//        언더플로우 (Underflow) :
//        오버플로우와 반대로 자료형이 표현할 수 있는 최소값보다 더 작은 값을 저장하려고 할 때, 최대값으로 순환하는 현상

        byte min = -128;
        byte max = 127;

        // 오버플로우 발생 (127 + 1 = -128)
        byte overflow = (byte) (max + 1);
        System.out.println("오버플로우: " + overflow);

        // 언더플로우 발생 (-128 - 1 = 127)
        byte underflow = (byte) (min - 1);
        System.out.println("언더플로우: " + underflow);
    }

    static void bitwiseOperator() {
        int a = 5;   // 0101
        int b = 3;   // 0011

        // AND (&) : 두 비트가 모두 1이면 1, 아니면 0
        System.out.println("a & b  = " + (a & b));  // 0001 → 1

        // OR (|) : 하나라도 1이면 1
        System.out.println("a | b  = " + (a | b));  // 0111 → 7

        // XOR (^) : 두 비트가 다르면 1, 같으면 0
        System.out.println("a ^ b  = " + (a ^ b));  // 0110 → 6

        // NOT (~) : 비트를 반전 (0 → 1, 1 → 0)
        System.out.println("~a     = " + (~a));     // 1010 → -6


        int x = 8;   // 1000
        // 왼쪽 시프트 (<<) : 비트를 왼쪽으로 이동 (빈자리는 0으로 채움)
        System.out.println("x << 2  = " + (x << 2));  // 100000 → 32

        // 오른쪽 시프트 (>>) : 부호를 유지하면서 오른쪽 이동
        System.out.println("x >> 2  = " + (x >> 1));  // 0100 → 4
    }
}
