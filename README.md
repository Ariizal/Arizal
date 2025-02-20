import java.util.Scanner;

public class Porseni2024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] cabor = {"Badminton", "Basket", "Bola Voli"}; // String
        double jumlahatlet = 3;

        System.out.print("Masukkan jumlah Politeknik yang mendaftar: ");
        int jumlahpoltek = sc.nextInt();
        sc.nextLine();
        
        String[] dataAtlet = new String[cabor.length]; // Insialisasi array
        String[] namaPoliteknik = new String[jumlahpoltek];

        for (int i = 0; i < jumlahpoltek; i++) { // Perulangan
            System.out.print("\nMasukkan nama Politeknik ke-" + (i + 1) + " : ");
            namaPoliteknik[i] = sc.nextLine();
            for (int j = 0; j < cabor.length; j++) {
                System.out.println("Masukkan nama atlet untuk cabang " + cabor[j] + " di " + namaPoliteknik[i] + " : ");
                for (int k = 0; k < jumlahatlet; k++) {
                    System.out.print("  Atlet " + (k + 1) + " : ");
                    dataAtlet[k] = sc.nextLine();
                }
            }
        }

        System.out.println("\n===== Daftar Atlet Porseni 2024 =====");
        for (int i = 0; i < jumlahpoltek; i++) {
            System.out.println("\nPoliteknik : " + namaPoliteknik[i]);
            for (int j = 0; j < cabor.length; j++) {
                System.out.println("  Cabang " + cabor[j] + " :");
                for (int k = 0; k < jumlahatlet; k++) {
                    System.out.println("    Atlet " + (k + 1) + " : " + dataAtlet[k]);
                }
            }
        }

        sc.close();

    }
}