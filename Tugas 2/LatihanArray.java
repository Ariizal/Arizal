public class LatihanArray {
    public static void main(String[] args) {

        // deklrasi dan inisialisasi
        int[] number = new int[5];
        
        // inisialisasi
        number[0]=1;
        number[1]=2;
        number[2]=3;
        number[3]=4;
        number[4]=5;

        System.out.println("Soal 1");
        for (int i = 0; i < number.length; i++) {
                System.out.print(number[i]+" ");     
        } System.out.println();


        System.out.println("Soal 2");
        for (int i = 0; i < number.length; i++) {
                System.out.print(number[i]);  
                if (i<4) {
                        System.out.print(",");
            }     
        } System.out.println();

        System.out.println("Soal 3");
        for (int i = 0; i < number.length; i++) {
            if (i%2==0) {
                System.out.print(number[i]);  
                if (i<4) {
                        System.out.print(",");
                    } 
            }     
        } System.out.println();

        System.out.println("Soal 4");
        for (int i = 4; i > -1; i--) {
            if (i%2==0) {
                System.out.print(+number[i]); 
                if (i>1) {
                    System.out.print(",");
              }
           } 
        } System.out.println();

        System.out.println("Soal 5");
        for (int i = 0; i < number.length; i++) {
            if (i%2==1) {
                System.out.print(+number[i]);  
                if (i<2) {
                    System.out.print(",");
                } 
            }     
        } System.out.println(); 

        System.out.println("Soal 6");
        for (int i = 0; i < 5; i++) {
            if (i == 0 || i == 1) {
                System.out.print(number[0] + ","); // Membuat 1 dua kali
            } else if (i == 2) {
                System.out.print(number[2] + ","); // Membuat 3
            } else if (i == 3) {
                System.out.print(number[1] + ","); // Membuat 2
            } else if (i == 4) {
                System.out.print(number[4]); // Membuat 5 tanpa koma
            }
        } System.out.println();

    }
}
