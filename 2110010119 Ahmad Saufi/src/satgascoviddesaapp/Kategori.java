/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satgascoviddesaapp;

/**
 *
 * @author pc
 */
public class Kategori {
    public Integer id_kategori;
    public String kategori;
    
    
    public Integer Getid_kategori(){
        return this.id_kategori;
    }
    public void SetId_user(Integer nomorkategori){
        id_kategori=nomorkategori;
    }
    
    
    public String Getkategori(){
        return this.kategori;
    }
    public void Setkategori(String Kategori){
        kategori=Kategori;
    }
}
