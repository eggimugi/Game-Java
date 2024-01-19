package dasar;

public class gameDrone {
    public static void main(String[] args) {
        
        // membuat objek drone
        Drone victus = new Drone();
        
        
        // mengisi atribut victus
        victus.energi = 20;
        victus.kecepatan = 40;
        victus.ketinggian = 0;
        victus.merek = "hp";
        
        // menjalankan method
        victus.terbang();
        
        victus.matikanMesin();
        
    }
}
