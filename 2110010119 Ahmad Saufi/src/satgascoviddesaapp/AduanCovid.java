/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satgascoviddesaapp;

/**
 *
 * @author pc
 */
public class AduanCovid {
    public Integer id_laporan;
    public String nomor_aduan;
    public String judul;
    public String isi;
    public String file;
    public String status;
    public Integer user;
    public String create_data;
    public String update_date;
    
public Integer Getid_laporan(){
    return this.id_laporan;
}
public String Getnomor_aduan(){
    return this.nomor_aduan;
}
public String Getjudul(){
    return this.judul;
}
public String Getisi(){
    return this.isi;
}
public String Getfile(){
    return this.file;
}
public String Getstatus(){
    return this.status;
}
public Integer Getuser(){
    return this.user;
}
public String Getcreate_date(){
    return this.create_data;
}
public String Getupdate_date(){
    return this.update_date;
}
}
