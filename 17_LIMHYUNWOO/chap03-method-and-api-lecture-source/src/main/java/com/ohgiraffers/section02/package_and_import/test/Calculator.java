package com.ohgiraffers.section02.package_and_import.test;

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
    public int selectMin(int first,int second){
        return first > second ? second : first;
    }
    public static int selectMax(int first , int second){
        return first > second ? first : second;
    }
}
