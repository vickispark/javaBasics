package com.superkeyword;

class Loans {
public double calculateEMI(double principal) {
    double simpleInterest = (principal*8.5*5) / 100;
    double emi = (simpleInterest+principal)/5;
    return emi;
    }
}
           
    class HomeLoans extends Loans {
        public double calculateEMI(double principal) {
            int additionaltax = 200;
            double emi = super.calculateEMI(principal);      //calling super class method
            return emi + additionaltax;
        }
    }
           
    class ExecuteLoans {
        public static void main(String[] args) {
            Loans loan = null;
            loan =  new HomeLoans();                 // Runtime polymorphism
             double hloan = loan.calculateEMI(2000000);
             System.out.println("Home loan emi per year..."+ hloan);
        }
    }