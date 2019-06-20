package com.arrays;

class Bank {
	  public static void main(String[] args) {
	    int phone[] = new int[3];   // primitive type array
	    phone[0] = 033123456;
	    phone[1] = 033123457;       // inserting element in an array
	    phone[2] = 033123454;
	    int count = 1;
	    for(int i = 0; i < phone.length; ++i) {   // traversing an array
	      System.out.println("phone number " + count + ": " + phone[i]);
	      ++count;
	    }
	    
	 // Multi-dimensional arrays are arrays of arrays. The two dimensional
	   // array can be termed as a physical table with rows and columns.
	    int marks[][] = new int [2][3];   // Declares a 2-D array with 2 rows and 3 columns
	    Bank bank[][] = new Bank[2][3];
	    int marks1[][] = new int[2][];   // While instantiating a 2-D array, specifying the size of the 2nd dimension is not mandatory.
	    Bank bank1[][] = new Bank[2][];
	    marks[0] = new int[2];  // First row of the multidimensional array will have 2 columns.
	    bank[0] = new Bank[2];

	    
	    Customer customer[] = new Customer[2]; //Reference type Array
        Customer customer1 = new Customer("Anil", "Acc12345");
        Customer customer2 = new Customer("Ajay", "Acc12346");
        customer[0] = customer1; //storing in the array
        customer[1] = customer2;
        for(int i=0;i<customer.length;i++){ //traversing the array
            Customer customeObject = customer[i]; //retrieving customer Object
            String name = customeObject.displayCustomerName();
            System.out.println("the customer name is..."+name);
            
        }
	  }
	}



class Customer{
    private String name;
    private String customerId;
    
    Customer(String uname, String ucustomerId){
        name = uname;
        customerId = ucustomerId;
    }
    
    public String displayCustomerName(){
        return name;
    }
}
