package Constructure;

public class Main {
    public static void main(String[] args){
        setMethodIntialiaze();
        directInitailizeConstructure();

    }
    public static void setMethodIntialiaze(){
        Account account = new Account();
        account.setNumber("1245");
        account.setBalance(0.00);
        account.setCustomerEmail("leav.chandara797@gmail.com");
        account.setCustomerName("leav Chan Dara");
        account.setCustomerPhonenumber("017445647");
        account.withdrawal(100.0);
        account.deposite(50.0);
        account.withdrawal(100.0);
        System.out.println("==============================================");
    }

    public static void directInitailizeConstructure(){
        Account intailVauleAccount = new Account("124567",1000.0,"Leav Chan Dara","leav.chandar7997@gmail.com","017445647");
        System.out.println(intailVauleAccount.getCustomerName());
        System.out.println(intailVauleAccount.getNumber());
        System.out.println(intailVauleAccount.getBalance());
        System.out.println(intailVauleAccount.getCustomerEmail());
        System.out.println(intailVauleAccount.getCustomerPhonenumber());
        System.out.println("==============================================");
    }
}
