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
    
    public void tampilkanDataBerita(){
        System.out.println("");
        System.out.println("id berita   :"+ id_berita);
        System.out.println("judul       :"+ judul);
        System.out.println("isi         : "+ isi);
        System.out.println("status      : "+ status);
        System.out.println("photo       : "+ photo);
        System.out.println("id kategori : "+ id_kategori);
        System.out.println("id pengguna : "+ id_user);
        System.out.println("tanggal     : "+ date);
        
    }
    
    
    
    
    
    
    public Integer Getid_berita(){
        return this.id_berita;
    }
    public void Setid_berita(Integer nomorberita) {
        id_berita=nomorberita;
    }
    
    
    public String Getjudul(){
        return this.judul;
    }
    public void Setjudul(String Judul) {
        judul = Judul;
    }
    
    
    public String Getisi(){
        return this.isi;
    }
    public void Setisi(String Isi) {
        isi = Isi;
    }
    
    
    
    
    public String Getstatus(){
        return this.status;
    }
    public void Setstatus(String Status) {
        status = Status;
    }
    
    
    public String Getphoto(){
        return this.photo;
    }
    public void Setphoto(String Photo) {
        photo = Photo;
    }
    
    
    public Integer Getid_kategori(){
        return this.id_kategori;
    }
    public void Setid_kategori(Integer IdKategori) {
        id_kategori = IdKategori;
    }
    
    
    public Integer Getid_user(){
        return this.id_user;
    }
    public void SetId_user(Integer idPengguna){
        id_user=idPengguna;
    }
    
    
    public String date(){
        return this.date;
    }
    public void Setdate(String Date){
        date=Date;
    }
    
}
