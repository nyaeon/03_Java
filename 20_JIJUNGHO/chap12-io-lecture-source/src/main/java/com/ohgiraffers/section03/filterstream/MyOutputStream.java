package com.ohgiraffers.section03.filterstream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

// 객체 배열에 파일 이어쓰기 > 헤더 설정

public class MyOutputStream extends ObjectOutputStream {
    public MyOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {

    }
}
