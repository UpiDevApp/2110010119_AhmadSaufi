/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satgascoviddesaapp;

/**
 *
 * @author pc
 */
public class Pasien {
    public Integer id_pasien;
    public String nama;
    public String jk;
    public String tempat_lahir;
    public Integer nik;
    public String tanggal_lahir;
    public Integer umur;
    public String rt;
    public String rw;
    public String lingkungan;
    public Integer id_desa;
    public String alamat;
    public Integer id_user;
    public String create_date;
    
    public Integer Getid_pasien(){
       return this.id_pasien; 
    }
    public void Setid_pasien(Integer nomorpasien){
        id_pasien=nomorpasien;
    }
    
    
    public String Getnama(){
       return this.nama;
    }
     public void SetNama(String Namapasien){
        nama=Namapasien;
    }
    
     
    public String Getjk(){
       return this.jk;
    }
    public void Setjk(String jenis_kelamin){
       jk=jenis_kelamin;
    }
    
     
    public String GetTempatlahir(){
       return this.tempat_lahir;
    }
    public void SetTempatLahir(String Tempat_lahir){
        tempat_lahir=Tempat_lahir;
    }
    
    
    public Integer Getnik(){
       return this.nik;
    }
    public void SetNik(Integer Nik){
        nik=Nik;
    }
    
    
    public String Gettanggal_lahir(){
       return this.tanggal_lahir;
    }
    public void SetTtl(String Tempatlahir){
       tempat_lahir=Tempatlahir;
    }
    
    
    public Integer Getumur(){
       return this.umur;
    }
    public void Setumur(Integer Umur){
       umur=Umur;
    }
    
    public String Getrt(){
       return this.rt;
    }
    public void Setrt(String Rt){
       rt=Rt;
    }
  
    
    public String Getrw(){
       return this.rw;
    }
    public void Setrw(String Rw){
       rw=Rw;
    }
    
    
    public String Getlingkungan(){
       return this.lingkungan;
    }
    public void Setlingkungan(String Lingkungan){
        lingkungan=Lingkungan;
    }
    
    
    public Integer Getid_desa(){
        return this.id_desa;
    }
    public void SetId_desa(Integer nomordesa){
        id_desa=nomordesa;
    }
    
    public String Getalamat() {
      return this.alamat;
    }
    public void Setalamat(String Alamat){
        alamat=Alamat;
    }
    
    
    public Integer GetId_user(){
        return this.id_user;
    }
    public void SetId_user(Integer idPengguna){
        id_user=idPengguna;
    }
    
 
    public String Getcreate_date() {
      return this.create_date;
   }
    public void Setcreate_data(String membuatdata){
        create_date=membuatdata;
    }
}
