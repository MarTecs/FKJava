package com.prac;

public class FirstThreadPrac extends Thread{

	@Override
	public void run() {
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println(i + "    " + Thread.currentThread().getName());
		}
		
	}
	
	public static void main(String[] args) {
		
		//请注意：这里将会有3个线程，还会包含一个主线程
		
		Thread thread1 = new FirstThreadPrac();
		Thread thread2 = new FirstThreadPrac();
		thread1.start();
		thread2.start();
		
		
	}
}
