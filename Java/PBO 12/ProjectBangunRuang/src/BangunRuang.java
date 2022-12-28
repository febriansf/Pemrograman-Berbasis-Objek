public abstract class BangunRuang {
    public abstract double hitungLuas();
    public abstract double hitungVolume();

    public void tampilHasil(){
        System.out.println("Luas : " + this.hitungLuas());
        System.out.println("Volume : " + this.hitungVolume());
    }
}
