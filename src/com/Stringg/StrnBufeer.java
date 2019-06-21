package com.Stringg;


class StringBufferDemo{
   
 public static void main(String[] args){
     
   String firstName="Sachin";
   String lastName="Tendulkar";
   String fullName=firstName+lastName;
   //'+'operator concatenates the string but creates a new object in the heap memory as sting is immutable
   System.out.println(fullName);
   StringBuffer sb=new StringBuffer(firstName);
   String fName=sb.append(lastName).toString();//toString method converts StringBuffer to String
   //StringBuffer is mutable, it appends to a single object
   System.out.println(fName);
   
 }
}
   
   