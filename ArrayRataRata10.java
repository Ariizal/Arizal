import java.util.Scanner;
public class ArrayRataRata10{
    public static void main(String[] args) {
        Scanner nl = new Scanner(System.in);
        int[] nilaiRata = new int[10];
        double total =0;
        double rata2;

        for(int i = 0; i < nilaiRata.length; i++) {
            System.out.print("Masukkan nilai akhir ke- "+(i+1)+ " : ");
            nilaiRata[i] = nl.nextInt();
        }
        for (int i =0; i < nilaiRata.length; i++) {
            total += nilaiRata[i];
        }
        rata2 = total / nilaiRata.length;
        System.out.println("Rata-Rata nilai = " +rata2);
    }
}