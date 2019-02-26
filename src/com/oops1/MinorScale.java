package com.oops1;

//java multi-level inheritance allowed..e.g all classes extend Object class
//multiple inheritance..extending >1 class not allowed
public class MinorScale extends MusicScales {

	MinorScale(){
		name = "MinorScale";//reusing name of Parent class which is protected
		//cannot use num_notes as its private in Parent class..Encapsulation!!
		
		System.out.println("Def const:Child: MinorScale");
	}

	public String fetchNoteNames() {//Method overriding,runtime..Dynamic Polymorphism
		//child class implementing parent method
		return "NoteNames from SubClass overridden meth.MinorScale";
	}
	
	public String minorScaleMeth() {
		return "from minor scale Methd";
	}
	

}

