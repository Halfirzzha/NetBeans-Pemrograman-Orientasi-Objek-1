/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.halfirzhadev.volumecalculatoroop;

/**
 *
 * @author halfirzzha
 */
// Program Berorientasi Objek (OOP) untuk menghitung volume tabung
class Tabung {
    private double radius;
    private double tinggi;

    public Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return Math.PI * Math.pow(radius, 2) * tinggi;
    }
}

public class VolumeCalculatorOOP {

    public static void main(String[] args) {
        Tabung tabung = new Tabung(7, 10);
        System.out.println("Volume Tabung (OOP): " + tabung.hitungVolume());
    }
}

