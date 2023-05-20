/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satgascoviddesaapp;

/**
 *
 * @author pc
 */
public class PositifCovid {
    public Integer id;
    public Integer id_pasien;
    public String tanggal;
    public String keterangan;
    public Integer id_user;
    public String create_date;
    public Integer id_desa;
    
    public Integer Getid() {
      return this.id;
    }
    public void Setid(Integer ID){
        id=ID;
    }
    
    
    public Integer Getid_pasien(){
      return this.id_pasien;
    }
    public void Setid_pasien(Integer nomorpasien){
        id_pasien=nomorpasien;
    }
    
    
    public String Gettanggal() {
      return this.tanggal;
    }
    public void Settanggal(String Tanggal){
        tanggal=Tanggal;
    }
    
    public String Getketerangan(){
      return this.keterangan;
    }
    public void Setketerangan(String Keterangan){
        keterangan=Keterangan;
    }
    
    
    public Integer Getid_user() {
      return this.id_user;
    }
    public void SetId_user(Integer idPengguna){
        id_user=idPengguna;
    }
    
    
    public String Getcreate_date(){
      return this.create_date;
    }
    public void Setcreate_data(String membuatdata){
        create_date=membuatdata;
    }
   
    
    public Integer Getid_desa() {
      return this.id_desa;
    }
    public void SetId_desa(Integer nomordesa){
        id_desa=nomordesa;
    }
}
