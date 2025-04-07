package com.ohgiraffers.hw2.model.repository;

import com.ohgiraffers.hw2.model.vo.Gold;
import com.ohgiraffers.hw2.model.vo.Silver;
import com.ohgiraffers.hw2.model.vo.VVip;
import com.ohgiraffers.hw2.model.vo.Vip;

public class MemberRepository {

    public static final int MAX_MEMBER_COUNT = 10;
    Silver[] s = new Silver[MAX_MEMBER_COUNT];
    Gold[] g = new Gold[MAX_MEMBER_COUNT];
    Vip[] v = new Vip[MAX_MEMBER_COUNT];
    VVip[] vv = new VVip[MAX_MEMBER_COUNT];

    // 다음에 추가할 회원인덱스(지금까지 저장한 회원수)
    int silverIndex = 0;
    int goldIndex = 0;
    int vipIndex = 0;
    int vvipIndex = 0;


    public void silverInsert(Silver s) {
        if(silverIndex < MAX_MEMBER_COUNT)
            this.s[silverIndex++] = s;
    }

    public void goldInsert(Gold g) {
        this.g[goldIndex++] = g;
    }

    public void vipInsert(Vip v) {
        this.v[vipIndex++] = v;
    }

    public void vvipInsert(VVip vv) {
        this.vv[vvipIndex++] = vv;
    }

    public void printData() {
        System.out.println("----------------------------------------<<회원정보>>-----------------------------------------");
        System.out.printf("%-15s %-15s %-15s %-15s\n", "이름", "등급", "포인트", "이자포인트");
        System.out.println("------------------------------------------------------------------------------------------------");
        // s.length 작성시 i = 0, 1, 2, 3, 4, 5, 6, 8, 9와 같이 작동. 입력되지 않은 객체에 대해 NPE 발생
        // index 지금까지 저장한 회원수
        for (int i = 0; i < silverIndex; i++) {
            System.out.printf("%-15s %-15s %-15d %-15.2f\n", s[i].getName(), s[i].getGrade(), s[i].getPoint(), s[i].getEjapoint());
        }
        for (int i = 0; i < goldIndex; i++) {
            System.out.printf("%-15s %-15s %-15d %-15.2f\n", g[i].getName(), g[i].getGrade(), g[i].getPoint(), g[i].getEjapoint());
        }
        for (int i = 0; i < vipIndex; i++) {
            System.out.printf("%-15s %-15s %-15d %-15.2f\n", v[i].getName(), v[i].getGrade(), v[i].getPoint(), v[i].getEjapoint());
        }
        for (int i = 0; i < vvipIndex; i++) {
            System.out.printf("%-15s %-15s %-15d %-15.2f\n", vv[i].getName(), vv[i].getGrade(), vv[i].getPoint(), vv[i].getEjapoint());
        }
    }
}
