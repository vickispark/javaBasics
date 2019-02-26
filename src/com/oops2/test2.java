package com.oops2;

import java.util.Date;

public class test2 {

	static {
		
		System.out.println("static blocks are run only once when class is loaded,irrespective of num of instaces of class");
	}
	
	public static Date current_dt = new Date();//static variable..global variable so all objects can share

	public  static void aStaticMeth() {
		System.out.println(current_dt);//static meths can access static members
	}
	
	public static int meth2(int...val) {//a method with variable number of arguments
	    int res=0;
		for(int i:val) {//Enhanced for loop
			res+=i;
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(test2.current_dt);//static variables are accessed using class name,not object
	
	   test2.aStaticMeth();//static meths called using class name only
	   System.out.println(test2.meth2(1));
	   System.out.println(test2.meth2(1,2,3,4));
	}

}
