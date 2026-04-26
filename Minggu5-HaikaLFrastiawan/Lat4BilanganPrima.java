public class Lat4BilanganPrima{
    public static void main(String[] args) {
        int batas = 20; // Batas angka yang akan diperiksa

        System.out.print("Bilangan Prima: ");

        for (int i = 2; i <= batas; i++) {
            int counter = 0;

            // Cek apakah angka 'i' punya pembagi selain 1 dan dirinya sendiri
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }

            // Bilangan prima hanya memiliki 2 faktor (1 dan angka itu sendiri)
            if (counter == 2) {
                System.out.print(i);
                
                // Tambahkan koma kecuali untuk angka terakhir (19)
                if (i < 19) {
                    System.out.print(", ");
                }
            }
        }
    }
}

