package com.ohgiraffers.section01.method;

public class Calculator {
    public int plusTwoNumber(int first, int second) {
        return first + second;
    }
    public int minusTwoNumber(int first, int second) {
        return first - second;
    }
    public int multiplyTwoNumber(int first, int second) {
        return first * second;
    }
    public int divideTwoNumber(int first, int second) {
        return first / second;
    }
    public static int selectMin(int first,int second){
        return first > second ? second : first;
    }
    public static int selectMax(int first , int second){
        return first > second ? first : second;
    }
}
