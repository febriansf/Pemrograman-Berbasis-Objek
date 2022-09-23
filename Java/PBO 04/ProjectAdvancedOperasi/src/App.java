public class App {
    public static void main(String[] args) throws Exception {
        Operasi Op = new Operasi();

        System.out.println(Op.jumlahkan(3, 4));
        System.out.println(Op.jumlahkan(4, 7, -9));
        System.out.println(Op.jumlahkan(3.4, -0.002, 0.12313));

        System.out.println(Op.kalikan(3, 4));
        System.out.println(Op.kalikan(3, 5.2));
        System.out.println(Op.kalikan(1.3, 2.1));
    }
}
