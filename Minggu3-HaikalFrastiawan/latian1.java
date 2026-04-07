
import java.util.Scanner;

public class latian1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        int nilaipertandingan1, nilaipertandingan2, nilaipertandingan3;

        System.out.print("Masukan Nama Peserta: ");
        nama = input.nextLine();

    
        System.out.print("Masukan Nilai Pertandingan 1: ");
        nilaipertandingan1 = input.nextInt();
        System.out.print("Masukan Nilai Pertandingan 2: ");
        nilaipertandingan2 = input.nextInt();
        System.out.print("Masukan Nilai Pertandingan 3: "); 
        nilaipertandingan3 = input.nextInt();

        int NilaiRataRata = (nilaipertandingan1 + nilaipertandingan2 + nilaipertandingan3) / 3;
        System.out.println("Nilai Rata-Rata: " + NilaiRataRata);

        if (NilaiRataRata >= 85) {
            System.out.println(nama + " Mendapatkan Hadiah Seperangkat Komputer P4");
        } else if (NilaiRataRata >= 70) {
            System.out.println(nama + " Mendapatkan Hadiah Seperangkat uang sebesar Rp. 500.000");
        } else {
            System.out.println(nama + " Mendapatkan Hadiah Hiburan");
        }
        
        System.out.println("Siswa Bernama " + nama + " dengan nilai rata-rata " + NilaiRataRata);
    }
}
