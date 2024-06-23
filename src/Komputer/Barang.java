/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Komputer;

/**
 *
 * @author ilham
 */
public class Barang {
    String namabarang, keteranganbarang;
    int id_barang; 
    int hargabarang;
    
    public Barang(){}
    
    public Barang(String namabarang){
        this.namabarang = namabarang;
    }
    
    public Barang(String namabarang, String keteranganbarang){
        this.namabarang = namabarang;
        this.keteranganbarang = keteranganbarang;
    }
    
    public Barang(String namabarang, String keteranganbarang, int id_barang){
        this.namabarang = namabarang;
        this.keteranganbarang = keteranganbarang;
        this.id_barang = id_barang;
    }
    
    public void inputnamabarang(String namabarang){
        this.namabarang = namabarang;
    }
    
    public String ambilnamabarang(){
        return this.namabarang;
    }
    
    public void inputketeranganbarang(String keteranganbarang){
        this.keteranganbarang = keteranganbarang;
    }
    
    public String ambilketeranganbarang(){
        return this.keteranganbarang;
    }
    
    public void inputid_barang(int id_barang){
        this.id_barang = id_barang;
    }
    
    public int ambilid_barang(){
        return this.id_barang;
    }
    
    public int ambilhargabarang() {
        return this.hargabarang;
    }
    
     public int inputhargabarang() {
        this.hargabarang = 0;
        if (this.namabarang.equals("Lenovo")) {
            this.hargabarang = 150000;
        } else if (this.namabarang.equals("Asus")) {
            this.hargabarang = 250000;
        } else if (this.namabarang.equals("Acer")) {
            this.hargabarang = 750000;
        } else {
            this.hargabarang = 3500000;
        }
        return this.hargabarang;
    }   
}



  
