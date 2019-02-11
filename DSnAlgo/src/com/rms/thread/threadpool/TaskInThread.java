package com.rms.thread.threadpool;

public class TaskInThread  implements Runnable{

	private int id;
	
	public TaskInThread(int id) {
		super();
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println("Task :"+id+" is running");
	}

}
