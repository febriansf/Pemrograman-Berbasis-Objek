import java.sql.Date;
import java.time.LocalDate;

import java.time.*;

public class Pegawai {
    String id;
    String nama;
    int gol;
    LocalDate tglLahir;

    Pegawai(String idPegawai, String nama, int gol, LocalDate tglLahir){
        this.id = id;
        this.nama = nama;
        this.gol = gol;
        this.tglLahir = tglLahir;
    }

    int hitungUsia() {
        LocalDate today = LocalDate.now();

        Period selisih = Period.between(this.tglLahir, today);
        return selisih.getYears();
    }

    long hitungGapok(){
    
    }

    void printPegawai() {
        
    }
}
