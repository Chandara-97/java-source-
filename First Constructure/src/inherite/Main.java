package inherite;

public class Main {
    public static void main(String[] args){
        dogInformation();
    }
    public static void dogInformation(){
        System.out.println("=====================================");
        Dog dog = new Dog("lulu",12,11,10,9,8,7,"kmengPeal");
        dog.eat();
        dog.chew();
        dog.run();
        dog.walk();
        System.out.println("=====================================");
    }
}
