/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satgascoviddesaapp;

/**
 *
 * @author pc
 */
public class Bantuan {
    public Integer id_bantuan;
    public Integer id_user;
    public String nama_penerima;
    public Integer nik;
    public String nokk;
    public String alamat;
    public String file;
    public String status;
    public String create_date;
    public Integer id_admin;
    
    
    public Integer Getid_bantuan(){
        return this.id_bantuan;
    }
    public void Setid_bantuan(Integer idbantuan){
        id_bantuan=idbantuan;
    }
    
    
    public Integer Getid_user(){
        return this.id_user;
    }
    public void SetId_user(Integer idPengguna){
        id_user=idPengguna;
    }
    
    public String Getnama_penerima(){
        return this.nama_penerima;
    }
    public void Setnama_penerima(String namapenerima){
        nama_penerima = namapenerima;
    }
    
    public Integer Getnik(){
        return this.nik;
    }
    public void Setnik(Integer Nik){
        nik=Nik;
    }
    
    
    public String Getnokk(){
        return this.nokk;
    }
      public void Setnokk(String Nokk){
        nokk=Nokk;
    }
    
    public String Getalamat(){
        return this.alamat;
    }
    public void Setalamat(String Alamat){
        alamat=Alamat;
    }
    
    
    public String Getfile(){
        return this.file;
    }
    public void Setfile(String filebantuan){
    file=filebantuan;
}

    public String Getstatus(){
        return this.status;
    }
    public void Setstatus(String statusbantuan){
    status=statusbantuan;
    }
    
    
    public String Getcreate_date(){
        return this.create_date;
    }
    public void Setcreate_date(String membuatdata){
    create_date=membuatdata;
    }
    
    
    public Integer Getid_admin(){
        return this.id_admin;
    }
    public void Setid_admin(Integer nomoradmin){
        id_admin=nomoradmin;
    }
}
