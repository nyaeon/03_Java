package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.repository.MemberRepository;
import com.ohgiraffers.hw2.model.vo.Gold;
import com.ohgiraffers.hw2.model.vo.Silver;
import com.ohgiraffers.hw2.model.vo.VVip;
import com.ohgiraffers.hw2.model.vo.Vip;

public class Run {

    public static void main(String[] args){
        MemberRepository memberRepository = new MemberRepository();
        memberRepository.silverInsert(new Silver("홍길동", "Silver",1000));
        memberRepository.silverInsert(new Silver("김말똥", "Silver",2000));
        memberRepository.silverInsert(new Silver("고길동", "Silver",3000));
        memberRepository.goldInsert(new Gold("김회장", "Gold",1000));
        memberRepository.goldInsert(new Gold("이회장", "Gold",2000));
        memberRepository.goldInsert(new Gold("오회장", "Gold",3000));

        //vip추가
        memberRepository.vipInsert(new Vip("이부자", "Vip",10000));

        //vvip추가
        memberRepository.vvipInsert(new VVip("김갑부", "VVip",100000));

        memberRepository.printData();
    }
}
