import java.util.Scanner;

class NilaiMurni {
    private double uts;
    private double uas;

    public void setUts(double uts) {
        this.uts = uts;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double getNilaiMurniUTS() {
        return this.uts * 0.40;
    }

    // Mendapatkan nilai murni UAS (60%)
    public double getNilaiMurniUAS() {
        return this.uas * 0.60;
    }
}

class EvaluasiMahasiswa extends NilaiMurni {
    

    public double hitungNilaiAkhir() {
        return getNilaiMurniUTS() + getNilaiMurniUAS();
    }
    public char cariGrade() {
        double nilaiAkhir = hitungNilaiAkhir();
        
        if (nilaiAkhir >= 85) {
            return 'A';
        } else if (nilaiAkhir >= 70) {
            return 'B';
        } else if (nilaiAkhir >= 55) {
            return 'C';
        } else if (nilaiAkhir >= 40) {
            return 'D';
        } else {
            return 'E';
        }
    }
}

public class Lat3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EvaluasiMahasiswa mhs = new EvaluasiMahasiswa();

        System.out.println("=== PROGRAM HITUNG NILAI & GRADE ===");
        System.out.print("Masukkan Nilai UTS: ");
        mhs.setUts(input.nextDouble());

        System.out.print("Masukkan Nilai UAS: ");
        mhs.setUas(input.nextDouble());

        System.out.println("\n--- Hasil Evaluasi ---");
        System.out.println("Nilai Murni UTS (40%) : " + mhs.getNilaiMurniUTS());
        System.out.println("Nilai Murni UAS (60%) : " + mhs.getNilaiMurniUAS());
        System.out.println("Nilai Akhir           : " + mhs.hitungNilaiAkhir());
        System.out.println("Grade                 : " + mhs.cariGrade());

        input.close();
    }
}