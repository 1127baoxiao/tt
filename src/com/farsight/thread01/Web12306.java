package com.farsight.thread01;

public class Web12306 implements Runnable {
	private int ticketNums = 20;

	@Override
	public void run() {
		while (true) {
			if (ticketNums < 0) {
				break;
			}			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			//Thread.currentThread().getName()获取线程的名字
			System.out.println(Thread.currentThread().getName() + "-->" + ticketNums--);
		}
	}
	public static void main(String[] args) {
		
		Web12306 web = new Web12306();
		System.out.println(Thread.currentThread().getName());
		new Thread(web,"小明").start();
		new Thread(web,"小红").start();
		new Thread(web,"小强").start();
	}

}
