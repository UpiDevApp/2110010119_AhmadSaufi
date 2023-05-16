/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satgascoviddesaapp;

/**
 *
 * @author pc
 */
public class User {
    private Integer id_user;
    public String nama;
    private Integer nik;
    public String jk;
    public String tempat_lahir;
    public String alamat;
    public String tgl_lahir;
    public Integer id_desa;
    public String email;
    public String level;
    public String username;
    public String password;
    public String valid;
    public String photo;
    
    
    // method
    public void tampilkanKata(){
        System.out.println("ini adalah "+ id_user);
    }
    
    // Method get dan set di bawah ini
    public Integer GetId_user(){
        return this.id_user;
    }
    public void SetId_user(Integer Pengguna){
        id_user=Pengguna;
    }
    
    
    public String Getnama(){
        return this.nama;
    }
     public void SetNama(String NamaPengguna){
        nama=NamaPengguna;
    }
    
     
    public Integer GetNik(){
        return this.nik;
    }
    public void SetNik(Integer Nik){
        nik=Nik;
    }
    
    public String Getjk(){
        return this.jk;
    }
    public void Setjk(String jenis_kelamin){
        jk=jenis_kelamin;
    }
    
    
     public String GetTempatLahir(){
        return this.tempat_lahir;
    }
     public void SetTempatLahir(String Tempat_lahir){
        tempat_lahir=Tempat_lahir;
    }
    
     
    public String GetAlamat(){
        return this.alamat;     
    }
    public void Setalamat(String Alamat){
        alamat=Alamat;
    }
    
    
    public String GetTtl(){
        return this.tgl_lahir;
    }
    public void SetTtl(String Tempatlahir){
       tempat_lahir=Tempatlahir;
    }
     
    
    public Integer Getid_desa(){
        return this.id_desa;
    }
    public void Setid_desa(Integer Id_desa){
        id_desa = Id_desa;
                
    }
    
    
    public String GetEmail(){
        return this.email;
    }
    public void SetEmail(String Email){
        email=Email;
    }
    
    
    public String Getlevel(){
        return this.level;
    }
    public void Setlevel(String Level){
        level=Level;
    }
     
    
    public String Getusername(){
        return this.username;
    }
    public void Setusername(String Username){
        username = Username;
    }
    
    
    public String Getpassword(){
        return this.password;
    }
    public void Setpassword(String Password){
        password=Password;
    }
    
    
    public String Getvalid(){
        return this.valid;
    }
    public void Setvalid(String Valid){
        valid= Valid;
    }
    
    
    public String Getphoto(){
        return this.photo;
    }
    public void Setphoto(String Gambar){
        photo=Gambar;
    }
}
