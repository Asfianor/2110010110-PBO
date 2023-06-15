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
public class dsPesanan {
    private ArrayList<String> jenisLayanan;
    private ArrayList<Integer> berat;
    private ArrayList<Integer> harga;
   
    public dsPesanan() {
        jenisLayanan = new ArrayList<String>();
        berat = new ArrayList<Integer>();
        harga = new ArrayList<Integer>();
    }
    
    public void insertjenisLayanan(String isi){
        this.jenisLayanan.add(isi);
    }
    public ArrayList<String> getRecordjenisLayanan(){
        return this.jenisLayanan;
    }
    
    public void insertberat(Integer isi){
        this.berat.add(isi);
    }
    public ArrayList<Integer> getRecordberat(){
        return this.berat;
    }
    public void insertharga(Integer isi){
        this.harga.add(isi);
    }
    public ArrayList<Integer> getRecordharga(){
        return this.harga;
    }
 
    
    public void insertPesanan(String jenisLayanan, Integer berat, Integer harga){
        this.jenisLayanan.add(jenisLayanan);
        this.berat.add(berat);
        this.harga.add(harga);
    }
    }


