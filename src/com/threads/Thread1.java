package com.threads;

public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   new Thread(() -> {       //using lambda annonymous thread
               System.out.println("Thread-1");
        }).start();
		   new Thread(() -> {
               System.out.println("Thread-2");
        }).start();
	}

}
