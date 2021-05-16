package com.atguigu.strategy.improve;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();

        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();

        /**
         * 动态改变某个对象的行为, 北京鸭 不能飞
         */
        pekingDuck.setFlyBehavior(new NoFlyBehavior());
        System.out.println("-----------------------");
        pekingDuck.fly();
    }
}
