
import java.util.Scanner;

public class latian2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        int nilaiKeaktifan, nilaiTugas, nilaiUjian;

        System.out.print("Masukkan Nama Siswa: ");
        nama = input.nextLine();

        System.out.print("Masukkan Nilai Keaktifan: ");
        nilaiKeaktifan = input.nextInt();

        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = input.nextInt();

        System.out.print("Masukkan Nilai Ujian: ");
        nilaiUjian = input.nextInt();

        int nilaiMurniKeaktifan = nilaiKeaktifan * 20/100;
        int nilaiMurniTugas = nilaiTugas * 30/100;
        int nilaiMurniUjian = nilaiUjian * 50/100;
        int nilaiAkhir = nilaiMurniKeaktifan + nilaiMurniTugas + nilaiMurniUjian;
        

        if(nilaiAkhir >= 80) {
            System.out.println(nama + " Mendapatkan Grade A");
        } else if (nilaiAkhir >= 70) {
            System.out.println(nama + " Mendapatkan Grade B");
        } else if (nilaiAkhir >= 60) {
            System.out.println(nama + " Mendapatkan Grade C");
        } else if (nilaiAkhir >= 50) {
            System.out.println(nama + " Mendapatkan Grade D");
        } else {
            System.out.println(nama + " Mendapatkan Grade E");
        }

        System.out.println("Siswa bernama " + nama + " dengan nilai yang di Hasilkan " );
        System.out.println("Nilai Keaktifan * 20%: " + nilaiMurniKeaktifan);
        System.out.println("Nilai Tugas * 30%: " + nilaiMurniTugas);
        System.out.println("Nilai Ujian * 50%: " + nilaiMurniUjian);

        System.out.println("jadi siswa yang bernama " + nama + " memperoleh nilai akhir Sebesar " + nilaiAkhir + "Grade Nilai Yang di dapat adalah " + nilaiAkhir);

    }
}
