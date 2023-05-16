/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satgascoviddesaapp;

/**
 *
 * @author pc
 */
public class Berita {
    public Integer id_berita;
    public String judul;
    public String isi;
    public String status;
    public String photo;
    public Integer id_kategori;
    public Integer id_user;
    public String date;
    
    public Integer Getid_berita(){
        return this.id_berita;
    }
    public String Getjudul(){
        return this.judul;
    }
    public String Getisi(){
        return this.isi;
    }
    public String Getstatus(){
        return this.status;
    }
    public String Getphoto(){
        return this.photo;
    }    
    public Integer Getid_kategori(){
        return this.id_kategori;
    }
    public Integer Getid_user(){
        return this.id_user;
    }
    public String date(){
        return this.date;
    }
}
