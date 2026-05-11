import java.util.Scanner;

class Latihan5 {
    // Variabel pendukung
    String namaPeminjam;
    char golonganBuku;
    int lamaPinjam;

    // Method untuk Menghitung Harga Sewa per 7 hari
    public int hitungHargaSewa() {
        int harga = 0;
        if (golonganBuku == 'A' || golonganBuku == 'a') {
            harga = 200;
        } else if (golonganBuku == 'B' || golonganBuku == 'b') {
            harga = 250;
        } else if (golonganBuku == 'C' || golonganBuku == 'c') {
            harga = 150;
        }
        return harga;
    }

    // Method untuk Menghitung Denda jika lebih dari 7 hari
    public int hitungDenda() {
        int denda = 0;
        if (lamaPinjam > 7) {
            denda = (lamaPinjam - 7) * 100;
        }
        return denda;
    }

    // Method untuk Menghitung Total Bayar
    public int hitungTotal(int sewa, int denda) {
        return sewa + denda;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Latihan5 obj = new Latihan5();

        // Tampilan Layar Masukan
        System.out.println("Perpustakaan Rakyat Pedesaan");
        System.out.println("----------------------------");
        System.out.print("Nama Peminjam        : ");
        obj.namaPeminjam = scan.nextLine();
        System.out.print("Golongan Buku [A/B/C]: ");
        obj.golonganBuku = scan.next().charAt(0);
        System.out.print("Lama Peminjaman      : ");
        obj.lamaPinjam = scan.nextInt();

        // Proses Pemanggilan Method
        int sewa = obj.hitungHargaSewa();
        int denda = obj.hitungDenda();
        int total = obj.hitungTotal(sewa, denda);

        // Tampilan Layar Keluaran
        System.out.println("\nPerpustakaan Rakyat Pedesaan");
        System.out.println("Pembayaran Peminjaman Buku");
        System.out.println("----------------------------");
        System.out.println("Nama Peminjam            : " + obj.namaPeminjam);
        System.out.println("Harga Sewa Buku          : " + sewa);
        System.out.println("Lama Peminjaman          : " + obj.lamaPinjam + " Hari");
        System.out.println("Jumlah Bayar             : " + sewa);
        System.out.println("Besar Denda              : " + denda);
        System.out.println("------------------------------------------------");
        System.out.println("Jumlah yang Harus dibayar Rp. " + total);

        scan.close();
    }
}