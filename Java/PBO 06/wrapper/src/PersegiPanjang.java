import java.util.Scanner;

public class PersegiPanjang {
    int p, l;

    PersegiPanjang(){
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan Panjang : ");
        this.p = inputUser.nextInt();

        System.out.print("Masukkan Lebar : ");
        this.l = inputUser.nextInt();

        //System.out.println("Persegi Panjang dengan panjang " + p + " dan lebar " + l + " telah dibuat");
    }

    void hitungLuas(){
        System.out.println("Luas = " + this.p * this.l);
    }

    void hitungKeliling(){
        System.out.println("Keliling = " + 2 * (this.p + this.l));
    }
}
