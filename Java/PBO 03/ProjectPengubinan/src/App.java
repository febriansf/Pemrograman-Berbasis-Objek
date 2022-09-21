public class App {

    static int mtocm(int num){
        return num * 100;
    }

    static double hitungUbin(int lRuang, int lUbin){
        return lRuang / lUbin;
    }

    public static void main(String[] args) throws Exception {
        
        Ubin ubinX = new Ubin();
        // Satuan dalam CM
        ubinX.panjang = 60;
        ubinX.lebar = 40;

        Ruang a = new Ruang();
        a.panjang = mtocm(3);
        a.lebar = mtocm(3);

        Ruang b = new Ruang();
        b.panjang = mtocm(5);
        b.lebar = mtocm(2);

        Ruang c = new Ruang();
        c.panjang = mtocm(4);
        c.lebar = mtocm(3);
        
        double jumA = hitungUbin(a.hitungLuas(), ubinX.hitungLuas());
        double jumB = hitungUbin(b.hitungLuas(), ubinX.hitungLuas());
        double jumC = hitungUbin(c.hitungLuas(), ubinX.hitungLuas());

        double total = jumA + jumB + jumC;

        System.out.println(jumA);
        System.out.println(jumB);
        System.out.println(jumC);
        System.out.println(total);




    }
}
