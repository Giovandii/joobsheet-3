public class DataDosen14 {

    public static void dataSemuaDosen(Dosen14[] Dsn){
        int nomor =1;
        for(Dosen14 d:Dsn ){
            d.tampilInfo(nomor++);
        }
    }
    public static void jumlahDosenPerJenisKelamin(Dosen14[] Dsn) { 
        int pria = 0, wanita = 0; 
        for (Dosen14 d : Dsn) { 
            if (d.jenisKelamin) pria++; 
            else wanita++; } 
            
            System.out.println("Jumlah Dosen Pria : " + pria); 
            System.out.println("Jumlah Dosen Wanita : " + wanita); 
            System.out.println("----------------------------------"); 
        }
        public static void rerataUsiaDosenPerJenisKelamin(Dosen14[] Dsn) { 
            int totalPria = 0, jumPria = 0; 
            int totalWanita = 0, jumWanita = 0; 
            for (Dosen14 d : Dsn) { 
                if (d.jenisKelamin) { 
                    totalPria += d.usia; 
                    jumPria++; 
                } else { 
                    totalWanita += d.usia; 
                    jumWanita++; 
                } 
            }
            double rataPria = (jumPria > 0) ? (double) totalPria / jumPria : 0; 
            double rataWanita = (jumWanita > 0) ? (double) totalWanita / jumWanita : 0; 
            System.out.println("Rata-rata Usia Dosen Pria : " + rataPria); 
            System.out.println("Rata-rata Usia Dosen Wanita : " + rataWanita); 
            System.out.println("----------------------------------");
    }
    public static void infoDosenPalingTua(Dosen14[] Dsn) { 
        Dosen14 tertua = Dsn[0]; 
        for (Dosen14 d : Dsn) { 
            if (d.usia > tertua.usia) { 
                tertua = d; 
            } 
        } 
            System.out.println("=== Dosen Paling Tua ==="); 
            tertua.tampilInfo(0); 
    }
    public static void infoDosenPalingMuda(Dosen14[] Dsn) { 
        Dosen14 termuda = Dsn[0]; 
        for (Dosen14 d : Dsn) { 
            if (d.usia < termuda.usia) { 
                termuda = d; 
            } 
        } 
            System.out.println("=== Dosen Paling Muda ==="); 
            termuda.tampilInfo(0); 
    }
}