package com.ohgiraffers.section03.filterstream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyOutputStream extends ObjectOutputStream {

    // 부모 클래스가 하라는 대로 함
    public MyOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override  // 파일 내용을 수정할 때 헤더 부분의 값을 생성하는 메소드
    protected void writeStreamHeader() throws IOException {
        // 안의 내용을 지워서 헤더 부분의 정보를 안 만들게 함
        // 이어쓰기 시 충돌 발생 x
    }
}
