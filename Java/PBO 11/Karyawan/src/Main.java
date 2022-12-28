
public class Main {
    public static void main(String[] args) {

        KaryawanA karA = new KaryawanA();
        karA.nik = 123;
        karA.nama = "Abdul";
        karA.setMasaKerja(4);
        karA.printStrukGaji();

        System.out.println("");

        KaryawanB karB = new KaryawanB();
        karB.nik = 456;
        karB.nama = "Budi";
        karB.setMasaKerja(12);
        karB.printStrukGaji();

    }
}
