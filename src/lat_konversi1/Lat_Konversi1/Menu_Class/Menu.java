/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lat_konversi1.Lat_Konversi1.Menu_Class;

/**
 *
 * @author mariq
 */
public class Menu {
    private String nama;
    private String jenis;
    private double harga;
    private int batas;
    private int es;

    public Menu(String nama, String jenis, int harga, int batas, int es) {
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
        this.batas = batas;
        this.es = es;
    }

    public double hitungHarga(int jumlahPesan) {
        if (jenis.equals("Minuman") && jumlahPesan >= es) {
            return harga - 1000;
        } else {
            if (jumlahPesan > batas) {
                return harga + (jumlahPesan - batas) * harga;
            } else {
                return harga;
            }
        }
    }
}
