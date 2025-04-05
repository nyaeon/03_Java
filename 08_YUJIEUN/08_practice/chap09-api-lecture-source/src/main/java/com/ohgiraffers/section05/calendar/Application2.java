package com.ohgiraffers.section05.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application2 {

    public static void main(String[] args) {
        /**
         * Calendar클래스를 이용한 인스턴스 생성 방법에는 두  가지 방법이 있다.
         * 1. getInstance() static 메소드를 이용해서 인스턴스 반환받는 방법
         * 2. 후손 클래스인 Gregorian Calendar 클래스를 이용해서 인스턴스 생성하는  방법
         */

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        Calendar gregorianCalendar= new GregorianCalendar();
        System.out.println(gregorianCalendar);

        int year  = 2025;
        int month = 3;
        int dayOfMonth = 4;
        int hour = 16;
        int minute = 33;
        int second = 0;

        Calendar calendar2 =new GregorianCalendar(year, month, dayOfMonth,hour,minute,second);

        System.out.println(calendar2);
        Date date  = new Date(calendar2.getTimeInMillis());


        int starYear = calendar2.get(1);
        System.out.println("starYear = " + starYear);


        int starMonth = calendar2.get(1);
        System.out.println("starMonth = " + starMonth);

        int starDay = calendar2.get(1);
        System.out.println("starDay = " + starDay);


        int starYear2 = calendar2.get(1);
        System.out.println("starYear = " + starYear);


        int starMonth2= calendar2.get(1);
        System.out.println("starMonth = " + starMonth2);

        int starDay2 = calendar2.get(1);
        System.out.println("starDay = " + starDay);

    }
}
