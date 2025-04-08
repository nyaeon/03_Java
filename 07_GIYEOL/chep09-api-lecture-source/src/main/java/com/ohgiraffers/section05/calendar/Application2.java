package com.ohgiraffers.section05.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application2 {
    public static void main(String[] args) {
        /***
         * Calendat클래스를 이용한 인스턴스 생성 방법에는 두가지 방법이 있다
         * 1.getInstance() static 메소드를 이용한 인스턴스 반환
         * 2.후손 클래스인 GregorianCalendar 클래스를 이용한 인스턴스 생성 방법
         */
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        Calendar calendar2 = new GregorianCalendar();

        int year = 2025;
        int month =3; //월은 0~11월까지 사용
        int dayOfmonth =4;
        int minute =33;
        int second =0;
        Calendar calendar3 = new GregorianCalendar(year,month,dayOfmonth,minute,second);
        System.out.println(calendar3);
        Date Date = new Date(calendar.getTimeInMillis());
        System.out.println(Date);
        int startYear = calendar2.get(1);
        System.out.println(startYear);
        int startMonth = calendar2.get(2);
        System.out.println(startMonth);
        int startdayofmonth = calendar2.get(3);
        System.out.println(startdayofmonth);

        System.out.println(Date);
        int startYear2 = calendar2.get(Calendar.YEAR);
        System.out.println(startYear);
        int startMonth2 = calendar2.get(Calendar.MONTH);
        System.out.println(startMonth);
        int startdayofmonth2 = calendar2.get(Calendar.DATE);
        System.out.println(startdayofmonth);
        //요일 : 일(1) 월(2) 화(3) 수(4) 목(5) 금(6) 토(7)
        System.out.println("dayOfMonth : " + calendar2.get(Calendar.DAY_OF_WEEK));

    }
}
