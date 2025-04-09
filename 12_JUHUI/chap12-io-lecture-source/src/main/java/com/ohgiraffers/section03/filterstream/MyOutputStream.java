package com.ohgiraffers.section03.filterstream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyOutputStream extends ObjectOutputStream {

    public MyOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        //super.writeStreamHeader(); //이걸 지워줘야 오류해결됨. 이게 일관화?
    }
}
