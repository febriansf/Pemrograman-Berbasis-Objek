import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> bil = new ArrayList<>();

        System.out.print("Masukan jumlah : ");
        int jumData = input.nextInt();

        for (int i=0; i<jumData; i++){
            System.out.print("Masukkan Data: ");
            bil.add(input.nextInt());

        }

        int total = 0;

        for (int d: bil){
            total += d;
        }

        double rerata = total / jumData;

        System.out.println(bil);
        System.out.println("Rerata : " + rerata);
    }

    
}
