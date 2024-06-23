/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Komputer;

/**
 *
 * @author ilham
 */
public class Service extends Barang {
    String namaservice, keteranganservice;
    int id_service, hargaservice;
    
    public Service(){}
    
    public Service(String namaservice){
        this.namaservice = namaservice;
    }
    
    public Service(String namaservice, String keteranganservice){
        this.namaservice = namaservice;
        this.keteranganservice = keteranganservice;
    }
    
    public Service(String namaservice, String keteranganservice, int id_service){
        this.namaservice = namaservice;
        this.keteranganservice = keteranganservice;
        this.id_service = id_service;
    }
    
    public void inputnamaservice(String namaservice){
        this.namaservice = namaservice;
    }
    
    public String ambilnamaservice(){
        return this.namaservice;
    }
    
    public void inputketeranganservice(String keteranganservice){
        this.keteranganservice = keteranganservice;
    }
    
    public String ambilketeranganservice(){
        return this.keteranganservice;
    }
    
    public void inputid_service(int id_service){
        this.id_service = id_service;
    }
    
    public int id_service(){
        return this.id_service;
    }
    
    public int ambilhargaService() {
        this.hargaservice = 0;
        if (this.namaservice.equals("Hardware")) {
            this.hargaservice = 500000;
        } else if (this.namaservice.equals("Software")) {
            this.hargaservice = 750000;
        } else if (this.namaservice.equals("Instal")) {
            this.hargaservice = 1000000;
        } else {
            this.hargaservice = 3500000;
        }
        return this.hargaservice;
    }   
}
