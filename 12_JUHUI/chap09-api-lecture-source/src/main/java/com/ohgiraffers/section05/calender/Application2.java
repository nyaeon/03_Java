package com.ohgiraffers.section05.calender;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application2 {

    public static void main(String[] args) {

        /*
         * Calender 클래스를 이용한 인스턴스 생성 방법에는 두 가지 방법이 있다.
         * 1. getInstance() static 메소드를 이용해서 인스턴스 반환받는 방법
         * 2. 후손 클래스인 GregorianCalender 클래스를 이용헤 인스턴스 생성한하는 방법
         */
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar);

        Calendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar);

        int year = 2025;
        int month = 3; //월은 0부터 11월까지
        int dayOfMonth = 4;
        int hour = 16;
        int minute = 33;
        int second = 0;

        Calendar calendar1 = new GregorianCalendar(year, month, dayOfMonth, hour, minute, second);
        System.out.println(calendar1);

        Calendar calendar2 = new GregorianCalendar(year, month, dayOfMonth, hour, minute, second);

        System.out.println(calendar2);

        Date date = new Date(calendar1.getTimeInMillis());
        System.out.println(date);

        int startYear = calendar1.get(1);
        System.out.println("startYear : " + startYear);
        int startMonth = calendar1.get(2);
        System.out.println("startMonth : " + startMonth);
        int startDayOfMonth = calendar1.get(5);//dayofmonth는 get에서 5번이라 5.
        System.out.println("startDayOfMonth : " + startDayOfMonth);

        System.out.println(Calendar.YEAR);

        int startYear2 = calendar1.get(Calendar.YEAR);
        System.out.println("startYear : " + startYear);
        int startMonth2 = calendar1.get(Calendar.MONTH);
        System.out.println("startMonth : " + startMonth);
        int startDayOfMonth2 = calendar1.get(Calendar.DAY_OF_MONTH);//dayofmonth는 get에서 5번이라 5.
        System.out.println("startDayOfMonth : " + startDayOfMonth);

        // 요일 : 일(1) 월(2) 화(3) 수(4) 목(5) 금(6) 토(7)
        System.out.println("dayOfMonth : " + calendar1.get(Calendar.DAY_OF_WEEK));
    }
}
