/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class dsLaundry {
    private ArrayList<String> namaLaundry;
    private ArrayList<String> daftarPelanggan;
    private ArrayList<String> daftarNota;
   
    public dsLaundry() {
        namaLaundry = new ArrayList<String>();
        daftarPelanggan = new ArrayList<String>();
        daftarNota = new ArrayList<String>();
        
    }
    
    public void insertnamaLaundry(String isi){
        this.namaLaundry.add(isi);
    }
    public ArrayList<String> getRecordnamaLaundry(){
        return this.namaLaundry;
    }
    
    public void insertdaftarPelanggan(String isi){
        this.daftarPelanggan.add(isi);
    }
    public ArrayList<String> getRecorddaftarPelanggan(){
        return this.daftarPelanggan;
    }
    public void insertdaftarNota(String isi){
        this.daftarNota.add(isi);
    }
    public ArrayList<String> getRecorddaftarNota(){
        return this.daftarNota;
    }
 
    
    public void insertLaundry(String namaLaundry, String daftarPelanggan, String daftarNota){
        this.namaLaundry.add(namaLaundry);
        this.daftarPelanggan.add(daftarPelanggan);
        this.daftarNota.add(daftarNota);
    }
    }
