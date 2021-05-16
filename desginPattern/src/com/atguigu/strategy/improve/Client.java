package com.atguigu.strategy.improve;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();

        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();

        /**
         * ��̬�ı�ĳ���������Ϊ, ����Ѽ ���ܷ�
         */
        pekingDuck.setFlyBehavior(new NoFlyBehavior());
        System.out.println("-----------------------");
        pekingDuck.fly();
    }
}
