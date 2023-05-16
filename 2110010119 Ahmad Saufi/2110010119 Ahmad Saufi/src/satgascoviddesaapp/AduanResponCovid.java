/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satgascoviddesaapp;

/**
 *
 * @author pc
 */
public class AduanResponCovid {
    public Integer id_aduan_respon;
    public Integer id_laporan;
    public Integer id_user;
    public String isi;
    public String create_date;
    
    public Integer Getid_aduan_respon(){
    return this.id_aduan_respon;
    }
    public Integer Getid_laporan(){
    return this.id_laporan;
    }
    public Integer Getid_user(){
    return this.id_user;
    }
    public String Getisi(){
    return this.isi;
    }
    public String Getcreate_date(){
    return this.create_date;
    }
}
