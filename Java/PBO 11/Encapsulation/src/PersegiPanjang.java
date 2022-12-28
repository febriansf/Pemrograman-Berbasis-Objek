public class PersegiPanjang {
    private int panjang, lebar;
    
    private int luas, kelilng;


    void setPanjang(int p){
        if (p > 0){
            this.panjang = p;
        } else {
            System.exit(0);
        }
    }

    void setLebar(int l){
        if (l > 0){
            this.lebar = l;
        } else {
            System.exit(0);
        }
    }

    int getLebar(){
        return this.lebar;
    }

    int getPanjang(){
        return this.panjang;
    }

    int hitungLuas(){
        this.luas = this.panjang * this.lebar;
        return this.luas;
    }

    int hitungKeliling(){
        this.kelilng = 2 * (this.panjang + this.lebar);
        return this.kelilng;
    }
}
