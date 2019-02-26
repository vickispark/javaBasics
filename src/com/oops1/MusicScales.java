package com.oops1;

public class MusicScales {

	protected  String name;
	private int num_notes;
	MusicScales(){
		System.out.println("Def Cons:Parent:MusicScales");	
		name = "Chromatic";
		num_notes = 12;
		
	}
	
    MusicScales(String name,int notes){//Constructor overloading
		System.out.println("Param const::Parent:MusicScales");
		this.name=name;//this keyword used to assign values to instance variables
		this.num_notes=notes;
	}
    
    public String fetchNoteNames() {
    	if(name=="Major") {
        	return "CDEFGABC";
    	}
    	else {
        	return "CC#DD#EFF#GG#AA#BC";
    	}
    }
    
    protected String fetchNoteNames(String name) {//Static Polymorphism Method overloading,Compile time..same name diff parameters
    	if(name=="Major") {
        	return "CDEFGABC";
    	}
    	else {
        	return "CC#DD#EFF#GG#AA#BC";
    	}
    }
	
	public static void main(String[] args) {
            MusicScales ms1 = new MusicScales();
            System.out.println("ms1:"+ms1.name+"\n");
            MusicScales ms2 = new MusicScales("Major",7);
            System.out.println("ms2:"+ms2.name+"\n");
            
            MajorScale Maj1 = new MajorScale();
            String n =Maj1.fetchNoteNames();//Child class Obj calling parent class method
            String n1 =Maj1.fetchNoteNames("Chromatic");//Child class Obj calling parent class method
            System.out.println(n+" "+Maj1.name);
            System.out.println(n1);
            
            MusicScales m1;
            MajorScale Maj2 = new MajorScale();
            m1 = Maj2;//Reference type casting implicit..Parent class refer to subclass
            System.out.println(m1.fetchNoteNames());   
            MinorScale Min2 = new MinorScale();
            m1= Min2;
            System.out.println(Min2.minorScaleMeth());//m1(Parent reference) cant call meths defined only in subclass..
            System.out.println(m1.fetchNoteNames());//m1 can call meths defined in both parent and child
            
	}

}
