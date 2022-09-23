public class App {

    static void printHasil(int x){
        System.out.println(x);
    }

    static void printHasil(double x){
        System.out.println(x);
    }

    public static void main(String[] args) throws Exception {
        PersegiPanjang PP = new PersegiPanjang();

        System.out.println("\nPersegi Panjang\n");

        printHasil(PP.hitungLuas(10, 5));
        printHasil(PP.hitungLuas(3.6, 8));
        printHasil(PP.hitungLuas(6, 8.3));
        printHasil(PP.hitungLuas(5.6, 8.8));

        printHasil(PP.hitungKeliling(10, 5));
        printHasil(PP.hitungKeliling(3.6, 8));
        printHasil(PP.hitungKeliling(6, 8.3));
        printHasil(PP.hitungKeliling(5.6, 8.8));

        Persegi P = new Persegi();

        System.out.println("\nPersegi\n");

        printHasil(P.hitungLuas(4.5));
        printHasil(P.hitungLuas(7));
        
        printHasil(P.hitungKeliling(4.5));
        printHasil(P.hitungKeliling(7));

        Lingkaran L = new Lingkaran();

        System.out.println("\nLingkaran\n");

        printHasil(L.hitungLuas(5));
        printHasil(L.hitungLuas(7.4));

        printHasil(L.hitungKeliling(5));
        printHasil(L.hitungKeliling(7.4));

        Segitiga S = new Segitiga();

        System.out.println("\nSegitiga\n");
        printHasil(S.hitungLuas(8, 10));
        printHasil(S.hitungLuas(8, 11.5));
        printHasil(S.hitungLuas(12.2, 9));
        printHasil(S.hitungLuas(13.9, 20.7));
        


    }
}
