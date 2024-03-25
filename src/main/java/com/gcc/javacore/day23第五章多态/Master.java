package com.gcc.javacore.day23第五章多态;

public class Master {
    /**
     * 主人带宠物去治病
     */
//    public void cure(Dog dog){
//        System.out.println("带狗去医院");
//   }
//    public void cure(Penguin penguin){
//        System.out.println("带企鹅去医院");
//    }

    /**
     * 参数的多态
     *
     * @param pet
     */
    public void cure(Pet pet) {
        pet.gotoHospital();
    }

    /**
     * 简单工厂模式
     *
     * @param type
     * @return
     */
    public Pet adopt(String type) {
        if ("dog".equals(type)) {
            return new Dog("大哈", 100, 100, "哈士奇");
        }
        if ("penguin".equals(type)) {
            return new Penguin("q妹", 100, 100, "女");
        }
        return null;

    }
    public void play(Pet pet){
        if(pet instanceof  Dog){
            Dog dog =(Dog)pet;
            dog.frisbee();
        }
        if(pet instanceof Penguin){
            Penguin penguin=(Penguin)pet;
            penguin.swimming();
        }
    }
}

