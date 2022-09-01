package projectpersegipanjang;
public class ProjectBangunDatar {
    public static void main(String[] args) throws Exception {
        PersegiPanjang A = new PersegiPanjang();

        A.lebar = 10;
        A.panjang = 7;

        A.hitungLuas();
        A.hitungKeliling();

        PersegiPanjang B = new PersegiPanjang();
        
        B.panjang = 14;
        B.lebar = 9;

        B.hitungLuas();
        B.hitungKeliling();

        // Latihan 1
        
        PersegiPanjang C = new PersegiPanjang();
        C.panjang = 17;
        C.lebar = 8;

        C.hitungLuas();
        C.hitungKeliling();

        PersegiPanjang D = new PersegiPanjang();
        D.panjang = 26;
        D.lebar = 14;

        D.hitungLuas();
        D.hitungKeliling();

        // Latihan 3
        Lingkaran L1 = new Lingkaran();
        L1.jejari = 6;
        
        L1.hitungLuas();
        L1.hitungKeliling();

        Lingkaran L2 = new Lingkaran();
        L2.jejari = 12;
        
        L2.hitungLuas();
        L2.hitungKeliling();
        
    }
}
