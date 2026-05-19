// File 4: Harimau.java
public class Harimau {
    public static void main(String[] args) {
        suara binatang = new suara();
        JenisBinatang jns = new JenisBinatang("Harimau");
        
        jns.cetakjenis();
        binatang.cetakjenis();
    }
}