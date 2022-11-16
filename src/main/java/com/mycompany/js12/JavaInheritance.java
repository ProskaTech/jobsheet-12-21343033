//Created by 21343033_Nicholas Ryan Jonathan
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js12;

/**
 *
 * @author User
 */
public class JavaInheritance {
    public static void main(String [] args) {
        //membuat objek kendaraan roda dua
        RodaDua sepeda = new RodaDua();
        //Membuat objek kendaraan roda empat
        RodaEmpat mobil = new RodaEmpat();
        
        sepeda.tampilkanHarga();
        sepeda.hargaAkhir();
        
        mobil.tampilkanHarga();
        mobil.hargaAkhir();
    }
}
