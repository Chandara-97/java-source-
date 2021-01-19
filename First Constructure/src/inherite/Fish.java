package inherite;

public class Fish extends Animal{
    private int grilled;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int grilled, int eyes, int fins) {
        super(name,1,1, size, weight);
        this.grilled = grilled;
        this.eyes = eyes;
        this.fins = fins;
    }
    public void rest(){

    }
    public void moveMuscles(){

    }
    public void moveBackfins(){

    }
    public void swim( int speed ){
        moveBackfins();
        moveMuscles();
        super.move(speed);
    }
}
