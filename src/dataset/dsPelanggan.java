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
public class dsPelanggan {
    private ArrayList<String> nama;
    private ArrayList<String> alamat;
    private ArrayList<Integer> nomorTelpon;
   
    public dsPelanggan() {
        nama = new ArrayList<String>();
        alamat = new ArrayList<String>();
        nomorTelpon = new ArrayList<Integer>();
    }
    
    public void insertnama(String isi){
        this.nama.add(isi);
    }
    public ArrayList<String> getRecordnama(){
        return this.nama;
    }
    
    public void insertalamat(String isi){
        this.alamat.add(isi);
    }
    public ArrayList<String> getRecordalamat(){
        return this.alamat;
    }
    public void insertnomorTelpon(Integer isi){
        this.nomorTelpon.add(isi);
    }
    public ArrayList<Integer> getRecordnomorTelpon(){
        return this.nomorTelpon;
    }
 
    
    public void insertLaundry(String nama, String alamat, Integer nomorTelpon){
        this.nama.add(nama);
        this.alamat.add(alamat);
        this.nomorTelpon.add(nomorTelpon);
    }
    }
