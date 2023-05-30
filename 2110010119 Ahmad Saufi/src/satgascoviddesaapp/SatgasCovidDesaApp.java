/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package satgascoviddesaapp;

/**
 *
 * @author pc
 */
public class SatgasCovidDesaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // ada 15 Object
       User user = new User();
       user.SetId_user(01);
       user.SetNama("ahmad udin");
       user.SetNik(5214524232532222L);
       user.Setjk("laki-laki");
       user.SetTempatLahir("Banjarmasin");
       user.Setalamat("Desa 01");
       user.SetTanggalLahir("12-08-2020");
       user.Setid_desa(01);
       user.SetEmail("udin@gmail.com");
       user.Setlevel("1");
       user.Setusername("ahmadudin");
       user.Setpassword("1234567");
       user.Setvalid("Positif");
       user.Setphoto("belum di pasang");
       //method
       user.tampilkanDataUser();
       
       
       Kegiatan kegiatan = new Kegiatan();
       kegiatan.SetId_kegiatan(101);
       kegiatan.SetId_user(01);
       kegiatan.Setnama_kegiatan("Pemeriksaan covid");
       kegiatan.Settujuan("pedesaan");
       kegiatan.Setalamat("jl desa ");
       kegiatan.Setnama_penyelenggara("samsul");
       kegiatan.Setkontak("082060101201");
       kegiatan.Setstatus("positif");
       kegiatan.Settanggalmulai("01-02-2020");
       kegiatan.Settanggalakhir("03-02-2020");
       kegiatan.Setcreate_data("01-02-2020");
       kegiatan.Setid_admin(90);
       //method
       kegiatan.tampilkanDataKegiatan();
       
       
       AduanCovid aduan = new AduanCovid(); 
       aduan.Setnomor_aduan(555);
       aduan.Setjudul("Pusat Aduan Covid");
       aduan.Setisi("saya positif");
       aduan.Setfile("belum ada file");
       aduan.Setstatus("Aktif");
       aduan.SetId_user(01);
       aduan.Setcreate_date("02-02-2020");
       aduan.Setupdate_date("03-02-2020");
       //method
       aduan.tampilkanDataAduanCovid();
       
       
       DataLogin datalogin = new DataLogin();
        datalogin.SetId_user(01);
        datalogin.Setemail("udin@gmail.com");
        datalogin.Setakses("Aktif");
        datalogin.Setusername("ahmadudin");
        // method
        datalogin.tampilkanDataLogin();
       
       Bantuan bantuan = new Bantuan(); 
       bantuan.SetId_user(01);
       bantuan.Setnama_penerima("ahmad udin");
       bantuan.Setnik(5214524232532222L);
       bantuan.Setnokk("7015");
       bantuan.Setalamat("Desa 01");
       bantuan.Setfile("belum di upload");
       bantuan.Setstatus("aktif");
       bantuan.Setcreate_date("04-02-2020");
       bantuan.Setid_admin(91);
       // method
       bantuan.tampilkanDataBantuan();
        
       Kategori kategori = new Kategori();
       kategori.SetId_kategori(001);
       kategori.Setkategori("POSITIF");
       // method
       kategori.TampilkanDataKategori();
       
       Berita berita = new Berita();
       berita.Setid_berita(10);
       berita.Setjudul("Penanganan Covid di desa");
       berita.Setisi("isi");
       berita.Setstatus("aktif");
       berita.Setid_kategori(10);
       berita.SetId_user(01);
       berita.Setdate("05-02-2020");
       //method
       berita.tampilkanDataBerita();
    } 
    
   

    public static void main7(String[] args) {
       Pasien pasien = new Pasien();
    }
    public static void main8(String[] args) {
       Desa desa = new Desa();
    }
    public static void main9(String[] args) {
       Odp odp = new Odp();
    }
    public static void main10(String[] args) {
        Pdp pdp = new Pdp();
    }
    public static void main11(String[] args) {
        PositifCovid positif = new PositifCovid();
    }
    public static void main12(String[] args) {
        sembuhCovid sembuh = new sembuhCovid();
    }
    public static void main13(String[] args) {
        sembuhCovid sembuh = new sembuhCovid();
    }
    public static void main14(String[] args) {
        Meninggal meninggal = new Meninggal();
    }
       
       
       
       
       
       
      
     
       
       
       
     
    
}
