package Encapsulation;

public class Main {
    public static void main(String[] args){
        System.out.println("============================");
        player();
        System.out.println("============================");
        enhancePlayer();
    }
    public static void player(){
        Player player = new Player();
        player.name = "Leav Chan Dara";
        player.health =20;
        player.weapon = "Sword";
        int damage =10;
        player.loseHealth(damage);
        System.out.println("Remaining health = "+player.healthRemaining());

        damage =10;
        player.health =200;
        player.loseHealth(damage);
        System.out.println("Remaining health = "+player.healthRemaining());


    }
    public static void enhancePlayer(){
        EnhancePlayer player = new EnhancePlayer("leav Chan Dara",200,"Sword");
        System.out.println("Initial health is "+player.getHitPoint());

    }
}
