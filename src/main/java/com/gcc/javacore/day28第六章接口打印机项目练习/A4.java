package com.gcc.javacore.day28第六章接口打印机项目练习;

public class A4 extends Paper  {
    @Override
    public int  getPageSize() {
        return super.size*5;
    }
}
