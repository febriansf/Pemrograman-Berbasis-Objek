public class Ruang {
    int panjang, lebar;

    int hitungLuas() {
        PersegiPanjang p = new PersegiPanjang();
        return p.hitungLuas(this.panjang, this.lebar);
    }
}
