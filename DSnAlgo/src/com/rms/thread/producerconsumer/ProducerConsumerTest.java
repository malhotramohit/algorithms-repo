package com.rms.thread.producerconsumer;

import java.util.ArrayDeque;
import java.util.Queue;

public class ProducerConsumerTest {
	public static void main(String[] args) {
		Queue<String> sharedQueue=new ArrayDeque<>(4);
		
		Thread producerThread1= new Thread(new ProducerThread(sharedQueue, 8));
		producerThread1.start();
		
		Thread conumerThread=new Thread(new ConsumerThread(sharedQueue,8));
		conumerThread.start();
		
		try {
			producerThread1.join();
			conumerThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done");
//		SharedResource resource=new SharedResource();
//		//one producer
//		resource.consume();
//		resource.produce("A");
//		resource.produce("B");
//		resource.produce("C");
//		resource.produce("D");
//		resource.consume();
//		resource.produce("E");
//		resource.consume();
	}
}
