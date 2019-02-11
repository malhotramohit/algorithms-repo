package com.rms.thread.threadpool;

import java.util.concurrent.LinkedBlockingDeque;

public class ThreadPool {
	private LinkedBlockingDeque<Runnable> queue;
	private PoolWorker[] poolWorker;

	public ThreadPool(int numOfThreads) {
		queue = new LinkedBlockingDeque<>();
		poolWorker = new PoolWorker[numOfThreads];
		for (int i = 0; i < numOfThreads; i++) {
			poolWorker[i] = new PoolWorker();
			poolWorker[i].start();
		}
	}

	public void execute(Runnable task) {
		synchronized (queue) {
			queue.add(task);
			queue.notify();
		}
	}

	private class PoolWorker extends Thread {
		Runnable task;

		@Override
		public void run() {
			while (true) {
				synchronized (queue) {
					while (queue.isEmpty()) {
						try {
							queue.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

				}
				task = queue.poll();
				System.out.println(this.getName());
				task.run();
			}
		}

	}

	public void shutDown() {
		for (int i = 0; i < poolWorker.length; i++) {
			poolWorker[i].stop();

		}
	}
}
