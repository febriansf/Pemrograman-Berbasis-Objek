public class Persegi {
    double s;

    Persegi(double s){
        this.s = s;
        System.out.println("Persegi dengan panjang sisi " + s + " dibuat");
    }

    void hitungKeliling(){
        System.out.println("Keliling = " + 4 * this.s);
    }

    void hitungLuas(){
        System.out.println("Luas = " + this.s * this.s);
    }
}

