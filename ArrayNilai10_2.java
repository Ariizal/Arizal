import java.util.Scanner;
public class ArrayNilai10_2{
    public static void main(String[] args) {
        Scanner nl = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for(int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke- "+i+ " : ");
            nilaiAkhir[i] = nl.nextInt();
        }
        for (int i =0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke- "+i+ " Lulus! ");
            } else {
                System.out.println("Mahasiswa ke- "+i+ " Titak Lulus!");
            }
        }
    }
}