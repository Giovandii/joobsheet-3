import java.util.Scanner;

public class Dosen14Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Jumlah Dosen: ");
        int n = sc.nextInt();
        sc.nextLine(); // buang newline setelah nextInt
        System.out.println("-----------------------------------------");

        Dosen14[] Dsn = new Dosen14[n];
        
        for (int i = 0; i < Dsn.length; i++) { 
            System.out.println("Masukkan Data Dosen ke-" + (i + 1)); 
            System.out.print("Kode\t: "); 
            String kode = sc.nextLine(); 
            System.out.print("Nama\t: "); 
            String nama = sc.nextLine(); 
            System.out.print("Jenis Kelamin (L/P)\t: "); 
            String jkInput = sc.nextLine(); 

            Boolean jenisKelamin = jkInput.equalsIgnoreCase("L"); // true = Laki-laki, false = Perempuan

            System.out.print("Usia\t: "); 
            int usia = Integer.parseInt(sc.nextLine()); 
            System.out.println("----------------------------------");

            Dsn[i] = new Dosen14(kode, nama, jenisKelamin, usia); 
        }

        int nomor = 1; 
        for (Dosen14 d : Dsn) { 
            d.tampilInfo(nomor++);
        }
        DataDosen14.dataSemuaDosen(Dsn);
        DataDosen14.jumlahDosenPerJenisKelamin(Dsn);
        DataDosen14.rerataUsiaDosenPerJenisKelamin(Dsn);
        DataDosen14.infoDosenPalingTua(Dsn);
        DataDosen14.infoDosenPalingMuda(Dsn);
    }
}
