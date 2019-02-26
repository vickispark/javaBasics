package com.oops2;

 interface ChangeBankAddress{//Interfaces: A contract for a class
	
	String proof_type="adhar";//variables in interface are default public and  final
	
	boolean fillForm();//methods are default public and abstract 
}

 interface ChangePhNum{//Interfaces: A contract for a class
		
		String proof_type="OTP";//variables in interface are default public and  final
		
		boolean fillForm_1();//methods are default public and abstract 
	}


class Cust implements ChangeBankAddress,ChangePhNum{//CAN IMPLEMENT multiple interfaces
	
	public boolean fillForm() {
		return true;
	}
	
	public boolean fillForm_1() {
		return true;
	}
}


public class test4 {

	public static void main(String[] args) {
       
		ChangeBankAddress ch1 =  new Cust();
		ch1.fillForm();
		System.out.println(ch1.proof_type);
		
		ChangePhNum ch2 =  new Cust();
		ch2.fillForm_1();
		System.out.println(ch2.proof_type);

		
	}

}