package com.thread;
class mythread extends Thread{
	public void run() {
		for(int i=0;i<=3;i++) {
			System.out.println("child tread"+i);
		}
	}
}

public class DemoThread {
	public static void main(String[] args) {
		mythread tMythread=new mythread();
		tMythread.start();
		for(int i=1;i<=3;i++) {
			System.out.println("Main tread"+i);
		}

	}

}
