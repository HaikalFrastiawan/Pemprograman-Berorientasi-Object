
import java.util.Scanner;

public class Nestedif {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int bilangan;
        System.out.print("Masukan Sebuah Bilangan(1-100): ");
        bilangan = in.nextInt();

        // if (bilangan < 1) {
        //     System.out.println(bilangan + " Adalah Bilangan Kurang dari 1");
        // } else if (bilangan > 100) {7
        //     System.out.println(bilangan + " Adalah Bilangan lebih dari 100");
        // }

        if (bilangan < 1 || bilangan > 100) {
            System.out.println(bilangan + " Adalah Bilangan Kurang dari 1");
            System.out.println(bilangan + " Adalah Bilangan lebih dari 100");
        } else {
            System.out.println(bilangan + " Anda memasukan bilangan yang benar");
            if (bilangan % 2 == 0) {
                System.out.println(bilangan + " Adalah Bilangan Genap");
            } else {
                System.out.println(bilangan + " Adalah Bilangan Ganjil");
            }
        }
    }
}
