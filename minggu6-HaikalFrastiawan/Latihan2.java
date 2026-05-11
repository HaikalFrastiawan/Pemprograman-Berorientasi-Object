import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Header Menu
        System.out.println("GEROBAK FRIED CHICKEN");
        System.out.println("---------------------------");
        System.out.println("Kode   Jenis      Harga");
        System.out.println("---------------------------");
        System.out.println("D      Dada       Rp. 2500");
        System.out.println("P      Paha       Rp. 2000");
        System.out.println("S      Sayap      Rp. 1500");
        System.out.println("---------------------------\n");

        System.out.print("Banyak Jenis : ");
        int banyakJenis = input.nextInt();

        // Deklarasi array untuk menampung data
        String[] jenisPotong = new String[banyakJenis];
        int[] hargaSatuan = new int[banyakJenis];
        int[] banyakBeli = new int[banyakJenis];
        int[] jumlahHarga = new int[banyakJenis];

        // Proses Input
        for (int i = 0; i < banyakJenis; i++) {
            System.out.println("Jenis Ke - " + (i + 1));
            System.out.print("Jenis Potong [D/P/S] : ");
            char kode = input.next().toUpperCase().charAt(0);
            System.out.print("Banyak Potong        : ");
            banyakBeli[i] = input.nextInt();

            // Penentuan jenis dan harga berdasarkan kode
            if (kode == 'D') {
                jenisPotong[i] = "Dada";
                hargaSatuan[i] = 2500;
            } else if (kode == 'P') {
                jenisPotong[i] = "Paha";
                hargaSatuan[i] = 2000;
            } else if (kode == 'S') {
                jenisPotong[i] = "Sayap";
                hargaSatuan[i] = 1500;
            } else {
                jenisPotong[i] = "Kode Salah";
                hargaSatuan[i] = 0;
            }

            jumlahHarga[i] = hargaSatuan[i] * banyakBeli[i];
            System.out.println();
        }

        // Layar Keluaran
        System.out.println("\nGEROBAK FRIED CHICKEN");
        System.out.println("----------------------------------------------------------");
        System.out.println("No.   Jenis        Harga       Banyak      Jumlah");
        System.out.println("      Potong       Satuan      Beli        Harga");
        System.out.println("----------------------------------------------------------");

        long jumlahBayar = 0;
        for (int i = 0; i < banyakJenis; i++) {
            System.out.printf("%-5d %-12s %-11d %-11d Rp %d\n", 
                (i + 1), jenisPotong[i], hargaSatuan[i], banyakBeli[i], jumlahHarga[i]);
            jumlahBayar += jumlahHarga[i];
        }

        // Perhitungan Pajak dan Total
        double pajak = jumlahBayar * 0.1;
        double totalBayar = jumlahBayar + pajak;

        System.out.println("----------------------------------------------------------");
        System.out.printf("                        Jumlah Bayar  Rp %d\n", jumlahBayar);
        System.out.printf("                        Pajak 10%%     Rp %.0f\n", pajak);
        System.out.printf("                        Total Bayar   Rp %.0f\n", totalBayar);
        
        input.close();
    }
}