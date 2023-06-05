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
       /* ada 15 Object di dalamnya ada beberapa data tidak real
          data hanya di tampilkan saja
       */
       // data user
       User user = new User();
       user.SetId_user(01);
       user.SetNama("ahmad udin");
       user.SetNik(5214524232532222L);
       user.Setjk("laki-laki");
       user.SetTempatLahir("Banjarmasin");
       user.Setalamat("Desa 01");
       user.SetTanggalLahir("12-08-2001");
       user.Setid_desa(01);
       user.SetEmail("udin@gmail.com");
       user.Setlevel("1");
       user.Setusername("ahmadudin");
       user.Setpassword("1234567");
       user.Setvalid("Positif");
       user.Setphoto("belum di pasang");
       //method
       user.tampilkanDataUser();
       
       // data kegiatan
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
       
       // data aduan
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
       
       // data aduan Respon
       AduanResponCovid aduanrespon = new AduanResponCovid();
       aduanrespon.SetId_aduan_respon(55);
       aduanrespon.SetId_laporan(20);
       aduanrespon.SetId_user(01);
       aduanrespon.Setisi("Tepapar Covid");
       aduanrespon.Setcreate_date("02-02-2020");
       // method
       aduanrespon.tampilkanResponAduanCovid();
       
       // data login
       DataLogin datalogin = new DataLogin();
        datalogin.SetId_user(01);
        datalogin.Setemail("udin@gmail.com");
        datalogin.Setakses("Aktif");
        datalogin.Setusername("ahmadudin");
        // method
        datalogin.tampilkanDataLogin();
       
       // data bantuan
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
       
       // data kategori
       Kategori kategori = new Kategori();
       kategori.SetId_kategori(001);
       kategori.Setkategori("POSITIF");
       // method
       kategori.TampilkanDataKategori();
       
       // data Berita
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
       
       //data pasien
       Pasien pasien = new Pasien();
       pasien.Setid_pasien(01);
       pasien.SetNama("Ahmad udin");
       pasien.Setjk("laki-laki");
       pasien.SetTempatLahir("Banjarmasin");
       pasien.SetNik(5214524232532222L);
       pasien.SetTanggal_lahir("12-08-2020");
       pasien.Setumur(19);
       pasien.Setrt("01");
       pasien.Setrw("03");
       pasien.Setlingkungan("Rumah Sakit");
       pasien.SetId_desa(11);
       pasien.Setalamat("Desa 01");
       pasien.SetId_user(01);
       pasien.Setcreate_data("03-02-2020");
       // method
       pasien.tampilkanDataPasien();
       
       //data desa
       Desa desa = new Desa();
       desa.SetId_desa(11);
       desa.Setnama_desa("Desa 01");
       desa.SetId_kecamatan(15);
       // method
       desa.TampilkanDataDesa();       
       
       // data odp
       Odp odp = new Odp();
       odp.Setid(80);
       odp.Setid_pasien(01);
       odp.Settanggal("03-02-2020");
       odp.Setketerangan("Positif Covid");
       odp.SetId_user(01);
       odp.Setcreate_data("03-02-2020");
       odp.SetId_desa(11);
       // method
       odp.TampilkanDataOdp();
       
       Pdp pdp = new Pdp();
        pdp.Setid(80);
        pdp.Setid_pasien(01);
        pdp.Settanggal("03-02-2020");
        pdp.Setketerangan("Positif Covid");
        pdp.SetId_user(01);
        pdp.Setcreate_data("03-02-2020");
        pdp.SetId_desa(11);
        // method
        pdp.TampilkanDatapdp();
       
        
        PositifCovid positif = new PositifCovid();
        positif.Setid(11);
        positif.Setid_pasien(01);
        positif.Settanggal("03-02-2020");
        positif.Setketerangan("Positif Covid");
        positif.SetId_user(01);
        positif.Setcreate_data("03-02-2020");
        positif.SetId_desa(11);
        // method
        positif.TampilkanDataPositif();
        
        
        sembuhCovid sembuh = new sembuhCovid();
        sembuh.Setid(11);
        sembuh.Setid_pasien(01);
        sembuh.Settanggal("03-02-2020");
        sembuh.Setketerangan("Positif Covid");
        sembuh.SetId_user(01);
        sembuh.Setcreate_data("03-02-2020");
        sembuh.SetId_desa(11);
        //method
        sembuh.TampilkanDataSembuh();
        
        
        Meninggal meninggal = new Meninggal();
        meninggal.Setid(11);
        meninggal.Setid_pasien(01);
        meninggal.Settanggal("05-02-2020");
        meninggal.Setketerangan("Meninggal karena covid");
        meninggal.SetId_user(01);
        meninggal.Setcreate_data("06-02-2020");
        meninggal.SetId_desa(11);
        // method
        meninggal.TampilkanDataMeninggal();
        
        
    
    } 
    
   

       
       
       
       
      
     
       
       
       
     
    
}
