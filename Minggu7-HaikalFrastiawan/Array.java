import java.util.Scanner;

public class Array {
    public static void main(String[] args)
    {
        int i;
        int[] nil_akhir;      
        nil_akhir = new int[6];   

        Scanner input = new Scanner(System.in);

        
        for(i=0; i<6; i++)
        {
            System.out.print("Masukkan Array ke " + i + " = ");
            nil_akhir[i] = input.nextInt();
        }

        System.out.println("\n\nData Yang Diinput ke Elemen Array \n");

       
        for(i=0; i<6; i++)
        {
            System.out.print("Nilai Akhir Index " + i );
            System.out.println(" = " + nil_akhir[i]);
        }
    }
}
