/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lat_konversi1.Lat_Konversi1.Main_Class;

import java.text.NumberFormat;
import java.util.Locale;

import lat_konversi1.Lat_Konversi1.Menu_Class.Sub.Makanan.Makan_Class;
import lat_konversi1.Lat_Konversi1.Menu_Class.Sub.Minuman.Minuman_Class;

/**
 *
 * @author mariq
 */
public class main_class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Curency Formatter
        Locale Indonesia = new Locale("in", "ID");
        NumberFormat formater = NumberFormat.getCurrencyInstance(Indonesia);
        /*
         * Food List
         */
        Makan_Class nasiGoreng = new Makan_Class("Nasi Goreng", 10000, 10);
        Makan_Class capcay = new Makan_Class("Capcay", 12000, 10);
        Makan_Class indomie = new Makan_Class("Indomie", 5000, 20);

        /*
         * Drink List
         */
        Minuman_Class jusJeruk = new Minuman_Class("Jus Jeruk", 4000, 1000);
        Minuman_Class cocaCola = new Minuman_Class("Coca Cola", 3500, 1000);
        Minuman_Class capucino = new Minuman_Class("Capucino", 3000, 500);

        /*
         * Prints list items
         */

        int jumlahPesan = 15; // Ubah jumlah pesanan sesuai kebutuhan
        System.out.println("Harga Nasi Goreng untuk " + jumlahPesan + " porsi: "
                + formater.format(nasiGoreng.hitungHarga(jumlahPesan)));
        System.out.println("Harga Jus Jeruk untuk " + jumlahPesan + " gelas: "
                + formater.format(jusJeruk.hitungHarga(jumlahPesan)));
    }

}
