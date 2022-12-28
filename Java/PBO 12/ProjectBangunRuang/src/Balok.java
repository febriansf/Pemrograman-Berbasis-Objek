public class Balok extends BangunRuang{
    public double p, l, t;

    public double hitungLuas(){
        return 2 * (this.p * this.l + this.p * this.t + this.l * this.t);
    }

    public double hitungVolume(){
        return this.p * this.l * this.t;
    }
}
