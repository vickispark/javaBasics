package com.generics;

class UserInterface {
    public static <E> void display(E[] list) {    // generic method displaying the elements of an array
        for (int i = 0; i < list.length; i++)
            System.out.println(list[i] + ", ");
    }
    public static void main(String[] args) {
    	String cities[] = {"Bengaluru", "Chennai"};
    	Integer codes[] = {12,14,15};
    	UserInterface.display(codes);
    	UserInterface.display(cities);
    	
	}
    
}