public class Bola extends BangunRuang {
    public double r, phi = 3.14;

    public double hitungLuas(){
        return 4 * phi * r * r;
    }

    public double hitungVolume(){
        return 4/3 * phi * r * r * r;
    }
}
