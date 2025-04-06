package com.ohgiraffers.section05.calender;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application2 {
    public static void main(String[] args) {
        /*
        * Calender클래스를 이용한 인스턴스생성 방법에는 두가지 방법이 있다.
        * getInstance() static 메소드를 이용해서 인스턴스 반환받는 방법
        * 2. 후손 클래스인 GregorianCalender클래스를 이용해서 생성하는 방법
        * */

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        Calendar gregorianCalender = Calendar.getInstance();
        System.out.println(gregorianCalender);

        int year = 2025;
        int month = 3;
        int dayOfMonth = 4;
        int hour = 16;
        int minute = 33;
        int second = 0;

        Calendar calendar2 = new GregorianCalendar(year , month, dayOfMonth, hour, minute, second);

        System.out.println(calendar2);
        Date date = new Date(calendar.getTimeInMillis());
        System.out.println(date);

        int startYear = calendar2.get(1);
        System.out.println("startYear = " + startYear);
        int startMonth = calendar2.get(2);
        System.out.println("startMonth = " + startMonth);
        int startDayOfMonth = calendar2.get(5);
        System.out.println("startDayOfMonth = " + startDayOfMonth);

        System.out.println(Calendar.YEAR);

        // 요일 : 일(1) 월(2) 화(3) 수(4) 목(5) 금(6) 토(7)
        System.out.println("dayOfWeek = " + calendar2.get(calendar.DAY_OF_WEEK));


    }
}
