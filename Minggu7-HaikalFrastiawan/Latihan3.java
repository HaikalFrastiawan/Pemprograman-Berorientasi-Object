import java.util.Scanner;

class Latihan3 {
    double fahrenheit;


    public double hitungCelsius() {
        double celsius = (fahrenheit - 32.0) * 5 / 9;
        return celsius;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Latihan3 obj = new Latihan3();

        System.out.println("=== Program Konversi Suhu ===");
        
        // Layar Masukkan
        System.out.print("Masukkan nilai Fahrenheit: ");
        obj.fahrenheit = scan.nextDouble();

        double hasilCelsius = obj.hitungCelsius();

        System.out.printf("Nilai dalam Celsius: %.4f\n", hasilCelsius);
        
        scan.close();
    }
}
