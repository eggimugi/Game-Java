package dasar;

public class Player {
        
    // definisi atribut
    String name;
    int speed;
    int healthPoint;
    int damage;
    int shield;
    
    // definisi method run
    void run(){
        System.out.println(name + " is running...");
        System.out.println("Speed: " + speed);
    }
    
    void attack(){
        System.out.println(name+" Petani is attacking...");
    }
    
    void defense(){
        System.out.println(name+" Petani is defending...");
    }
    
    //definisi method isDead untuk mengecek nilai kesehatan (healthPoint)
    boolean isDead(){
        if(healthPoint <= 0) return true;
        return false;
    }
    
}
