package com.farsight.thread01;

public class StartRun implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*// 创建实现类
		StartRun sr = new StartRun();
		//创建代理类对象
		Thread t = new Thread(sr);
		//启动
		t.start();*/
		
		//简略写法
		new Thread(new StartRun()).start();
		
		for (int i = 0; i < 20; i++) {
			System.out.println("一边写代码");
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			System.out.println("一边听音乐");
		}
	}

}
