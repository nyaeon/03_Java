package com.ohgiraffers.hw4.member.run;

import com.ohgiraffers.hw4.member.model.repository.MemberRepository;
import com.ohgiraffers.hw4.member.model.vo.Gold;
import com.ohgiraffers.hw4.member.model.vo.Silver;
import com.ohgiraffers.hw4.member.model.vo.VVip;
import com.ohgiraffers.hw4.member.model.vo.Vip;

public class Application {

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
