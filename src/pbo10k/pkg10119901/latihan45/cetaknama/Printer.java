/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan45.cetaknama;

/**
 *
 * @author User
 */
public class Printer 
{
    private int jmlCetak;
    private String nama;
    
    public int getJmlCetak()
    {
        return jmlCetak;
    }
    
    public void setJmlCetak(int jmlCetak)
    {
        this.jmlCetak = jmlCetak;
    }
    
    public String getNama()
    {
        return nama;
    }
    
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    public void cetak(String nama)
    {
        System.out.println("Nama Anda   : " + nama);
    }
    
    public void cetak(int jmlCetak, String nama)
    {
        int i;
        
        System.out.println("Hasil Cetak : ");
        
        for(i = 1; i <= jmlCetak; i++)
        {
            System.out.println(i + ". " + nama);
        }
    }
}
