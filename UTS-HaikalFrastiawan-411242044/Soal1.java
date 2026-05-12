
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulang = "";

        do {
            System.out.print("Pilih jenis kelamin (L/P) : ");
            char kelamin = input.next().toUpperCase().charAt(0);
            System.out.print("Masukkan tinggi badan Anda (dalam cm) : ");
            int tinggi = input.nextInt();
            int beratIdeal = 0;
            if (kelamin == 'L') {
                beratIdeal = tinggi - 100;
            } else if (kelamin == 'P') {
                beratIdeal = tinggi - 110;
            } else {
                System.out.println("Pilihan jenis kelamin tidak valid.");
                input.nextLine();
                continue;
            }

            System.out.println("Berat badan ideal yang seharusnya : " + beratIdeal + " Kg");
            System.out.print("Masukkan berat badan Anda (dalam Kg) : ");
            int beratAsli = input.nextInt();
            input.nextLine(); 
            int selisih = beratAsli - beratIdeal;

            if (beratAsli <= beratIdeal) {
                System.out.println("Anda termasuk kedalam kategori Kurus.");
            } else {
                System.out.print("Anda termasuk kedalam kategori Gemuk ");
                System.out.println(" dan harus mengurangi berat badan sebanyak " + selisih + " Kg (" + beratAsli + " Kg - " + beratIdeal + " Kg)");
            }
          
            System.out.print("\nIngin menghitung lagi? (y/n): ");
            ulang = input.nextLine();
            System.out.println("-------------------------------------------");
        } while (ulang.equalsIgnoreCase("y"));
        System.out.println("Program selesai.");
        input.close();
    }
}
