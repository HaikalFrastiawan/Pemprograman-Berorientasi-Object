import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Hitung Honor Karyawan Kontrak PT. EASY");
        System.out.print("Masukkan Jumlah Karyawan : ");
        int jumlah = input.nextInt();

        // Siapkan tempat penyimpanan data menggunakan array dasar
        String[] nama = new String[jumlah];
        int[] gol = new int[jumlah];
        int[] pend = new int[jumlah];
        int[] jam = new int[jumlah];
        
        double[] tunjJab = new double[jumlah];
        double[] tunjPen = new double[jumlah];
        double[] lembur = new double[jumlah];
        double[] gajiBersih = new double[jumlah];

        int honorTetap = 700000;

        // Proses Input dan Perhitungan Langsung
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nKaryawan Ke - " + (i + 1));
            System.out.print("Nama Karyawan      : ");
            input.nextLine(); // Pembersih enter
            nama[i] = input.nextLine();
            System.out.print("Golongan (1/2/3)   : ");
            gol[i] = input.nextInt();
            System.out.print("Pendidikan (1=SMU/2=D3/3=S1) : ");
            pend[i] = input.nextInt();
            System.out.print("Jumlah Jam Kerja   : ");
            jam[i] = input.nextInt();

            // Hitung Tunjangan Jabatan
            if (gol[i] == 1) tunjJab[i] = 0.05 * honorTetap;
            else if (gol[i] == 2) tunjJab[i] = 0.10 * honorTetap;
            else if (gol[i] == 3) tunjJab[i] = 0.15 * honorTetap;

            // Hitung Tunjangan Pendidikan
            if (pend[i] == 1) tunjPen[i] = 0.025 * honorTetap;
            else if (pend[i] == 2) tunjPen[i] = 0.05 * honorTetap;
            else if (pend[i] == 3) tunjPen[i] = 0.075 * honorTetap;

            // Hitung Lembur
            if (jam[i] > 240) {
                lembur[i] = (jam[i] - 240) * 2500;
            } else {
                lembur[i] = 0;
            }

            // Hitung Total
            gajiBersih[i] = honorTetap + tunjJab[i] + tunjPen[i] + lembur[i];
        }

        // Tampilan Keluaran
        System.out.println("\nPT. EASY");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("No. Nama        Tunjangan");
        System.out.println("    Karyawan    -----------------   Honor    Pajak    Gaji");
        System.out.println("                Jabatan  Pdidikan   Lembur            Bersih");
        System.out.println("---------------------------------------------------------------------------");

        double totalGajiDikeluarkan = 0;
        for (int i = 0; i < jumlah; i++) {
            System.out.print((i + 1) + "   " + nama[i] + "\t");
            System.out.print(tunjJab[i] + "\t " + tunjPen[i] + "\t    ");
            System.out.print(lembur[i] + "\t 0\t  Rp. " + gajiBersih[i] + "\n");
            
            totalGajiDikeluarkan += gajiBersih[i];
        }

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Total Gaji yang dikeluarkan Rp. " + totalGajiDikeluarkan);
        
        input.close();
    }
}