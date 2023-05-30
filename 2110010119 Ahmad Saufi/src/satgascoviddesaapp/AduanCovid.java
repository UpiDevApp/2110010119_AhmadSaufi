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
    public Integer nomor_aduan;
    public String judul;
    public String isi;
    public String file;
    public String status;
    public Integer user;
    public String create_data;
    public String update_date;

    
    public void tampilkanDataAduanCovid(){
        System.out.println("");
        System.out.println("Data Aduan covid ");
        System.out.println("nomor aduan                : "+ nomor_aduan);
        System.out.println("judul aduan                : "+ judul);
        System.out.println("isi                        : "+ isi);
        System.out.println("upload file                : "+ file);
        System.out.println("status                     : "+ status);
        System.out.println("id pengguna                : "+ user);
        System.out.println("tanggal membuat data       : "+ create_data);
        System.out.println("tanggal memperbaharui data : "+ update_date);
    }
    
    
    
public Integer Getid_laporan(){
    return this.id_laporan;
}
 public void SetId_laporan(Integer idlaporan){
        id_laporan=idlaporan;
    }


public Integer Getnomor_aduan(){
    return this.nomor_aduan;
}
public void Setnomor_aduan(Integer no_aduan){
    nomor_aduan=no_aduan;
}

public String Getjudul(){
    return this.judul;
}
public void Setjudul(String juduladuan){
    judul=juduladuan;
}

public String Getisi(){
    return this.isi;
}
public void Setisi(String isiaduan){
    isi=isiaduan;
}

public String Getfile(){
    return this.file;
}
public void Setfile(String fileaduan){
    file=fileaduan;
}


public String Getstatus(){
    return this.status;
}
public void Setstatus(String statusaduan){
    status=statusaduan;
}


public Integer Getuser(){
    return this.user;
}
public void SetId_user(Integer idPengguna){
        user=idPengguna;
    }


public String Getcreate_date(){
    return this.create_data;
}
public void Setcreate_date(String membuatdata){
    create_data=membuatdata;
}


public String Getupdate_date(){
    return this.update_date;
}
public void Setupdate_date(String perbaharuidata){
    update_date=perbaharuidata;
}

}
