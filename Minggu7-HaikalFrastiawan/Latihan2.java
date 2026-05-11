import java.util.Scanner;

class Latihan2 {

    double pembelian;


    public double potong() {
        if (pembelian < 1000000) {
            return 0;
        } else if (pembelian >= 1000000 && pembelian <= 5000000) {
            return 0.20 * pembelian;
        } else {
            return 0.35 * pembelian; 
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Latihan2 obj = new Latihan2();


        System.out.print("Besar pembelian barang Rp. ");
        obj.pembelian = scan.nextDouble();


        double besarDiskon = obj.potong();
        double totalBayar = obj.pembelian - besarDiskon;


        System.out.println("Besar diskon yang diberikan Rp. " + (long)besarDiskon);
        System.out.println("Besar harga yang harus dibayarkan Rp. " + (long)totalBayar);
        
        scan.close();
    }
}
