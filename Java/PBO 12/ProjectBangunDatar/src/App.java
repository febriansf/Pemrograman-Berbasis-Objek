public class App {
    public static void main(String[] args) throws Exception {
        Persegi p = new Persegi();
        p.sisi = 10;
        p.tampilHasil();

        System.out.println("");

        PersegiPanjang pp = new PersegiPanjang();
        pp.p = 10;
        pp.l = 5;
        pp.tampilHasil();

        System.out.println("");

        Lingkaran l = new Lingkaran();
        l.jari = 7;
        l.tampilHasil();
    }
}
