package com.ohgiraffers.sectoin05.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application2 {

    public static void main(String[] args) {

        /*
        *  Calendar 클래스를 이용한 인스턴스 생성 방법에는 두 가지 방법이 있다.
        * 1. getInstance() static 메소드를 이요해서 인스턴스 반환받는 방법
        * 2. 후손 클래스인 GregoianCalendar클래스 이용해서 인스턴스 생성하는 방법
        * */

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        Calendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar);

        int year = 2025;
        int month = 3; // 월은 0 ~ 11
        int dayOfmonth = 4;
        int hour = 16;
        int minute = 34;
        int second = 0;
        Calendar calendar2 = new GregorianCalendar(year, month, dayOfmonth, hour, minute, second);
        System.out.println(calendar2);

        Date date = new Date(calendar.getTimeInMillis());
        System.out.println(date);

        int startYear = calendar2.get(1);
        System.out.println("startYear = " + startYear);
        int startMonth = calendar2.get(2);
        System.out.println("startMonth = " + startMonth);
        int startDayOfMonth = calendar2.get(5);
        System.out.println("startDayOfMonth = " + startDayOfMonth);


        int startYear2 = calendar2.get(Calendar.YEAR);
        System.out.println("startYear = " + startYear);
        int startMonth2 = calendar2.get(Calendar.MONTH);
        System.out.println("startMonth = " + startMonth);
        int startDayOfMonth2 = calendar2.get(Calendar.DAY_OF_MONTH);
        System.out.println("startDayOfMonth = " + startDayOfMonth);

        //요일 : 일(1) 월(2) ~ .. 토(7)

        System.out.println("dayOfWeek : " + calendar2.get(Calendar.DAY_OF_WEEK));
    }

}
