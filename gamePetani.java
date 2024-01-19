package dasar;

public class gamePetani {
    public static void main(String[] args) {
        
        // membuat objek player
        Player petani = new Player();
        
        // mengisi atribut player
        petani.name = "Petani Kode";
        petani.speed = 78;
        petani.healthPoint = 100;
        petani.damage = 70;
        petani.shield = 50;
        
        // menjalankan method
        petani.run();
        petani.attack();
        petani.defense();
        
        if(petani.isDead()){
            System.out.println("Game Over!");
        }
        
    }
}