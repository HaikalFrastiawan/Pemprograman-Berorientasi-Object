import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulang;

        do {
            System.out.println("====================================================");
            System.out.println("   PROGRAM HITUNG NILAI AKHIR MATAKULIAH PBO UNDIRA ");
            System.out.println("====================================================");

            System.out.print("Masukkan Jumlah Mahasiswa: ");
            int jumlah = input.nextInt();
            String[] nama = new String[jumlah];
            double[] nTugas = new double[jumlah], nUTS = new double[jumlah], nUAS = new double[jumlah], nAkhir = new double[jumlah];
            char[] grade = new char[jumlah];

            for (int i = 0; i < jumlah; i++) {
                System.out.println("\nData Mahasiswa Ke-" + (i + 1));
                System.out.println("-----------------------");
                input.nextLine();
                System.out.print("Nama Mahasiswa : ");
                nama[i] = input.nextLine();
                System.out.print("Nilai Tugas    : ");
                nTugas[i] = input.nextDouble();
                System.out.print("Nilai UTS      : ");
                nUTS[i] = input.nextDouble();
                System.out.print("Nilai UAS      : ");
                nUAS[i] = input.nextDouble();
                nAkhir[i] = (nTugas[i] * 0.3) + (nUTS[i] * 0.3) + (nUAS[i] * 0.4);

                if (nAkhir[i] >= 80) grade[i] = 'A';
                else if (nAkhir[i] >= 70) grade[i] = 'B';
                else if (nAkhir[i] >= 59) grade[i] = 'C';
                else if (nAkhir[i] >= 50) grade[i] = 'D';
                else grade[i] = 'E';
            }

            System.out.println("\n\n                      DAFTAR NILAI");
            System.out.println("               MATERI : PEMROGRAMAN PBO UNDIRA");
            System.out.println("-------------------------------------------------------------");
            System.out.printf("| %-2s | %-15s | %-4s | %-4s | %-4s | %-5s | %-5s |\n",
                    "No", "Nama", "Tgs", "UTS", "UAS", "Akhir", "Grade");
            System.out.println("-------------------------------------------------------------");

            for (int i = 0; i < jumlah; i++) {
  
                String namaTampil = (nama[i].length() > 15) ? nama[i].substring(0, 12) + "..." : nama[i];
                System.out.printf("| %-2d | %-15s | %-4.0f | %-4.0f | %-4.0f | %-5.1f | %-5c |\n",
                        (i + 1), namaTampil, nTugas[i], nUTS[i], nUAS[i], nAkhir[i], grade[i]);
            }
            System.out.println("-------------------------------------------------------------");

            System.out.print("Ingin mengulang program? (y/n): ");
            input.nextLine();
            ulang = input.nextLine();
            System.out.println();

        } while (ulang.equalsIgnoreCase("y"));

        System.out.println("Terima kasih. Program Selesai.");
        input.close();
    }
}
