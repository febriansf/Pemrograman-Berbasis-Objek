package projectpersegipanjang;

public class PersegiPanjang {
    int lebar;
    int panjang;

    void hitungLuas() {
        int luas = this.panjang * this.lebar;
        System.out.println("Luas: " + luas + " satuan luas");
    }

    void hitungKeliling() {
        int keliling = 2 * (this.lebar + this.panjang);
        System.out.println("Keliling: " + keliling + " satuan");
    }
}
