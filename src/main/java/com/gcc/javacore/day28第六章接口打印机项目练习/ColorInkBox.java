package com.gcc.javacore.day28第六章接口打印机项目练习;

import java.io.PrintStream;

public class ColorInkBox implements Inkbox{
    @Override
    public PrintStream getColor() {
        return System.err;
    }
}
