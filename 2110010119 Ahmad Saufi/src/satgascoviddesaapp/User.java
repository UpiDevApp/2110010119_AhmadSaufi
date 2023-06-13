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
    private String nama;
    private long nik;
    private String jk;
    public  String[] jenisk = {"laki-laki","perempuan"};
    private String tempat_lahir;
    private String alamat;
    private String tgl_lahir;
    private Integer id_desa;
    private String email;
    private String level;
    private String username;
    private String password;
    private String valid;
    private String photo;
    
    
    // method
    public void tampilkanDataUser(){
        System.out.println("");
        System.out.println("DATA PENGGUNA ");
        System.out.println("id             : "+ id_user);
        System.out.println("nama           : "+ nama);
        System.out.println("nik            : "+ nik);
        System.out.println("jenis kelamin  : "+ jk);
        System.out.println("jenis kelamin  : " + jenisk[0]);
        System.out.println("Tempat Lahir   : "+ tempat_lahir);
        System.out.println("Tanggal Lahir  : "+ tgl_lahir);
        System.out.println("Alamat         : "+ alamat);
        System.out.println("id desa        : "+ id_desa);
        System.out.println("Email          : "+ email);
        System.out.println("Level          : "+ level);
        System.out.println("username       : "+ username);
        System.out.println("password       : "+ password);
        System.out.println("Status         : "+ valid);
        System.out.println("Gambar         : "+ photo);

    }
    
    // Method get dan set di bawah ini
    public Integer GetId_user(){
        return this.id_user;
    }
    public void SetId_user(Integer idPengguna){
        id_user=idPengguna;
    }
    
    
    public String Getnama(){
        return this.nama;
    }
     public void SetNama(String NamaPengguna){
        nama=NamaPengguna;
    }
    
     
    public long GetNik(){
        return this.nik;
    }
    public void SetNik(long Nik){
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
    
    
    public String GetTanggalLahir(){
        return this.tgl_lahir;
    }
    public void SetTanggalLahir(String Tempatlahir){
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
