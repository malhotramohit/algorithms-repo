package com.rms.thread.producerconsumer;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class ProdSemThread implements Runnable{
	private Queue<String> sharedQueue;
	private Semaphore sem;
	private int numOfItems;
	

	public ProdSemThread(Queue<String> sharedQueue, Semaphore sem, int numOfItems) {
		super();
		this.sharedQueue = sharedQueue;
		this.sem = sem;
		this.numOfItems = numOfItems;
	}


	@Override
	public void run() {
		
	}

}
