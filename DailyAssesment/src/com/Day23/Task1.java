package com.Day23;
class NumberPrintes implements Runnable{
	@Override
	public void run()
{
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(1000);
				
			}
			catch (InterruptedException e) {
				e.printStackTrace();			}
		}
			}
}


public class Task1 {

	public static void main(String[] args) {
		Thread tread1=new Thread(new NumberPrintes());
		Thread tread2=new Thread(new NumberPrintes());
		tread1.start();
		tread2.start();
		
		try {
			tread1.join();
			tread2.join();
			
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Both Treads hava finished exicuting");

		

	}

}
