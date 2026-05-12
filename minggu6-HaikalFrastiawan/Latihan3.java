import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PROGRAM HITUNG NILAI AKHIR MATERI PEMROGRAMMAN C++");
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumlah = input.nextInt();

        // Deklarasi array untuk menyimpan data
        String[] nama = new String[jumlah];
        double[] nTugas = new double[jumlah];
        double[] nUTS = new double[jumlah];
        double[] nUAS = new double[jumlah];
        double[] nAkhir = new double[jumlah];
        char[] grade = new char[jumlah];

        // Proses Input Data
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMahasiswa Ke - " + (i + 1));
            input.nextLine(); // Membersihkan buffer
            System.out.print("Nama Mahasiswa : ");
            nama[i] = input.nextLine();
            System.out.print("Nilai Tugas    : ");
            nTugas[i] = input.nextDouble();
            System.out.print("Nilai UTS      : ");
            nUTS[i] = input.nextDouble();
            System.out.print("Nilai UAS      : ");
            nUAS[i] = input.nextDouble();

            // Hitung Nilai Akhir
            nAkhir[i] = (nTugas[i] * 0.3) + (nUTS[i] * 0.3) + (nUAS[i] * 0.4);

            // Penentuan Grade
            if (nAkhir[i] >= 80) grade[i] = 'A';
            else if (nAkhir[i] >= 70) grade[i] = 'B';
            else if (nAkhir[i] >= 59) grade[i] = 'C';
            else if (nAkhir[i] >= 50) grade[i] = 'D';
            else grade[i] = 'E';
        }

        // Tampilan Layar Keluaran
        System.out.println("\nDAFTAR NILAI");
        System.out.println("MATERI : PEMROGRAMMAN C++");
        System.out.println("------------------------------------------------------------------");
        System.out.println("No.\tNama\t\tNilai\t\t\t\tGrade");
        System.out.println("Mahasiswa\t------------------------------------------");
        System.out.println("\t\tTugas\tUTS\tUAS\tAkhir");
        System.out.println("------------------------------------------------------------------");

        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%d\t%s\t%.0f\t%.0f\t%.0f\t%.1f\t\t%c\n", 
                (i + 1), nama[i], nTugas[i], nUTS[i], nUAS[i], nAkhir[i], grade[i]);
        }
        System.out.println("------------------------------------------------------------------");
    }
}
