import java.util.Scanner;

class Latihan4 {
    // Variabel pendukung
    String namaPenyewa;
    char kodeBuku;
    int banyakPinjam;
    String jenisBuku;

    // Method Tarif untuk menentukan tarif penyewaan
    public int Tarif() {
        int harga = 0;
        
        if (kodeBuku == 'C' || kodeBuku == 'c') {
            jenisBuku = "CerPen ( Kumpulan Cerita Pendek )";
            harga = 500;
        } else if (kodeBuku == 'K' || kodeBuku == 'k') {
            jenisBuku = "Komik";
            harga = 700;
        } else if (kodeBuku == 'N' || kodeBuku == 'n') {
            jenisBuku = "Novel";
            harga = 1000;
        } else {
            jenisBuku = "Kode Tidak Dikenal";
            harga = 0;
        }
        
        return harga;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Latihan4 obj = new Latihan4();

        // Tampilan Masukan
        System.out.println("Perpustakaan \".Kecil-Kecilan\".");
        System.out.println("----------------------------");
        System.out.print("Nama Penyewa Buku : ");
        obj.namaPenyewa = scan.nextLine();
        System.out.print("Kode Buku [C/K/N] : ");
        obj.kodeBuku = scan.next().charAt(0);
        System.out.print("Banyak Pinjam     : ");
        obj.banyakPinjam = scan.nextInt();

        // Proses Hitung
        int tarifSewa = obj.Tarif();
        int totalBayar = tarifSewa * obj.banyakPinjam;

        // Tampilan Keluaran
        System.out.println("\n----------------------------");
        System.out.println("Tarif Sewa Rp. " + tarifSewa);
        System.out.println("Jenis Buku : " + obj.jenisBuku);
        System.out.println("\nPenyewa dengan Nama " + obj.namaPenyewa);
        System.out.println("Jumlah Bayar Penyewaan Sebesar Rp. " + totalBayar);

        scan.close();
    }
}