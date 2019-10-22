/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118905.latihan50.energikinetik;

/**
 *
 * @author Fitri
 * Nama     : Anindira Dina Fitriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Program Menghitung Energi Kinetik
 */
public class BaseBall {
    private double massa; 
    private double kecepatan;
    private double kecepatanAwal;
	
    public double getMassa() {
        return massa;
    }
	
    public void setMassa(double massa) {
        this.massa = massa;
    }
	
    public double getKecepatan() {
        return kecepatan;
    }
	
    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
	
    public double getKecepatanAwal() {
        return kecepatanAwal;
    }
	
    public void setKecepatanAwal(double kecepatanAwal) {
        this.kecepatanAwal = kecepatanAwal;
    }
	   
    public double hitungEnergiKinetik(double m,double k) {
        return 0.5 * m * (k * k);
    }
    
    public double hitungUsaha(double m,double k1,double k2) {
        double v2 = k2 * k2;
        double v1 = k1*k1;
        return 0.5 * m * (v2-v1);
    }
}
