package com.ohgiraffers.exception.charcheck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Run {
    public static void main(String[] args) {
        CharacterProcess cp = new CharacterProcess();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("문자열을 입력하세요: ");
            String input = br.readLine();

            cp.countAlpha(input);

        } catch (CharCheckException e) {
            System.out.println("사용자 정의 예외 발생: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("입력 중 오류 발생: " + e.getMessage());
        }
    }
}
