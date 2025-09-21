/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipedata;

/**
 *
 * @author User
 */
public class LuasLingkaran {
    public static void main(String[] args) {
        final double PI = 3.141592;
        double r = 11.78;
        double luasLingkaran = PI * r *r;
        int luasLingkaranBulat = (int)(luasLingkaran);
        double luasLingkaranPembulatan = Math.round (luasLingkaran);
        System.out.println("dalam pecahan : " + luasLingkaran);
        System.out.println("dalam bilangan bulat : " + luasLingkaranBulat);
        System.out.println("dalam pembulatan : " +  luasLingkaranPembulatan);
    }
}
