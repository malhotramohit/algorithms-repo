package com.rms.thread.threadpool;

public class RunnableTask implements Runnable{

	@Override
	public void run() {
		System.out.println("Current thread name :"+ Thread.currentThread().getName());
	}

}
