package com.company;

public class MyAutoClosable implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println();
        System.out.print("close called");
    }
}
