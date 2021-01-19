package EncapsulationChallenge;

public class Main {
    public static void main(String [] args){
        System.out.println("=====================================");
        printer();
        System.out.println("=====================================");
    }
    public static void printer(){
        Printer printer = new Printer(50,true);
        System.out.println("Intail page count =" +printer.getPagesPrinted());
        int pagesPrinted = printer.printPage(4);
        System.out.println("Pages printed was"+ pagesPrinted +"new total print count for printer ="+printer.getPagesPrinted());

        pagesPrinted = printer.printPage(2);
        System.out.println("Pages printed was"+ pagesPrinted +"new total print count for printer ="+printer.getPagesPrinted());


    }
}
