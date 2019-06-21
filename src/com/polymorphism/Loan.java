package com.polymorphism;

class Loan{
    private float interest;
    
    Loan(){
        interest = 8.5f;
    }
    
    //calculateEMI overloaded methods
    public double calculateEMI(int tenure, double principal){
        double simpleInterest = (principal * interest * tenure) / 100;
        double emi = (simpleInterest+principal) / tenure;
        return emi;
    }
    public double calculateEMI(double principal, int tenure){
        double simpleInterest = (principal * interest * tenure) / 100;
        double emi = (simpleInterest+principal) / tenure;
        return emi;
    }
    public double calculateEMI(int tenure, double principal, float interest){
        double simpleInterest = (principal * interest * tenure) / 100;
        double emi = (simpleInterest+principal) / tenure;
        return emi;
    }
    
    public static void main(String[] args){
        Loan loan = new Loan();
        double result = loan.calculateEMI(20000d, 5); //d means double
        double value = loan.calculateEMI(5, 20000d);
        double val = loan.calculateEMI(5, 20000, 9.5f); // f means float
        
        System.out.println("EMI per year is..." + result);
        System.out.println("EMI per year is..." + value);
        System.out.println("EMI per year is..." + val);
        
    }
}