package com.farsight.thread01;

public class TestCreate {

	public static void main(String[] args) {

		// 第一种
		// new MyThread1().start();

		// 第二种
		// new Thread(new MyThread2()).start();

		// 创建一个匿名的类并且实现 了Runnable接口，重写了接口当中的抽象方法
		// 匿名内部类的语法执行完之后会立即创建一个该匿名类的对象
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					System.out.println("第三种方式创建线程");
				}
			}
		}).start();

	}

}

//第一种方式创建线程extends Thread
class MyThread1 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while (true) {
			System.out.println("第一种方式创建线程");
		}
	}
}

// 第二种方式创建线程
class MyThread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("第二种方式创建线程");
		}
	}

}
