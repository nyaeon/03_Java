package com.ohgiraffers.section04.testapp.stream;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Myobjectoutput extends ObjectOutputStream {

    public Myobjectoutput(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {

    }
}
