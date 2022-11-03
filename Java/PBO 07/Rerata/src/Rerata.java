import java.util.ArrayList;
import java.util.Scanner;

public class Rerata {
    int n;
    ArrayList<Integer> data = new ArrayList<>();

    void input(){
        System.out.print("Masukkan jumlah : ");
        Scanner input = new Scanner(System.in);
        this.n = input.nextInt();

        for (int i = 0; i < this.n; i++){
            System.out.print("Masukkan data : ");
            this.data.add(input.nextInt());
        }
    }

    void hasil() {

        int sum = 0;
        for (int i : data){
            sum += i;
        }

        double rerata;

        rerata = sum / this.n;

        System.out.println("Rata - ratanya : " + rerata);
    }
}
