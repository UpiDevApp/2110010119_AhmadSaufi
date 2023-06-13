/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataSet;

import java.util.ArrayList;
import satgascoviddesaapp.User;
/**
 *
 * @author LENOVO
 */
public class dataSetUser {
    private ArrayList<String> nama;
    private ArrayList<String> jk;
    private ArrayList<String> tempat_lahir;
    private ArrayList<String> tgl_lahir;
    private ArrayList<String> alamat;
    private ArrayList<String> photo;
    
    public dataSetUser(){
        nama= new ArrayList<>();
        jk= new ArrayList<>();
        tempat_lahir= new ArrayList<>();
        tgl_lahir= new ArrayList<>();
        alamat= new ArrayList<>();
        photo= new ArrayList<>();
        
    }
    public void addNama(String value){
        this.nama.add(value);
    }
    
    public ArrayList<String> getDataNama(){
        return this.nama;
    }
    
    public void addjk(String value){
        this.jk.add(value);
    }
    
    public ArrayList<String> getDatajk(){
        return this.jk;
    }
    
    public void addttl(String value){
        this.tempat_lahir.add(value);
    }
    
    public ArrayList<String> getDatatl(){
        return this.tempat_lahir;
    }
    
    public void addtgll(String value){
        this.tgl_lahir.add(value);
    }
    
    public ArrayList<String> getDatatgll(){
        return this.tgl_lahir;
    }
    public void addalamat(String value){
        this.alamat.add(value);
    }
    
    public ArrayList<String> getDataalamat(){
        return this.alamat;
    }
    public void addphoto(String value){
        this.photo.add(value);
    }
    
    public ArrayList<String> getDataphoto(){
        return this.photo;
    }
    
    
    }

