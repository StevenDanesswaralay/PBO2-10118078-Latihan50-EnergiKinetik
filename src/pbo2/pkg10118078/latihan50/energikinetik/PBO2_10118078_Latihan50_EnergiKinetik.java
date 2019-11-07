/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118078.latihan50.energikinetik;

/**
 *
 * @author 
 * Nama     : Steven Danesswaralay
 * Kelas    : IF-2
 * Nim      : 10118078
 * Deskripsi Tugas: Energi Kninetik
 */
public class PBO2_10118078_Latihan50_EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EnergiKinetik ek = new EnergiKinetik();
        ek.setMassa(145);
        ek.setKecepatan(25);
        
        System.out.println("Massa = " + ek.getMassa() + "g");
        System.out.println("Kecepatan = " + ek.getKecepatan() + "m/s");
        System.out.println("Berapakah Energi Kinetiknya? = " + ek.hitungEK() + "Joule");
        System.out.println("Berapakah usaha yang dilakukan pada bola untuk menacapai"
                + "kecepatan ini, jika dimulai dari keadaan diam? = " + ek.hitungUsaha() + "Joule");
    }
    
}
