/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

/**
 *
 * @author BrxxN
 */
public class PersegiPanjang {
    int lebar;
    int panjang;

    void hitungLuas() {
        int luas = this.panjang * this.lebar;
        System.out.print("Luas: " + luas + "satuan luas");
    }

    void hitungKeliling() {
        int keliling = 2 * (this.lebar + this.panjang);
        System.out.print("Keliling: " + keliling + "satuan");
    }
}
