public class App {

    public static void main(String[] args) throws Exception {

        double luasPersegi, luasTotalBangun1, luasTotalBangun2 , luasTotalLingkaran;

        // Semua satuan dalam cm

        // Project 1
        // =============================================== //
        Persegi persegi1 = new Persegi();
        persegi1.sisi = 42;

        luasPersegi = persegi1.hitungLuas();


        // 1/2 Lingkaran ada 4 
        // dengan ukuran jari yang sama dengan sisi persegi
        Lingkaran lingkaran1 = new Lingkaran();
        lingkaran1.jari = 42 / 2;
        
        luasTotalLingkaran = 4 * (lingkaran1.hitungLuas() / 2);
        luasTotalBangun1 = luasPersegi + luasTotalLingkaran;

        System.out.printf("Luas Total Bangun 1 tersebut adalah " + luasTotalBangun1 + " cm");

        // =============================================== //



        // Project 2
        // =============================================== //
        // Setengah Lingkaran Besar
        Lingkaran setengahlingkaranBesar = new Lingkaran();
        setengahlingkaranBesar.jari = 28 / 2;

        Lingkaran setengahlingkaranKecil = new Lingkaran();
        setengahlingkaranKecil.jari = 14 / 2;

        // 2 Setengah Lingkaran Kecil = 1 Lingkaran
        luasTotalBangun2 = (setengahlingkaranBesar.hitungLuas() / 2) - setengahlingkaranKecil.hitungLuas();

        System.out.printf("\nLuas Total Bangun 2 tersebut adalah " + luasTotalBangun2 + " cm");

        // =============================================== //

    }
}
