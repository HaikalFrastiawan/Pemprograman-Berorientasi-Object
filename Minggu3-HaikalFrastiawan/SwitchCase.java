
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char pilih;
        String prodi;

        System.out.println("Masukan pilihan (A-C): ");
        pilih = in.next().charAt(0);
        switch (pilih) {
            case 'A':
                prodi = "Teknik Informatika";
                System.out.println("Prodi: " + prodi);
                break;
            case 'B':
                prodi = "Sistem Informasi";
                System.out.println("Prodi: " + prodi);
                break;
            case 'C':
                prodi = "Manajemen Informatika";
                System.out.println("Prodi: " + prodi);
                break;
            default:
                System.out.println("Salah Memasukan pilihan");
        }
        System.out.println("Program study yang anda pilih adalah: " + pilih);
        
    }
}