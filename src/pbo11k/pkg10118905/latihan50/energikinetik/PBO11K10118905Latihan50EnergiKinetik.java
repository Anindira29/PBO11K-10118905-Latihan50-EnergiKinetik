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
public class PBO11K10118905Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BaseBall b = new BaseBall();
	b.setMassa(0.145);
	b.setKecepatan(25);
	b.setKecepatanAwal(0);
	System.out.println("==========Menghitung Energi Kinetik==========");
	System.out.println("Massa bola baseball\t : " + b.getMassa()+" kg ("+b.getMassa()*1000+" gram)");
	System.out.println("Kecepatan bola baseball\t : " +b.getKecepatan()+" m/s");
	System.out.println("Energi kinetik\t\t : "+b.hitungEnergiKinetik(b.getMassa(), b.getKecepatan())+" joule");
	System.out.println("Usaha pada enegi kinetik : "+ b.hitungUsaha(b.getMassa(), b.getKecepatanAwal(), b.getKecepatan())+" joule");
    }
}
