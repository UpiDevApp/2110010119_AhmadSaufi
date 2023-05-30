/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satgascoviddesaapp;

/**
 *
 * @author pc
 */
public class Kegiatan {
   public Integer id_kegiatan;
   public Integer id_user;
   public String nama_kegiatan;
   public String tujuan;
   public String alamat;
   public String nama_penyelenggara;
   public String kontak;
   public String status;
   public String tanggal_mulai;
   public String tanggal_akhir;
   public String create_data;
   public Integer id_admin;
   
   public void tampilkanDataKegiatan(){
        System.out.println("");
        System.out.println("Data Kegiatan Pemeriksaan Covid ");
        System.out.println("id                       : "+ id_user);
        System.out.println("nama kegiatan            : "+ nama_kegiatan);
        System.out.println("tujuan                   : "+ tujuan);
        System.out.println("nama penyelenggara       : "+ nama_penyelenggara);
        System.out.println("kontak                   : "+ kontak);
        System.out.println("status                   : "+ status);
        System.out.println("tanggal memulai kegiatan : "+ tanggal_mulai);
        System.out.println("tanggal akhir kegiatan   : "+ tanggal_akhir);
        System.out.println("create data              : "+ create_data);
        System.out.println("id admin                 : "+ id_admin);
    }
    
    public Integer GetId_kegiatan() {
      return this.id_kegiatan;
    }
    public void SetId_kegiatan(Integer nomorkegiatan){
        id_kegiatan=nomorkegiatan;
    }
    
    public Integer GetId_user(){
        return this.id_user;
    }
    public void SetId_user(Integer idPengguna){
        id_user=idPengguna;
    }

    
    public String Getnama_kegiatan() {
        return this.nama_kegiatan;
    }
    public void Setnama_kegiatan(String namakegiatan){
        nama_kegiatan = namakegiatan;
    }

    
    public String Gettujuan() {
        return this.tujuan;
    }
    public void Settujuan(String Tujuan){
        tujuan=Tujuan;
    }

    
    public String Getalamat() {
      return this.alamat;
    }
    public void Setalamat(String Alamat){
        alamat=Alamat;
    }
    
    
    public String Getnama_penyelenggara() {
      return this.nama_penyelenggara;
    }
    public void Setnama_penyelenggara(String namapenyelenggara){
        nama_penyelenggara = namapenyelenggara;
    }

   
    public String Getkontak() {
      return this.kontak;
    }
    public void Setkontak(String Kontak){
        kontak=Kontak;
    }
    
    
    public String Getstatus() {
      return this.status;
    }
    public void Setstatus(String Statuskegiatan){
        status = Statuskegiatan;
    }

   
    public String Gettanggalmulai() {
      return this.tanggal_mulai;
    }
    public void Settanggalmulai(String Tanggalmulai){
        tanggal_mulai=Tanggalmulai;
    }
    
    
    public String Gettanggalakhir() {
      return this.tanggal_akhir;
    }
    public void Settanggalakhir(String Tanggalakhir){
        tanggal_akhir = Tanggalakhir;
    }
   
    
    public String Getcreate_data() {
      return this.create_data;
    }
    public void Setcreate_data(String membuatdata){
        create_data=membuatdata;
    }
   
    
    public Integer Getid_admin() {
      return this.id_admin;
    }
    public void Setid_admin(Integer nomoradmin){
        id_admin=nomoradmin;
    }
    
}
