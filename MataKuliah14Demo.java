import java.util.Scanner;
public class MataKuliah14Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        System.out.print("Masukan Jumlah Mata Kuliah: ");
        n = sc.nextInt();
        sc.nextLine();
        System.out.println("");

        Matakuliah14[] arrayOfMataKuliah = new Matakuliah14[n];
        String kode, nama, dummy;
        int sks, jumlahjam;
        
        for(int i=0; i<arrayOfMataKuliah.length; i++){
            System.out.println("Masukan data Mata Kuliah ke-"+(i+1));
            arrayOfMataKuliah[i] = new Matakuliah14();
            arrayOfMataKuliah[i].tambahData(sc);
            
        }
        for(int i=0; i<arrayOfMataKuliah.length; i++){
            arrayOfMataKuliah[i].cetakInfo(i + 1);
        }
    }
}