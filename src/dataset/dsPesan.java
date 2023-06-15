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
public class dsPesan {
    private ArrayList<String> pesan;
    
    public dsPesan() {
        pesan = new ArrayList<String>();
          
    }
    
    public void insertpesan(String isi){
        this.pesan.add(isi);
    }
    public ArrayList<String> getRecordpesan(){
        return this.pesan;
    }
   
    
    public void insertLaundry(String pesan){
        this.pesan.add(pesan);
 
    }
    }
