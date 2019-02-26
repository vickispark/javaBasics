package com.oops1;

//java multi-level inheritance allowed..e.g all classes extend Object class
//multiple inheritance..extending >1 class not allowed
public class MajorScale extends MusicScales {

	MajorScale(){
		//super not needed to involke default..parent constructor invoked implicitly for default construtor
		//super("fsd",1);//for invoking param its explicit,super should be first line
		name = "Major";//reusing name of Parent class which is protected
		//cannot use num_notes as its private in Parent class..Encapsulation!!
		String name_parent = super.name;//getting instace variable from Parent using super
		System.out.println("Default constructor:Child: MajorScale");
		
	}
	
	MajorScale(String name){
		super();//invoking super class default construtor explicitly
	//	super.name=this.name;//if same variable in both super,sub classes
		//super("name"); can invoke super param constr also
	}

	public String fetchNoteNames() {//Method overriding,runtime..Dynamic Polymorphism
		//child class implementing parent method
		String str =super.fetchNoteNames();//invoking parent class meth using super only if
		//both method names are same
		return "NoteNames from SubClass overridden meth.MajorScale class";
	}
	

}

