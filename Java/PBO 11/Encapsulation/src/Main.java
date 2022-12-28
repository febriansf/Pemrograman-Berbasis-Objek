public class Main {
    public static void main(String[] args) {
        PersegiPanjang pp1 = new PersegiPanjang();

        pp1.setLebar(20);
        pp1.setPanjang(50);

        System.out.println("Keliling persegi dengan panjang " + pp1.getPanjang() + " dan " + pp1.getLebar() + " adalah " + pp1.hitungKeliling());
        System.out.println("Luas persegi dengan panjang " + pp1.getPanjang() + " dan " + pp1.getLebar() + " adalah " + pp1.hitungLuas());
    }
}
