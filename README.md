import java.util.Scanner; //Mengimpor kelas Scanner

public class Porseni2024 {
    public static void main(String[] args) { // main method untuk mendefinisikan kelas
        Scanner sc = new Scanner(System.in);

        String[] cabor = {"Badminton", "Basket", "Bola Voli"}; // Menyimpan data cabor
        double jumlahatlet = 3; // Jumlah atlet setiap cabor

        System.out.print("Masukkan jumlah Politeknik yang mendaftar: "); // Untuk membaca jumlah politeknik yang mendaftar yang di inputkan oleh user
        int jumlahpoltek = sc.nextInt();
        sc.nextLine();
        
        String[] dataAtlet = new String[cabor.length]; // Insialisasi array (Untuk menyimpan nama atlet)
        String[] namaPoliteknik = new String[jumlahpoltek]; // Untuk menyimpan nama politeknik yang mendaftar

        for (int i = 0; i < jumlahpoltek; i++) { // Perulangan
            System.out.print("\nMasukkan nama Politeknik ke-" + (i + 1) + " : "); // Untuk membaca nama politeknik yang di inputkan oleh user
            namaPoliteknik[i] = sc.nextLine();
            for (int j = 0; j < cabor.length; j++) {
                System.out.println("Masukkan nama atlet untuk cabang " + cabor[j] + " di " + namaPoliteknik[i] + " : "); // Untuk membaca nama politeknik yang di inputkan oleh user
                for (int k = 0; k < jumlahatlet; k++) {
                    System.out.print("  Atlet " + (k + 1) + " : ");
                    dataAtlet[k] = sc.nextLine();
                }
            }
        }

        System.out.println("\n===== Daftar Atlet Porseni 2024 ====="); // Menampilkan nama politeknik, jumlah cabor dan nama atlet
        for (int i = 0; i < jumlahpoltek; i++) {
            System.out.println("\nPoliteknik : " + namaPoliteknik[i]);
            for (int j = 0; j < cabor.length; j++) {
                System.out.println("  Cabang " + cabor[j] + " :");
                for (int k = 0; k < jumlahatlet; k++) {
                    System.out.println("    Atlet " + (k + 1) + " : " + dataAtlet[k]);
                }
            }
        }

        sc.close(); // Penutup

    }
}