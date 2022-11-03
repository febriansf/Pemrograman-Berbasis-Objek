public class Lingkaran {
    double phi = 3.14;
    double r;

    Lingkaran(double jejari){
        this.r = jejari;
        System.out.println("Lingkaran dengan panjang jari " + r + " dibuat");
    }

    void hitungLuas(){
        System.out.println("Luas = " + ((phi * r * r)));
    }

    void hitungKeliling(){
        System.out.println("Keliling = " + (2 * (phi * r)));
    }
}
