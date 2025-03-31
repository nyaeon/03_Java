import java.util.Scanner;

public class CharSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 문자열 입력
        System.out.print("문자열을 하나 입력하세요: ");
        String input = scanner.nextLine();

        // 문자 배열로 변환
        char[] charArray = input.toCharArray();

        // 검색할 문자 입력
        System.out.print("검색할 문자를 입력하세요: ");
        char target = scanner.next().charAt(0);

        // 개수 세기
        int count = 0;
        for (char c : charArray) {
            if (c == target) {
                count++;
            }
        }

        // 결과 출력
        System.out.println("입력하신 문자열 " + input + "에서 찾으시는 문자 " + target + "은 " + count + "개 입니다.");
    }
}
