package com.ohgiraffers.section05.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application2 {
    public static void main(String[] args) {

        /*
        * Calendar 클래스를 이용한 인스턴스 생성 밥법은 2개 有
        * 1. Using getInstance() static to return the instance
        * 2. Using GregorianCalendar Class to return the instance
        * */

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        Calendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar);

        int year = 2025;
        int month = 3; // Using 0 ~ 11 for month
        int day = 4;
        int hour = 16;
        int minute = 33;
        int second = 34;

        Calendar calendar2 = new GregorianCalendar(year, month, day, hour, minute, second);
        System.out.println(calendar2);
        Date date = new Date(calendar2.getTimeInMillis());
        System.out.println(date);

        int startYear = calendar2.get(Calendar.YEAR);
        System.out.println("startYear = " + startYear);
        int startMonth = calendar2.get(Calendar.MONTH);
        System.out.println("startMonth = " + startMonth);
        int startDay = calendar2.get(Calendar.DATE);
        System.out.println("startDay = " + startDay);

//         요일 : 일(1) 월(2) 화(3) 수(4) 목(5) 금(6) 토(7)
        System.out.println("dayOfWeek = " + calendar2.get(Calendar.DAY_OF_WEEK));



    }
}
