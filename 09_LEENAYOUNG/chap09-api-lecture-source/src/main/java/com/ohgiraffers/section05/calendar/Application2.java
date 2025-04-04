package com.ohgiraffers.section05.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application2 {

    public static void main(String[] args) {

        /*
        * Calendar 클래스를 이용한 인스턴스 생성 방법에는 두 가지 방법이 있다.
        * 1. getInstance() static 메소드를 이용해서 인스턴스 반환받는 방법
        * 2. 후손 클래스인 GregorianCalendar 클래스를 이용해서 인스턴스 생성하는 방법
        * */

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        Calendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar);

        int year = 2025;
        int month = 3;  // 월 0 ~ 11
        int dayOfMonth = 4;
        int hour = 16;
        int minute = 33;
        int second = 0;

        Calendar calendar2 = new GregorianCalendar(year, month, dayOfMonth, hour, minute, second);

        System.out.println(calendar2);
        Date date = new Date(calendar2.getTimeInMillis());
        System.out.println(date);
        
        int startYear = calendar2.get(1);
        System.out.println("startYear = " + startYear);
        int startMonth = calendar2.get(2);
        System.out.println("startMonth = " + startMonth);
        int startDayofMonth = calendar2.get(5);
        System.out.println("startDayofMonth = " + startDayofMonth);

        System.out.println(Calendar.YEAR);

        int startYear2 = calendar2.get(Calendar.YEAR);
        System.out.println("startYear2 = " + startYear2);
        int startMonth2 = calendar2.get(Calendar.MONTH);
        System.out.println("startMonth2 = " + startMonth2);
        int startDayofMonth2 = calendar2.get(Calendar.DATE);
        System.out.println("startDayofMonth2 = " + startDayofMonth2);

        // 요일 : 일(1) 월(2) 화(3) 수(4) 목(5) 금(6) 토(7)
        System.out.println("dayofWeek : " + calendar2.get(Calendar.DAY_OF_WEEK));

    }
}
