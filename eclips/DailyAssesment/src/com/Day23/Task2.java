package com.Day23;
class TreadLifeCycleSimulator implements Runnable{

	@Override
	public void run() {
System.out.println("Thread state NEW");		
	
	try {
	Thread.sleep(10000);
	System.out.println("Thread state:RUNNABLE");
	
	synchronized (this) {
		wait();
		System.out.println();
		
	}
	Thread.sleep(2000);
	System.out.println("Thread state :TIMED_WAITING");
	TreadLifeCycleSimulator otherThread=new TreadLifeCycleSimulator();
	Thread newThread=new Thread(otherThread);
	newThread.start();
	newThread.join();
	System.out.println("Thread state :BLOCKED");
	System.out.println("Thread state: TERMINATED");
	

	}
	catch (InterruptedException e) {
		
e.printStackTrace();	}
	
	}
	
}

public class Task2 {

	public static void main(String[] args) {
		TreadLifeCycleSimulator  thread=new TreadLifeCycleSimulator();
		Thread t=new Thread(thread);
		t.start();
		}

}
