import java.util.Scanner;

class Latihan1 {
    // Variabel untuk menyimpan angka-angka
    double[] daftarAngka;

    // Method sederhana untuk mencari nilai paling besar
    public double cariMaksimal() {
        double max = daftarAngka[0];
        for (int i = 1; i < daftarAngka.length; i++) {
            if (daftarAngka[i] > max) {
                max = daftarAngka[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Latihan1 obj = new Latihan1();

        System.out.print("Mau masukkan berapa angka? ");
        int jumlah = scan.nextInt();

        // Membuat tempat di memori untuk angka tersebut
        obj.daftarAngka = new double[jumlah];

        // Mengisi angka satu per satu
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + " : ");
            obj.daftarAngka[i] = scan.nextDouble();
        }

        // Memanggil fungsi pencarian
        double hasil = obj.cariMaksimal();

        System.out.println("---------------------------------------");
        System.out.println("Nilai yang paling besar adalah: " + hasil);
        
        scan.close();
    }
}