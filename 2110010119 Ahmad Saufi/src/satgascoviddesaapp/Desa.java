/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satgascoviddesaapp;

/**
 *
 * @author pc
 */
public class Desa {
    public Integer id_desa;
    public String nama_desa;
    public Integer id_kecamatan;
    
    public Integer Getid_desa(){
        return this.id_desa;
    }
    public void SetId_desa(Integer nomordesa){
        id_desa=nomordesa;
    }
    
     
    public String Getnama_desa(){
        return this.nama_desa;
    }
    public void Setnama_desa(String Nama_desa){
        nama_desa=Nama_desa;
    }
    
    
    public Integer id_kecamatan(){
        return this.id_kecamatan;
    }
    public void SetId_kecamatan(Integer nomorkecamatan){
        id_kecamatan=nomorkecamatan;
    }
    
    
}
