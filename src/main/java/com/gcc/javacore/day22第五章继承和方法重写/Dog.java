package com.gcc.javacore.day22第五章继承和方法重写;

/**
 *dog is a pet
 */
public class Dog extends Pet{

    private String strain;

    public Dog() {
    }

    public Dog (String name,int health,int love,String strain  ){
        super.setName(name);
        super.setHealth(health);
        super.setLove(love);
        this.strain = strain;
    }


    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    /**
     * 重写了父类的print();
     * 方法重写规则 不同类当中
     * 方法名相同
     * 参数列表相同
     * 返回值类型相同或是其子类
     * 访问权限不能严于父类
     */
    public void print(){
        super.print();
        System.out.println("狗狗的品种:"+this.strain);
    }

    /**
     * 
     * 方法重载
     * @param strain
     */
    public void print(String strain){
        System.out.println("狗狗的品种:"+strain);

    }
}
