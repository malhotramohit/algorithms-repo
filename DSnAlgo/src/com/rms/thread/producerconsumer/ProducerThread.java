package com.rms.thread.producerconsumer;

import java.util.Queue;

public class ProducerThread implements Runnable {
	private Queue<String> queue;
	private int numOfItems;

	public ProducerThread(Queue<String> queue, int numOfItems) {
		super();
		this.queue = queue;
		this.numOfItems = numOfItems;
	}

	@Override
	public void run() {
		for (int i = 0; i < numOfItems; i++) {
			synchronized (queue) {
				if (queue.size() == 4) {
					try {
						queue.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					queue.add("item" + i);
					queue.notify();
				}
			}
		}

	}

}
