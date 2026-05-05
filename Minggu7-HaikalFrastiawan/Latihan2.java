import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        int banyakJenis;
        String[] jenisPotong = new String[10];
        char[] kodePotong = new char[10];
        int[] hargaSatuan = new int[10];
        int[] banyakBeli = new int[10];
        int[] jumlahHarga = new int[10];
        
        int jumlahBayar = 0;
        double pajak, totalBayar;

        
        System.out.println("GEROBAK FRIED CHICKEN");
        System.out.println("---------------------------");
        System.out.println("Kode   Jenis      Harga");
        System.out.println("---------------------------");
        System.out.println("D      Dada       Rp. 2500");
        System.out.println("P      Paha       Rp. 2000");
        System.out.println("S      Sayap      Rp. 1500");
        System.out.println("---------------------------");

        System.out.print("Banyak Jenis : ");
        banyakJenis = input.nextInt();

        
        for (int i = 0; i < banyakJenis; i++) {
            System.out.println("\nJenis Ke - " + (i + 1));
            System.out.print("Jenis Potong [D/P/S] : ");
            kodePotong[i] = input.next().toUpperCase().charAt(0);
            System.out.print("Banyak Potong        : ");
            banyakBeli[i] = input.nextInt();

            
            if (kodePotong[i] == 'D') {
                jenisPotong[i] = "Dada ";
                hargaSatuan[i] = 2500;
            } else if (kodePotong[i] == 'P') {
                jenisPotong[i] = "Paha ";
                hargaSatuan[i] = 2000;
            } else if (kodePotong[i] == 'S') {
                jenisPotong[i] = "Sayap";
                hargaSatuan[i] = 1500;
            } else {
                jenisPotong[i] = "-----";
                hargaSatuan[i] = 0;
            }

            jumlahHarga[i] = hargaSatuan[i] * banyakBeli[i];
            jumlahBayar += jumlahHarga[i];
        }

        
        pajak = jumlahBayar * 0.10;
        totalBayar = jumlahBayar + pajak;

        
        System.out.println("\n\nGEROBAK FRIED CHICKEN");
        System.out.println("---------------------------------------------------------");
        System.out.println("No.  Jenis        Harga        Banyak       Jumlah");
        System.out.println("     Potong       Satuan       Beli         Harga");
        System.out.println("---------------------------------------------------------");
        
        for (int i = 0; i < banyakJenis; i++) {
            System.out.printf("%d    %s        Rp. %-8d %-10d Rp. %d\n", 
                (i + 1), jenisPotong[i], hargaSatuan[i], banyakBeli[i], jumlahHarga[i]);
        }

        System.out.println("---------------------------------------------------------");
        System.out.printf("                        Jumlah Bayar  Rp. %d\n", jumlahBayar);
        System.out.printf("                        Pajak 10%%     Rp. %.0f\n", pajak);
        System.out.printf("                        Total Bayar   Rp. %.0f\n", totalBayar);
    }
}
