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
public class dsNota {
    private ArrayList<String> notaPelanggan;
    private ArrayList<String> daftarPesan;
 
   
    public dsNota() {
        notaPelanggan = new ArrayList<String>();
        daftarPesan = new ArrayList<String>();
        
        
    }
    
    public void insertnotaPelanggan(String isi){
        this.notaPelanggan.add(isi);
    }
    public ArrayList<String> getRecordnotaPelanggan(){
        return this.notaPelanggan;
    }
    
    public void insertdaftarPesan(String isi){
        this.daftarPesan.add(isi);
    }
    public ArrayList<String> getRecorddaftarpesan(){
        return this.daftarPesan;
    }

    
    public void insertLaundry(String notaPelanggan, String daftarPesan){
        this.notaPelanggan.add(notaPelanggan);
        this.daftarPesan.add(daftarPesan);
    }
    }

