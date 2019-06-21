package com.interfacee;

interface IBank2 {
    int CAUTION_MONEY = 2000;
    String createAccount(Customer2 customer);
    double issueVehicleLoan(String vehicleType, Customer2 customer);
    double issueHouseLoan(Customer2 customer);
    double issueGoldLoan(Customer2 customer);
}
class Customer2 {
    private String name;
    private String customerId;
        
    public String getName() {
        return name;
    }
        
    public void setName(String name) {
        this.name=name;
    }
    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId= customerId;
    }
}
class MumbaiBranch2 implements IBank2 {
    public String createAccount(Customer2 customer){
        return "Acc12345";
    }
    public double issueVehicleLoan(String vehicleType,Customer2 customer){ 
        if(vehicleType.equals("bike")) {
            return 100000;
        }
        else {
            return 500000;
        }
    }
    public double issueHouseLoan(Customer2 customer){
        return 200000;
    }
    public double issueGoldLoan(Customer2 customer){
        return 500000;
    }
}

class Execute2{
    public static void main(String[] args){
        IBank2 bank=new MumbaiBranch2();  
        Customer2 customer = new Customer2();
        customer.setCustomerId("cust1001");
        customer.setName("Ajay");
        String accountNumber = bank.createAccount(customer);
        System.out.println("Account number is..." +accountNumber);
        double gloan = bank.issueGoldLoan(customer);
        System.out.println("Gold loan amount is..." +gloan);
        double hloan = bank.issueHouseLoan(customer);
        System.out.println("House loan amount is..." +hloan);
        double vloan = bank.issueVehicleLoan("bike", customer);
        System.out.println("Vehicle loan amount is..." +vloan);
        System.out.println("Caution money is..." +IBank.CAUTION_MONEY);
    }
}