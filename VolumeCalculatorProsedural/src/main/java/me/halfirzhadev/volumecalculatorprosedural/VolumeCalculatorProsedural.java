/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.halfirzhadev.volumecalculatorprosedural;

/**
 *
 * @author halfirzzha
 */
// Program Prosedural untuk menghitung volume tabung
public class VolumeCalculatorProsedural {

    public static double volumeTabung(double radius, double tinggi) {
        return Math.PI * Math.pow(radius, 2) * tinggi;
    }

    public static void main(String[] args) {
        double radius = 7;
        double tinggi = 10;
        System.out.println("Volume Tabung (Prosedural): " + volumeTabung(radius, tinggi));
    }
}

