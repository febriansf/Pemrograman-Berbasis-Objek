public class PersegiPanjang extends BangunDatar{
    public double p, l;

    public double hitungLuas(){
        return this.p * this.l;
    }

    public double hitungKeliling(){
        return 2 * (this.p + this.l);
    }
}
