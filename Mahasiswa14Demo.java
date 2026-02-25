import java.util.Scanner;

public class Mahasiswa14Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa14[] arrayOfMahasiswa14 = new Mahasiswa14[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa14[i] = new Mahasiswa14(); // inisialisasi objek

            System.out.println("Masukan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM\t: ");
            arrayOfMahasiswa14[i].nim = sc.nextLine();
            System.out.print("Nama\t: ");
            arrayOfMahasiswa14[i].nama = sc.nextLine();
            System.out.print("Kelas\t: ");
            arrayOfMahasiswa14[i].kelas = sc.nextLine();
            System.out.print("IPK\t: ");
            dummy = sc.nextLine();
            arrayOfMahasiswa14[i].ipk = Float.parseFloat(dummy);
            System.out.println("--------------------------------------");
        }

        for (int i = 0; i < 3; i++) { 
            arrayOfMahasiswa14[i].cetakInfo(i + 1); }
    }
}

