public class PersegiPanjang {
    double p, l;

    PersegiPanjang(double p, double l){
        this.p = p;
        this.l = l;
        System.out.println("Persegi dengan persegi panjang sisi " + p + " dan " + l + " dibuat");
    }

    void hitungLuas(){
        System.out.println("Luas = " + (this.p * this.l));
    }

    void hitungKeliling(){
        System.out.println("Keliling = " + (2 * (this.p + this.l)));
    }
}
