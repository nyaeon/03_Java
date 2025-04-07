package com.ohgiraffers.hw4.member.model.repository;

import com.ohgiraffers.hw4.member.model.vo.Gold;
import com.ohgiraffers.hw4.member.model.vo.Silver;
import com.ohgiraffers.hw4.member.model.vo.VVip;
import com.ohgiraffers.hw4.member.model.vo.Vip;

public class MemberRepository {

    public static final int MAX_MEMBER_COUNT = 10;
    Silver[] silvers = new Silver[MAX_MEMBER_COUNT];
    Gold[] golds = new Gold[MAX_MEMBER_COUNT];
    Vip[] vips = new Vip[MAX_MEMBER_COUNT];
    VVip[] vVips = new VVip[MAX_MEMBER_COUNT];

    // 다음에 추가할 회원인덱스(지금까지 저장한 회원수)
    int silverIndex = 0;
    int goldIndex = 0;
    int vipIndex = 0;
    int vvipIndex = 0;


    public void silverInsert(Silver s) {
        if(silverIndex < MAX_MEMBER_COUNT)
            this.silvers[silverIndex++] = s;
    }

    public void goldInsert(Gold g) {
        this.golds[goldIndex++] = g;
    }

    public void vipInsert(Vip v) {
        this.vips[vipIndex++] = v;
    }

    public void vvipInsert(VVip vv) {
        this.vVips[vvipIndex++] = vv;
    }

    public void printData() {
        System.out.println("----------------------------------------<<회원정보>>-----------------------------------------");
        System.out.printf("%-15s %-15s %-15s %-15s\n", "이름", "등급", "포인트", "이자포인트");
        System.out.println("------------------------------------------------------------------------------------------------");
        // s.length 작성시 i = 0, 1, 2, 3, 4, 5, 6, 8, 9와 같이 작동. 입력되지 않은 객체에 대해 NPE 발생
        // index 지금까지 저장한 회원수
        for (int i = 0; i < silverIndex; i++) {
            System.out.printf("%-15s %-15s %-15d %-15.2f\n", silvers[i].getName(), silvers[i].getGrade(), silvers[i].getPoint(), silvers[i].getEjapoint());
        }
        for (int i = 0; i < goldIndex; i++) {
            System.out.printf("%-15s %-15s %-15d %-15.2f\n", golds[i].getName(), golds[i].getGrade(), golds[i].getPoint(), golds[i].getEjapoint());
        }
        for (int i = 0; i < vipIndex; i++) {
            System.out.printf("%-15s %-15s %-15d %-15.2f\n", vips[i].getName(), vips[i].getGrade(), vips[i].getPoint(), vips[i].getEjapoint());
        }
        for (int i = 0; i < vvipIndex; i++) {
            System.out.printf("%-15s %-15s %-15d %-15.2f\n", vVips[i].getName(), vVips[i].getGrade(), vVips[i].getPoint(), vVips[i].getEjapoint());
        }
    }
}
