package com.rms.thread.producerconsumer;

import java.util.ArrayDeque;
import java.util.Queue;

public class SharedResource {
	private Queue<String> queue = new ArrayDeque<>(10);

	public  void produce(String item) {
		synchronized (queue) {
			
			if (queue.size() == 4) {
				try {
					queue.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				queue.add(item);
				queue.notify();
			}
		}
	}

	public  String consume() {
		String item = null;
		synchronized (queue) {
			
			if (!queue.isEmpty()) {
				queue.remove();
				queue.notify();
			}
			else
			{
				try {
					queue.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return item;
	}

}
