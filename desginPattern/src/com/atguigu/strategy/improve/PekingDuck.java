package com.atguigu.strategy.improve;

public class PekingDuck extends Duck {

    /**
     * ͨ���Զ������,�ı��������
     * ���籱��Ѽ���Է��裬���Ƿ��輼��һ��
     */
    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("~~����Ѽ~~~");
    }

}
