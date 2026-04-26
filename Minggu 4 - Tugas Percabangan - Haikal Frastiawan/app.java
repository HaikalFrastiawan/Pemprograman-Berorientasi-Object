import java.util.Scanner;

public class app {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int bilangan;
        System.out.print("Masukan Sebuah Bilangan: ");
        bilangan = in.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " Adalah Bilangan Genap");
        } else {
            System.out.println(bilangan + " Adalah Bilangan Ganjil");
        }
    }
}
