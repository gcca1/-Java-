package com.gcc.javacore.day23第五章多态;

/**
 * dog类
 */
public class Dog extends Pet{

    private String strain;

    public Dog() {
    }

    public Dog(String name, int health, int love, String strain) {
        super(name,health,love);
        this.strain = strain;
    }
    public void frisbee(){
        System.out.println("和狗狗接飞盘");
    }

    /**
     * dog类重写print 方法
     * 重写的定义：
     * 在子父类当中 方法名，参数列表要相同
     * 子类的访问修饰符不能严于父类
     * 返回值类型相同或者是其子类
     */
    @Override
    public void print() {
        System.out.println("狗狗的品种:"+this.strain);
    }

    @Override
    public void gotoHospital() {
        System.out.println("狗狗去医院");
    }

    public String getStrain()
    {
        return strain;
    }

    public void setStrain(String strain)
    {
        this.strain = strain;
    }
}
