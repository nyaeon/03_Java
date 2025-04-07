package com.ohgiraffers.section05.calender;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application2 {

    public static void main(String[] args) {

        /*
        * calender 클래스를 이용한 인스턴스 생성 방법에는 두가지 방법이 있다.
        * 1. getInstance() static 메소드를 이용해서 인스턴스 반환받는 방법
        * 2. 후손 클래스인 GregorianCalendar 클래스를 이용해서 인스턴스 생성하는 방법
        * */

        // getInstance() static 메소드를 이용해서 인스턴스 반환받는 방법
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        // 후손 클래스인 GregorianCalendar 클래스를 이용해서 인스턴스 생성하는 방법
        Calendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar);

        int year = 2025;
        int month = 3; // 월은 0 ~ 11월
        int dayOfMonth = 4;
        int hour = 16;
        int minute = 33;
        int second = 0;

        Calendar calender2 = new GregorianCalendar(year, month, dayOfMonth, hour, minute, second);
        System.out.println(calender2);
        
        Date date = new Date(calender2.getTimeInMillis());
        System.out.println(date);
        
        int startYear = calender2.get(1);
        System.out.println("startYear = " + startYear);
        int startMonth = calender2.get(2);
        System.out.println("startMonth = " + (startMonth + 1));
        int startDayOfMonth = calender2.get(5);
        System.out.println("startDay = " + startDayOfMonth);

        int startYear2 = calender2.get(Calendar.YEAR);
        System.out.println("startYear = " + startYear);
        int startMonth2 = calender2.get(Calendar.MONTH);
        System.out.println("startMonth = " + (startMonth + 1));
        int startDayOfMonth2 = calender2.get(Calendar.DATE);
        System.out.println("startDay = " + startDayOfMonth);

        // 요일 : 일(1) 월(2) 화(3) 수(4) 목(5) 금(6) 토(7)
        System.out.println("dayOfWeek : " + calender2.get(Calendar.DAY_OF_WEEK));

    }
}
