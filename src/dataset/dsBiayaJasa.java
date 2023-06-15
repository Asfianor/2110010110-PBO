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
public class dsBiayaJasa {
    private ArrayList<String> jenisLayanan;
    private ArrayList<Integer> harga;
   
    public dsBiayaJasa() {
        jenisLayanan = new ArrayList<String>();
        harga = new ArrayList<Integer>();
        
    }
    
    public void insertjenisLayanan(String isi){
        this.jenisLayanan.add(isi);
    }
    public ArrayList<String> getRecordjenisLayanan(){
        return this.jenisLayanan;
    }
    
    public void insertharga(Integer isi){
        this.harga.add(isi);
    }
    public ArrayList<Integer> getRecordharga(){
        return this.harga;
    }
    
 
    
    public void insertBiayaJasa(String jenisLayanan, Integer harga){
        this.jenisLayanan.add(jenisLayanan);
        this.harga.add(harga);
      
    }
}

