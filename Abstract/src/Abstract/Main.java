package Abstract;

public class Main {
    public static void main(String[] args) {

        System.out.println("================");
        dog();
//        System.out.println("================");
//        bird();
        System.out.println("================");
        parrot();
    }

    public static void dog(){
        Dog dog = new Dog("LuLu");
        dog.breathe();
        dog.eat();
    }
//    public static void bird(){
//        Bird bird = new Bird("Mony");
//        bird.breathe();
//        bird.eat();
//    }
    public static void parrot(){
        Parrot parrot = new Parrot("Parrot");
        parrot.breathe();
        parrot.eat();
    }

}
