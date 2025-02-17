import java.util.Scanner;
public class ArraySearching10_2{
    public static void main(String[] args) {
        Scanner nla = new Scanner(System.in);
        System.out.print("Masukkan banyak nilai yang akan di input: ");
        int jml = nla.nextInt();
        int[] arrNilai = new int[jml];
        int key;
        int hasil;
        boolean found = false;

        for(int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " +(i+1)+ " = ");
            arrNilai[i] = nla.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        key = nla.nextInt();

        for(int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                found = true;
                System.out.println();
                System.out.println("Nilai " +key+ " ketemu di indeks ke- " +hasil);
                System.out.println();

                break;
            }
        }

        if (!found) {
            System.out.println();
            System.out.println("Nilai yang dicari tidak ditemukan");
            System.out.println();
        }
        
    }
}