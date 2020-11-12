/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan45.cetaknama;

import java.util.Scanner;
/**
 *
 * @author
 * NAMA                 : Fauzan Muhammad Abdussalam
 * KELAS                : IF-10K
 * NIM                  : 10119901
 * Deskripsi Program    : Mencetak Nama
 *
 */
public class PBO10K10119901Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Printer p       = new Printer();
        Scanner scanner = new Scanner(System.in);
        
        int jmlCetak;
        String nama;
        
        System.out.println("=====Aplikasi Pencetak Nama=====");
        
        System.out.print("Masukkan Nama Anda \t\t : ");
        nama = scanner.next();
        p.setNama(nama);
        
        System.out.print("Mau cetak nama berapa kali? \t : ");
        jmlCetak = scanner.nextInt();
        p.setJmlCetak(jmlCetak);
        
        System.out.println();
        
        p.cetak(p.getNama());
        p.cetak(p.getJmlCetak(), p.getNama());
        
    }
    
}
