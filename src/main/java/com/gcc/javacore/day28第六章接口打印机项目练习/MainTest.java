package com.gcc.javacore.day28第六章接口打印机项目练习;

public class MainTest {
    public static void main(String[] args) {
        Paper a4 =new A4();
        Paper a8=new A8();
        Inkbox black =new BlockInkBox();
        Inkbox color =new ColorInkBox();
        Print printer =new Printer(a4,color);
        printer.print("文，wen，从玄从爻。天地万物的信息产生出来的现象、纹路、轨迹，描绘出了阴阳二气在事物中的运行轨迹和原理。故文即为符。上古之时，符文一体。古者伏羲氏之王天下也，始画八卦，造书契，以代结绳（爻）之政，由是文籍生焉。——《尚书序》依类象形，故谓之文。其后形声相益，即谓之字。——《说文》序》仓颉造书，形立谓之文，声具谓之字。——《古今通论》(1) 象形。甲骨文此字象纹理纵横交错形。“文”是汉字的一个部首。");

    }


}
