package com.rms.thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPoolApi {
	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			Thread ti=new Thread(new RunnableTask());
//			ti.start();
//		}
		
		// use newfixedthreadpool
		int noOfcores=Runtime.getRuntime().availableProcessors();
		System.out.println(noOfcores);
		ExecutorService service=Executors.newCachedThreadPool();
		for (int i = 0; i < 100; i++) {
			service.execute(new RunnableTask());
		}
	}
}
