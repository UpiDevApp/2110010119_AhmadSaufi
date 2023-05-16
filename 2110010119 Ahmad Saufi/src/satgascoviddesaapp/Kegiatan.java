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
    
  public Integer GetId_kegiatan() {
      return this.id_kegiatan;
   }

   public void SetId_kegiatan(Integer Id_kegiatan) {
      id_kegiatan = Id_kegiatan;
   }

   public String Getnama_kegiatan() {
      return this.nama_kegiatan;
   }

   public String Gettujuan() {
      return this.tujuan;
   }

   public String Getalamat() {
      return this.alamat;
   }

   public String Getnama_penyelenggara() {
      return this.nama_penyelenggara;
   }

   public String Getkontak() {
      return this.kontak;
   }

   public String Getstatus() {
      return this.status;
   }

   public String Gettanggalmulai() {
      return this.tanggal_mulai;
   }
   
   public String Gettanggalakhir() {
      return this.tanggal_akhir;
   }
   
   public String Getcreate_data() {
      return this.create_data;
   }
   
   public Integer Getid_admin() {
      return this.id_admin;
   }
}
