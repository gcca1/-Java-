package com.gcc.javacore.day18第四章对象和对象的引用Date和LocalDateTime;

public class Order {
    /**
     * 订单编号
     */
    public String orderNo;
    /**
     * 订单中有商品
     * has-a关系
     * 商品
     */
    public Item[] items;

    /**
     * uses-a 关系
     * @param accound
     * @return
     */
    public boolean pay(Accound accound){
        //判断账户等级
        //判断账户权限金额
        return true;
    }
}
