public class Mahasiswa14 {

    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

    public void cetakInfo(int nomor){
        System.out.println("Data Mahasiswa ke-" + nomor);
            System.out.println("NIM\t: " + nim);
            System.out.println("Nama\t: " + nama);
            System.out.println("Kelas\t: " + kelas);
            System.out.println("Ipk\t: " + ipk);
            System.out.println("-------------------------------------");
    }
}