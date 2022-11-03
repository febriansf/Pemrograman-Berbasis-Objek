public class Segitiga {
    double a, t;

    Segitiga(double alas, double tinggi){
        this.a = alas;
        this.t = tinggi;
        System.out.println("Segitiga dengan panjang alas " + a + " dan tinggi " + t + " dibuat");
    }

    void hitungLuas(){
        System.out.println("Luas = " + ((this.a * this.t) / 2));
    }
}
