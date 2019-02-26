package com.oops2;

public abstract class test3 {//an abstract class
	
	abstract public void meth1();//abstract meths without body
	abstract public void meth3();//abstract meths without body

	public void meth2() {//concrete method with body
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Abstact classes cannot be instantiated using new keyword..no objects for abstract class");
        System.out.println("a class can inherit abstract class ONLY IF IT IMPLEMENTS all its abstract meths");
	subTest3 st3 = new subTest3();
	st3.meth1();
	st3.meth2();
	//test3 t3=new test3();//cant be instantiated as test3 is abstract
	
	}

}


 class subTest3 extends test3{
	
	public void meth1() {
		System.out.println("implement test3 classes abstract meth meth1");
	}
	 public void meth3() {
		
	}
}
 
 abstract class subTest3_1 extends test3{//subclass declared abstract as it's not implementing meth3
	 //hence cant instantiate this sub class then
		
	public void meth1() {
		System.out.println("subTest3_1:implement test3 classes abstract meth meth1");
	}
	abstract public void meth3() ;//not implementing meth3 so declare class abstract
		
}