package com.gcc.javacore.day23第五章多态;

public class MainTest {
    public static void main(String[] args) {
        /**
         * 继承和重写
         */
        Dog dog = new Dog("大哈", 100, 100, "哈士奇");
        //dog.print();
        Penguin penguin = new Penguin("q妹", 100, 100, "女");
        //penguin.print();
        //多态的内容
        Pet pet = new Pet();
        //多态：同一个引用类型，使用不同的实例而执行不同操作
        //方法重写是实现多态的基础
        //置换法则：任何超类的地方，都可以用子类对象进行置换
        Pet petDog = new Penguin("q妹", 100, 100, "女");
        petDog.print();
        Pet petPenguin = new Penguin();
        penguin.print();

        Master master = new Master();
        master.cure(petDog);
        //fianal 方法表示不能被重写
        //final 类表示不能被继承
        //String是final类不能被继承
        //向上转型：父类的引用指向子类对象，自动进行类型转换

       Pet pet2=master.adopt("dog");
        System.out.println("这是我们领养的宠物");
       pet2.print();
       master.play(pet2);

    }

}