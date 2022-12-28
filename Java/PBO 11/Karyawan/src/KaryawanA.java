
public class KaryawanA {
    int nik;
    String nama;
    protected int masaKerja;
    private int gajiPokok = 3000000;
    int tunjangan;
    private int totalGaji;

    void setMasaKerja(int tahun){
        if (tahun < 0){
            System.out.println("Masa kerja tidak valid");
            System.exit(0);
        }

        this.masaKerja = tahun;
    }

    protected void hitungTunjangan(){
        int masaKerja = this.masaKerja;
        this.tunjangan = (masaKerja < 10) ? 2000000 : 3000000;
    }

    private void hitungTotalGaji(){
        this.totalGaji =  this.gajiPokok + this.tunjangan;
    }

    void printStrukGaji(){
        this.hitungTunjangan();
        this.hitungTotalGaji();
        System.out.println("-----------------------------------");
        System.out.println("NIK             : " + this.nik);
        System.out.println("Nama            : " + this.nama);
        System.out.println("Masa Kerja      : " + this.masaKerja);
        System.out.println("-----------------------------------");
        System.out.println("Gaji Pokok      : " + this.gajiPokok);
        System.out.println("Tunjangan       : " + this.tunjangan);
        System.out.println("-----------------------------------");
        System.out.println("Total Gaji      : " + this.totalGaji);
        System.out.println("-----------------------------------");
    }

}