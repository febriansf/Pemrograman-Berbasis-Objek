public class KaryawanB extends KaryawanA {

    protected void hitungTunjangan(){
        int masaKerja = this.masaKerja;
        this.tunjangan = (masaKerja < 10) ? 3000000 : 4000000;
    }

}