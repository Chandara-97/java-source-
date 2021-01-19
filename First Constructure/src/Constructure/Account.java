package Constructure;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhonenumber;

    public Account(){

        System.out.println("Empty Constructure Called ");
    }

    public Account(String number, double balance, String customerName, String customerEmail, String customerPhonenumber) {
        System.out.println("Account Construture with parameter called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhonenumber = customerPhonenumber;
    }

    public void deposite(double depositeAmount){
        this.balance += depositeAmount;
        System.out.println("Deposite of"+depositeAmount+"made balance is"+balance);
    }
    public void withdrawal(double withdrawal){
        if((this.balance-withdrawal)<=0){
            System.out.println("only"+balance+"available withdrawal is processed");
        }
        else{
            balance -= withdrawal;
            System.out.println("Withdrawal of "+ withdrawal+"processed remaining"+balance);
        }
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhonenumber() {
        return customerPhonenumber;
    }

    public void setCustomerPhonenumber(String customerPhonenumber) {
        this.customerPhonenumber = customerPhonenumber;
    }
}
