package com.Finnal;

public final class Demo2 {
	int tenure = 0;
	double principal;
	float interestRate;
	String accountNumber;
    double calculateEMI(){
		return 2000;
	}
}

  class Dummy extends Demo2{
  
  // Error as  class is final
  double calculateEMI(){
		return 8000;
	}
  
  }	

class FinalDemo{
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.tenure);
		System.out.println(d.calculateEMI());
	}
}