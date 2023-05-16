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
    public String nik;
    public String nokk;
    public String alamat;
    public String file;
    public String status;
    public String create_date;
    public Integer id_admin;
    
    
    public Integer Getid_bantuan(){
        return this.id_bantuan;
    }
    
    public Integer Getid_user(){
        return this.id_user;
    }
    
    public String Getnama_penerima(){
        return this.nama_penerima;
    }
    
    public String Getnik(){
        return this.nik;
    }
    
    public String Getnokk(){
        return this.nokk;
    }
    
    public String Getalamat(){
        return this.alamat;
    }
    
    public String Getfile(){
        return this.file;
    }
    public String Getstatus(){
        return this.status;
    }
    public String Getcreate_date(){
        return this.create_date;
    }
    public Integer Getid_admin(){
        return this.id_admin;
    }
}
