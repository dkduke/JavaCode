package com.atguigu.strategy.improve;

/**
 * Ѽ�ӳ�����
 */
public abstract class Duck {

	//����, ���Խӿ�
	FlyBehavior flyBehavior;
	//��������<->���Խӿ�
	QuackBehavior quackBehavior;
	
	public Duck() {
	
	}

	public abstract void display();//��ʾѼ����Ϣ
	
	public void quack() {
		System.out.println("Ѽ�Ӹ¸½�~~");
	}
	
	public void swim() {
		System.out.println("Ѽ�ӻ���Ӿ~~");
	}
	
	public void fly() {
		//�Ľ�
		if(flyBehavior != null) {
			flyBehavior.fly();
		}
	}

	/**
	 * ���� ���跽���Ĳ���
	 * @param flyBehavior
	 */
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	/**
	 * ���� Ѽ�ӽз����Ĳ���
	 * @param quackBehavior
	 */
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	
	
}
