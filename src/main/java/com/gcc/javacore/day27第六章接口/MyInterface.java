package com.gcc.javacore.day27第六章接口;

/**
 * 第一个接口
 */
public interface MyInterface {
    //属性：公共 静态属性 常量
    public static final String name="myInterface";
    String TEST="myInterface";
    //接口当中的方法，是抽象方法，是没有方法体的
     //默认是公共的访问权限
      public abstract void test();
      void test(int num);
}
