package com.thread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Consumer;

class SharedResources{
	private final Queue<Integer>queue=new LinkedList<>();
	private final int MAX_SIZE=5;
	
	public synchronized void produce(int value)throws InterruptedException{
		while(queue.size()==MAX_SIZE) {
			wait();
		}
		queue.add(value);
		notifyAll();
		
	}
	public synchronized int consume() throws InterruptedException{
		while(queue.isEmpty()) {
			wait();
		}
		int value =queue.poll();
		return value;
	} 
}
class Producer implements Runnable{
	private final SharedResources resources;
	public Producer(SharedResources resources) {
		this.resources=resources;
	}
	@Override
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				resources.produce(i);
				System.out.println("Producer: "+i);
				Thread.sleep(100);
				
			}
			
		}
		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
				}
       		
	}
	class Consumer implements Runnable{
		private final SharedResources resources;
		public Consumer(SharedResources resources) {
			this.resources=resources;
		}
		@Override
		public void run() {
			try {
				for(int i=0;i<10;i++) {
					int value=resources.consume();
					System.out.println("CONSUMED: "+value);
					Thread.sleep(150);
				}
				
			} catch ( InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			
		}
		
	}
	
	
}

public class ProducedConsumerExample {

	public static void main(String[] args) {
		SharedResources resources=new SharedResources();
		Thread producerThread=new Thread(new Producer(resources));
		//Thread consumerThread=new Thread(new Consumer(resources));
		producerThread.start();
		//consumerThread.start();

	}

}
