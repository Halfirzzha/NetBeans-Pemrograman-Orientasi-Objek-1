/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.halfirzhadev.luascalculator;

/**
 *
 * @author halfirzzha
 */
// Class LuasCalculator untuk menghitung luas berbagai bentuk
public class LuasCalculator {

    // Menghitung luas tabung
    public double luasTabung(double radius, double tinggi) {
        double luas = 2 * Math.PI * radius * (radius + tinggi);
        return luas;
    }

    // Menghitung luas persegi panjang
    public double luasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    // Menghitung luas trapesium
    public double luasTrapesium(double sisiAtas, double sisiBawah, double tinggi) {
        return ((sisiAtas + sisiBawah) * tinggi) / 2;
    }

    public static void main(String[] args) {
        LuasCalculator calculator = new LuasCalculator();

        // Contoh perhitungan
        System.out.println("Luas Tabung: " + calculator.luasTabung(7, 10));
        System.out.println("Luas Persegi Panjang: " + calculator.luasPersegiPanjang(5, 10));
        System.out.println("Luas Trapesium: " + calculator.luasTrapesium(5, 10, 6));
    }
}

