import java.util.Scanner;

public class Matakuliah14 {

    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah14(String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama =nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;

    }
    public Matakuliah14(){
        kode = "";
        nama = "";
        sks = 0;
        jumlahJam =0 ;

    }
    public void tambahData(Scanner sc){
        System.out.print("Kode\t: ");
        kode = sc.nextLine();
        System.out.print("Nama\t: ");
        nama = sc.nextLine();
        System.out.print("SKS\t: ");
        sks = sc.nextInt();
        System.out.print("Jumlah Jam\t: ");
        jumlahJam = sc.nextInt();
        sc.nextLine();
        System.out.println("-------------------------------");
    }
    public void cetakInfo(int nomor) { 
        System.out.println("Data Mata Kuliah ke-" + nomor); 
        System.out.println("Kode\t: " + kode); 
        System.out.println("Nama\t: " + nama); 
        System.out.println("Sks\t: " + sks); 
        System.out.println("Jumlah Jam\t: " + jumlahJam); 
        System.out.println("--------------------------------------------"); 
    }
}