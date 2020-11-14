/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan46.tandanyakamu;
import java.util.Scanner;

/**
 *
 * @author ENDOG
 * Nama         : Muhamad Ramadan
 * Nim          : 10119004
 * Kelas        : IF1
 * Deskripsi    : Program ini menampilkan tandanya kamu berdasarkan umur
 */
public class IF110119004Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Umur umur = new Umur(2020);
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        umur.setYearBirth(scanner.nextInt());
        
        System.out.println();
        System.out.println();
        System.out.println("======Hasil Perhitungan Umur======");
        int yearBirth = umur.getYearBirth();
        System.out.println("Tahun Lahir Anda : " + yearBirth);
        int yearNow = umur.getYearNow();
        System.out.println("Hari ini Tahun : " + yearNow);
        int usia = umur.hitungUmur();
        System.out.println("Umur kamu sampai hari ini adalah " + usia + " tahun");
        System.out.println("Tandanya Kamu " + umur.tandanyaKamu(usia));
    }
    
}
