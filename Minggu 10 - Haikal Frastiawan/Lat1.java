import java.util.Scanner;

class Silinder {
    private double radius;
    private double tinggi;

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius harus lebih besar dari 0!");
        }
    }

    public void setTinggi(double tinggi) {
        if (tinggi > 0) {
            this.tinggi = tinggi;
        } else {
            System.out.println("Tinggi harus lebih besar dari 0!");
        }
    }

    public double hitungVolume() {
        return Math.PI * radius * radius * tinggi;
    }
}

public class Lat1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Silinder tabung = new Silinder();

        System.out.println("=== HITUNG VOLUME SILINDER ===");
        System.out.print("Masukkan nilai Radius: ");
        double r = input.nextDouble();
        tabung.setRadius(r);

        System.out.print("Masukkan nilai Tinggi: ");
        double t = input.nextDouble();
        tabung.setTinggi(t);

        System.out.printf("Volume Silinder: %.2f\n", tabung.hitungVolume());
        input.close();
    }
}
