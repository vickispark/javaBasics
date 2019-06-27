package com.generics;

import java.util.ArrayList;
import java.util.List;

class Recordd<E>
{
	List<E> record =new ArrayList<>();
    
    @Override
	public String toString() {
		return "Record [record=" + record + "]";
	}
	public void add(E e)
    {	
    	record.add(e);
    }
    public void display(Recordd<? extends Studentt> record) {
    	System.out.println("student record:"+record);
}
}

class Studentt
{
    int id;
    String name;
    
    public Studentt(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    
    public String toString()
    {
        return "Id = "+id+" Name = "+name;
    }
}

class Dayscholar extends Studentt
{
    float stipend;
    
    public Dayscholar(int id,String name,float stipend)
    {
        super(id,name);
        this.stipend=stipend;
    }
    public String toString()
    {
        return "Id = "+id+" Name = "+name+" Stipend = "+stipend;
    }
}

class WildcardsDemo
{   
    public static void main(String args[])
    {
    Recordd<Studentt> studentrecord = new Recordd<>();
    Studentt student = new Studentt(101,"Adam");
    
    Recordd<Dayscholar> dayscholaarecord = new Recordd<>();
    Dayscholar dayscholar = new Dayscholar(102,"Robert",10000f);
    
    studentrecord.add(student);
    studentrecord.display(studentrecord);
    
    dayscholaarecord.add(dayscholar);
    dayscholaarecord.display(dayscholaarecord);
    }
}

