public class DataDosen14 {
    //Class Untuk menampilkan seluruh data Dosen
    public static void dataSemuaDosen(Dosen14[] Dsn){
        int nomor =1;
        for(Dosen14 d:Dsn ){                //data array dari Dsn dimasukan ke d dan tampilkan
            d.tampilInfo(nomor++);          //data dari d ditampilkan sampai data array Dsn habis
        }
    }
    // Class untuk menampilkan jumlah dosen per jenis kelamin
    public static void jumlahDosenPerJenisKelamin(Dosen14[] Dsn) { 
        int pria = 0, wanita = 0;               //Deklarasi jumlah awal
        for (Dosen14 d : Dsn) {                 //data d mencari data dari array Dsn dan menyimpan nya sementara
            if (d.jenisKelamin) pria++;         //Jika true maka jumlah pria bertambah 1 dikarenakan jenis kelamin bertipe boolean
            else wanita++; }                    //Jika false otomatis jumlah wanita bertambah satu setiap pengecekan data dari d 
            
            System.out.println("Jumlah Dosen Pria : " + pria); 
            System.out.println("Jumlah Dosen Wanita : " + wanita); 
            System.out.println("----------------------------------"); 
        }
        //Menghitung rata rata umur dosen dengan jenis kelamin yang sama
        public static void rerataUsiaDosenPerJenisKelamin(Dosen14[] Dsn) { 
            int totalPria = 0, jumPria = 0;             //totalpria untuk seluruh jumlah uumur pria, jum pria untuk total dosen pria
            int totalWanita = 0, jumWanita = 0;         //Konsep sama  seperti pria tapi ini wanita
            for (Dosen14 d : Dsn) {                     //data d mencari data dari array Dsn dan menyimpan nya sementara
                if (d.jenisKelamin) {                   //Jika true maka jalankan
                    totalPria += d.usia;                //total pria = total pria + umur data yang disimpan oleh d sementara
                    jumPria++;                          //jumlah dosen yang mempunyai jenis kelamin pria
                } else {                                //konsep sama dengan yang pria cuma ini wanita
                    totalWanita += d.usia; 
                    jumWanita++; 
                } 
            }
            double rataPria = (jumPria > 0) ? (double) totalPria / jumPria : 0;             //jika ada dosen pria maka lanjut ke operasi hirung rata rata
            double rataWanita = (jumWanita > 0) ? (double) totalWanita / jumWanita : 0;     //jika tidak ada dosen wanita maka output 0
            System.out.println("Rata-rata Usia Dosen Pria : " + rataPria); 
            System.out.println("Rata-rata Usia Dosen Wanita : " + rataWanita); 
            System.out.println("----------------------------------");
    }
    //Class menampilkan data dosen yang tertua
    public static void infoDosenPalingTua(Dosen14[] Dsn) { 
        Dosen14 tertua = Dsn[0]; 
        for (Dosen14 d : Dsn) { 
            if (d.usia > tertua.usia) {     //jika data dari d usia > dari data tertua seblumnya maka akan di update
                tertua = d; 
            } 
        } 
            System.out.println("=== Dosen Paling Tua ==="); 
            tertua.tampilInfo(1); 
    }
    //Class menampilkan data dosen yang termuda
    public static void infoDosenPalingMuda(Dosen14[] Dsn) { 
        Dosen14 termuda = Dsn[0]; 
        for (Dosen14 d : Dsn) { 
            if (d.usia < termuda.usia) {    //sama dengan yang tertua tapi ini termuda memaka <
                termuda = d; 
            } 
        } 
            System.out.println("=== Dosen Paling Muda ==="); 
            termuda.tampilInfo(1); 
    }
}