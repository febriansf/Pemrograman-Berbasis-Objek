import java.util.Scanner;

public class Segitiga {
    double a, t;

    Segitiga(){
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan Alas : ");
        this.a = inputUser.nextDouble();

        System.out.print("Masukkan Tinggi : ");
        this.t = inputUser.nextDouble();

        //System.out.println("Segitiga dengan panjang alas " + a + " dan tinggi " + t + " dibuat");
    }

    void hitungLuas(){
        System.out.println("Luas = " + ((this.a * this.t) / 2));
    }
}
