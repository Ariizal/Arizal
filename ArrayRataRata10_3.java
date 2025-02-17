import java.util.Scanner;
public class ArrayRataRata10_3{
    public static void main(String[] args) {
        Scanner nl = new Scanner(System.in);
        int[] nilaiRata = new int[10];
        int[] diAKKM = new int[10];
        int[] diBKKM = new int[10];
        int totalAKKM = 0;
        int totalBKKM= 0;
        double rata2, rata2L, rata2TL, total = 0, totalNL = 0, totalNTL = 0;

        for(int i = 0; i < nilaiRata.length; i++) {
            System.out.print("Masukkan nilai akhir ke- "+(i+1)+ " : ");
            nilaiRata[i] = nl.nextInt();
        }

        for (int i =0; i < nilaiRata.length; i++) {
            total += nilaiRata[i];
        }
        rata2 = total / nilaiRata.length;
        System.out.println("Rata-Rata nilai = " +rata2);

        for (int i =0; i < nilaiRata.length; i++) {
            if (nilaiRata[i] < 70) {
                diBKKM[totalBKKM++] = nilaiRata[i];
            } else {
                diAKKM[totalAKKM++] = nilaiRata[i];
            }
        }

        if (totalAKKM > 0) {
            for (int i = 0; i < totalAKKM; i++) {
                totalNL += diAKKM[i];
            }
            rata2L = totalNL / totalAKKM;
            System.out.println("Rata-rata nilai Lulus = " +rata2L);
        } 
        
        if (totalBKKM > 0) {
            for (int i = 0; i < totalBKKM; i++) {
                totalNTL += diBKKM[i];
            }
            rata2TL = totalNTL / totalBKKM;
            System.out.println("Rata-rata nilai Tidak Lulus = " +rata2TL);
        }
    }
}