public class PersegiPanjang {
    int p, l;

    PersegiPanjang(int p, int l){
        this.p = p;
        this.l = l;
        System.out.println("Persegi Panjang dengan panjang " + p + " dan lebar " + l + " telah dibuat");
    }

    void hitungLuas(){
        System.out.println("Luas = " + this.p * this.l);
    }

    void hitungKeliling(){
        System.out.println("Keliling = " + 2 * (this.p + this.l));
    }
}
