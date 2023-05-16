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
    public String nik;
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
    public String Getnama(){
       return this.nama;
    }
    public String Getjk(){
       return this.jk;
    }
    public String GetTempatlahir(){
       return this.tempat_lahir;
    }
    public String Getnik(){
       return this.nik;
    }
    public String Gettanggal_lahir(){
       return this.tanggal_lahir;
    }
    public Integer Getumur(){
       return this.umur;
    }
    public String Getrt(){
       return this.rt;
    }
    public String Getrw(){
       return this.rw;
    }
    public String Getlingkungan(){
       return this.lingkungan;
    }
    public Integer Getid_desa(){
        return this.id_desa;
    }
    public String Getalamat() {
      return this.alamat;
    }
    public Integer GetId_user(){
        return this.id_user;
    }
    public String Getcreate_date() {
      return this.create_date;
   }
}
