public class Lingkaran extends BangunDatar{
    public double jari;
    public double phi = 3.14;

    public double hitungKeliling(){
        return 2 * phi * jari;
    }

    public double hitungLuas(){
        return phi * jari * jari;
    }
}
