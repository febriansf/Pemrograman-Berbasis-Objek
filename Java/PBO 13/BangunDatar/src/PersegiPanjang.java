public class PersegiPanjang extends BangunDatar implements Keliling, Simteri {

    public int panjang, lebar;

    public double hitungLuas(){
        return this.panjang * this.lebar;
    }

    public double hitungKeliling(){
        return 2 * (this.panjang + this.lebar);
    }

    public double hitungSimPutar(){
        return 2.0;
    }

    public double hitungSimLipat(){
        return 2.0;
    }

    public void tampilHasil(){
        System.out.println("Persegi Panjang");
        System.out.println("---------------");
        System.out.println("Luasnya: " + this.hitungLuas());
        System.out.println("Keliling: "+ this.hitungKeliling());
        System.out.println("Simetri Putar: " + this.hitungSimPutar());
        System.out.println("Simetri Lipat: " + this.hitungSimLipat());
    }
    
}
