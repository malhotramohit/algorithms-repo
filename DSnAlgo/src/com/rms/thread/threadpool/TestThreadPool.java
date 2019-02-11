package com.rms.thread.threadpool;

public class TestThreadPool {
	public static void main(String[] args) {
		ThreadPool pool= new ThreadPool(3);
		for (int i = 0; i < 5; i++) {
			pool.execute(new TaskInThread(i));
		}
	}
}
