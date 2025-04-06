package com.ohgiraffers.section06.time;

import java.util.Arrays;
import java.util.Calendar;

public class Sonagi {
    public static void main(String[] args) {
      Menu[] menu = new Menu[7];
      menu[1] = new Menu('월',"한우불고기");
      menu[2] = new Menu('화',"제육쌈밥");
      menu[3] = new Menu('수',"차돌된장찌개");
      menu[4] = new Menu('목',"쭈삼비빔밥");
      menu[5] = new Menu('금',"메운갈비찜");
      menu[6] = new Menu('토',"쉬는날");
      menu[0] = new Menu('일',"쉬는날");

      Calendar calendar = Calendar.getInstance();

      int day = calendar.get(Calendar.DAY_OF_WEEK);
    System.out.println("오늘은 " + menu[day-1].day+"이고 오늘의 점심 특선 메뉴는 "+menu[day-1].menu+"입니다.");
    }
}
