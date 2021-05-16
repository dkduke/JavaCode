package com.atguigu.strategy.improve;

public class PekingDuck extends Duck {

    /**
     * 通过自定义策略,改变对象属性
     * 假如北京鸭可以飞翔，但是飞翔技术一般
     */
    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("~~北京鸭~~~");
    }

}
