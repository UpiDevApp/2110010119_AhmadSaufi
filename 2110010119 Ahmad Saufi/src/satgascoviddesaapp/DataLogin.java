/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satgascoviddesaapp;

/**
 *
 * @author pc
 */
public class DataLogin {
    public String username;
    public String email;
    public String akses;
    public Integer id_user;
    
    public void tampilkanDataLogin(){
        System.out.println("");
        System.out.println("Data Login ");
        System.out.println("id user  :"+id_user);
        System.out.println("username :"+username);
        System.out.println("email    :"+email);
        System.out.println("akses    :"+akses);
        
        
    }
    public String Getusername(){
        return this.username;
    } 
    public void Setusername(String Username){
        username=Username;
    }
    
    
    public String GetEmail(){
        return this.email;
    }
    public void Setemail(String Email){
        email=Email;
    }
    
    
    
    public String Getakses(){
        return this.akses;
    }
    public void Setakses(String Akses){
        akses=Akses;
    }
    
     
    public Integer GetId_user(){
        return this.id_user;
    }
    public void SetId_user(Integer idPengguna){
        id_user=idPengguna;
    }
    
    
}
