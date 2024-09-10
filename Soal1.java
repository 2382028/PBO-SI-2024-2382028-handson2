import java.util.Scanner;

public class Soal1 {
    /**
     * Buatlah sebuah program yang mengambil 2 input number dari user
     * program tsb akan print out nilai yang paling besar
     **/
    public static void main(String[] args) {
        // Membuat instance Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Menampilkan pesan kepada pengguna untuk memasukkan angka pertama
        System.out.print("Masukkan angka pertama: ");
        // Membaca angka pertama dari pengguna
        int angka1 = scanner.nextInt();

        // Menampilkan pesan kepada pengguna untuk memasukkan angka kedua
        System.out.print("Masukkan angka kedua: ");
        // Membaca angka kedua dari pengguna
        int angka2 = scanner.nextInt();

        // Menentukan angka yang lebih besar dan mencetaknya
        if (angka1 > angka2) {
            System.out.println("Angka yang lebih besar adalah: " + angka1);
        } else if (angka2 > angka1) {
            System.out.println("Angka yang lebih besar adalah: " + angka2);
        } else {
            System.out.println("Kedua angka sama.");
        }
        scanner.close();
    }
}
