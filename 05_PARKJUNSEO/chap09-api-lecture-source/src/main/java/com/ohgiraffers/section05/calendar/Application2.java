package com.ohgiraffers.section05.calendar;

import com.sun.security.jgss.GSSUtil;

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

        Calendar calendar = Calendar.getInstance();  // 현재 날짜와 시간에 관련된 것을 얻을 수 있음
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));

        Calendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar);

        int year = 2025;
        int month = 3;      // 월은 0~11로 사용
        int dayOfMonth = 16;
        int minute = 33;
        int second = 0;

        Calendar calendar2 = new GregorianCalendar(year, month, dayOfMonth, minute, second);
        System.out.println(calendar2);      // 이렇게 사용해도 괜찮지만 애는 좀 누락된 게 있음

        Date date = new Date(calendar.getTimeInMillis());
        System.out.println(date);

        int startYear = calendar2.get(1);   // 2025년만 뽑아옴
        System.out.println("startYear = " + startYear);
        int startMonth = calendar2.get(2);
        System.out.println("startMonth = " + startMonth);
        int startDayOfMonth = calendar2.get(5);
        System.out.println("startDayOfMonth = " + startDayOfMonth);

        System.out.println(Calendar.YEAR);

        int startYear2 = calendar2.get(Calendar.YEAR);
        System.out.println("startYear = " + startYear);
        int startMonth2 = calendar2.get(Calendar.MONTH);
        System.out.println("startMonth = " + startMonth);
        int startDayOfMonth2 = calendar2.get(Calendar.DATE);
        System.out.println("startDayOfMonth = " + startDayOfMonth);

        // 요일 : 일(1) 월(2) 화(3) 수(4) 목(5) 금(6) 토(7)
        System.out.println("dayOfWeed : " + calendar2.get(Calendar.DAY_OF_WEEK));

    }
}
