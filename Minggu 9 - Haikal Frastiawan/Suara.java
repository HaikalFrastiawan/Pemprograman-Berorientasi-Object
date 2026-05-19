// File 2: suara.java
class suara extends Binatang {
    String suaraBinatang;
    
    suara() {
        super();
    }
    
    @Override
    public void cetakjenis() {
        suaraBinatang = "Mengaum";
        System.out.println("Suara : " + suaraBinatang);
    }
}