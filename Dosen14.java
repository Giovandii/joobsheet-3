public class Dosen14 {
    public String kode; 
    public String nama; 
    public Boolean jenisKelamin;
    public int usia;

    public Dosen14(String kode, String nama, Boolean jenisKelamin, int usia){
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }
    public void tampilInfo(int nomor){
        System.out.println("Data Dosen ke-" + nomor); 
        System.out.println("Kode\t: " + kode); 
        System.out.println("Nama\t: " + nama); 
        System.out.println("Jenis Kelamin\t: " + (jenisKelamin ? "Pria" : "Wanita")); 
        System.out.println("Usia\t: " + usia); 
        System.out.println("----------------------------------");
    }
}
