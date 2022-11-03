import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inputUser = new Scanner(System.in);

        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga");
        System.out.print("Pilih : ");

        int pilih = inputUser.nextInt();
        switch (pilih){
            case 1:
                PersegiPanjang pp = new PersegiPanjang();

                pp.hitungLuas();
                pp.hitungKeliling();
                break;

            case 2:
                Segitiga s = new Segitiga();
        
                s.hitungLuas();
                break;
        }

        
    }
}