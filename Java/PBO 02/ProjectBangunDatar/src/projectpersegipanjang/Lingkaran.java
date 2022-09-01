package projectpersegipanjang;

// Latihan 2
public class Lingkaran {
    int jejari;
    double phi = 3.14;

    void hitungLuas() {
        double luas = this.phi * this.jejari * this.jejari;
        System.out.println("Luas: " + luas + " satuan luas");
    }

    void hitungKeliling() {
        double keliling = 2 * this.phi * this.jejari;
        System.out.println("Keliling: " + keliling + " satuan keliling");
    }

}
