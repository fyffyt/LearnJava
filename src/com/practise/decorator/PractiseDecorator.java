package com.practise.decorator;

interface Component {

	void method();
	
}

class ConcreteComponent implements Component{

	public void method() {
		System.out.println("原来的方法");
	}

}

abstract class Decorator implements Component{

	protected Component component;

	public Decorator(Component component) {
		super();
		this.component = component;
	}

	public void method() {
		component.method();
	}
	
}

class ConcreteDecoratorA extends Decorator{

	public ConcreteDecoratorA(Component component) {
		super(component);
	}
	
	public void methodA(){
		System.out.println("被装饰器A扩展的功能");
	}

	public void method(){
		System.out.println("针对该方法加一层A包装");
		super.method();
		System.out.println("A包装结束");
	}
}

class ConcreteDecoratorB extends Decorator{

	public ConcreteDecoratorB(Component component) {
		super(component);
	}
	
	public void methodB(){
		System.out.println("被装饰器B扩展的功能");
	}

	public void method(){
		System.out.println("针对该方法加一层B包装");
		super.method();
		System.out.println("B包装结束");
	}
}




public class PractiseDecorator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Component component =new ConcreteComponent();//原来的对象
			System.out.println("------------------------------");
			component.method();//原来的方法
			ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(component);//装饰成A
			System.out.println("------------------------------");
			concreteDecoratorA.method();//原来的方法
			concreteDecoratorA.methodA();//装饰成A以后新增的方法
			ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB(component);//装饰成B
			System.out.println("------------------------------");
			concreteDecoratorB.method();//原来的方法
			concreteDecoratorB.methodB();//装饰成B以后新增的方法
			concreteDecoratorB = new ConcreteDecoratorB(concreteDecoratorA);//装饰成A以后再装饰成B
			System.out.println("------------------------------");
			concreteDecoratorB.method();//原来的方法
			concreteDecoratorB.methodB();//装饰成B以后新增的方法
	}

}
