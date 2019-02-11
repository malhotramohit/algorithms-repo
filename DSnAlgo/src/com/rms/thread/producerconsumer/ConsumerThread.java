package com.rms.thread.producerconsumer;

import java.util.Queue;

public class ConsumerThread implements Runnable {
	private Queue<String> queue;
	private int numOfItems;
	

	

	public ConsumerThread(Queue<String> queue, int numOfItems) {
		super();
		this.queue = queue;
		this.numOfItems = numOfItems;
	}




	@Override
	public void run() {
		int i=0;
		while(i<numOfItems)
		{
			synchronized (queue) {
				if(queue.isEmpty())
				{
					try {
						queue.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else {
					System.out.println(queue.remove());
					queue.notify();
				}
			}
			i++;
			
		}
		
		
	}

}
