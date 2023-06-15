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
public class dsNotaPelanggan {
    private ArrayList<Integer> nomorNota;
    private ArrayList<String> pelanggan;
    private ArrayList<String> daftarPesanan;
   
    public dsNotaPelanggan() {
        nomorNota = new ArrayList<Integer>();
        pelanggan = new ArrayList<String>();
        daftarPesanan = new ArrayList<String>();
        
    }
    
    public void insertnomorNota(Integer isi){
        this.nomorNota.add(isi);
    }
    public ArrayList<Integer> getRecordnomorNota(){
        return this.nomorNota;
    }
    
    public void insertpelanggan(String isi){
        this.pelanggan.add(isi);
    }
    public ArrayList<String> getRecordpelanggan(){
        return this.pelanggan;
    }
    public void insertdaftarPesanan(String isi){
        this.daftarPesanan.add(isi);
    }
    public ArrayList<String> getRecorddaftarPesanan(){
        return this.daftarPesanan;
    }
 
    
    public void insertLaundry(Integer nomorNota, String pelanggan, String daftarPesanan){
        this.nomorNota.add(nomorNota);
        this.pelanggan.add(pelanggan);
        this.daftarPesanan.add(daftarPesanan);
    }
    }

