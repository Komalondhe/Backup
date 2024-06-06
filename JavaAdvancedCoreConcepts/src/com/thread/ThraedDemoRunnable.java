package com.thread;
class MyRunnable implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("Child Thread"+i);
		}
	}
}
public class ThraedDemoRunnable {

	public static void main(String[] args) {
		MyRunnable runnable=new MyRunnable();
		Thread t=new Thread(runnable);
		t.start();
		for(int i=1;i<=3;i++) {
			System.out.println("Main Tread"+i);
		}
				
	}

}
