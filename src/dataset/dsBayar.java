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
public class dsBayar {
    private ArrayList<Integer> nota;
    private ArrayList<Integer> jumlahBayar;
   
    public dsBayar() {
        nota = new ArrayList<Integer>();
        jumlahBayar = new ArrayList<Integer>();
        
    }
    
    public void insertnota(Integer isi){
        this.nota.add(isi);
    }
    public ArrayList<Integer> getRecordnota(){
        return this.nota;
    }
    
    public void insertjumlahBayar(Integer isi){
        this.jumlahBayar.add(isi);
    }
    public ArrayList<Integer> getRecordjumlahBayar(){
        return this.jumlahBayar;
    }
    
 
    
    public void insertBayar(Integer nota, Integer jumlahBayar){
        this.nota.add(nota);
        this.jumlahBayar.add(jumlahBayar);
      
    }
}
