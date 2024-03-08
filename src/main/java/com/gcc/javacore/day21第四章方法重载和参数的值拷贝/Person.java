package com.gcc.javacore.day21第四章方法重载和参数的值拷贝;

/**
 * 类
 */

public class Person {
    /**
     * 属性==成员变量
     */

    private String name;
    private  int age;
    private int weight;
    //全局变量 ，所有类，对象共享
    private static int id;

    static{
        //只执行一次
        System.out.println("这是静态块");
    }
    {
        //每次创建对象都会执行
        System.out.println("代码块");
    }

    /**
     * 默认属性（域）初始化
     */
//    public Person(){
//        age = 0;
//        weight=0;
//        name = null;
//
//    }
    public Person(){
        //一个构造调用另一个构造
        //用this()而且只能写第一行
        this("张三",18,10);
        this.name="张三";
        this.age=18;
    }
    public Person(String name,int age,int weight){
        this.name =name;
        this.age = age;
        this.weight = weight;
    }

    //getset方法快捷键 alt+insert
    //get set 方法典型封装
    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public static void setId(){
//        this.setName("ddd");
//        this.age=10;
    }

    /**
     * 方法
     */
    public void run(){
        /**um
         * 局部变量
         */
        int ageNum=10 ;//就近原则
        System.out.println(ageNum);
        System.out.println(this.age);
        System.out.println(this.name);

    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("张三");
        person.setAge(18);
        person.setWeight(70);
        person.run();
        Person person1 = new Person();
        person1.setName("李四");
        person1.setAge(20);
        person1.setWeight(70);
        person1.run();

        Person wangwu = new Person("王五",18,60);
    }

}
