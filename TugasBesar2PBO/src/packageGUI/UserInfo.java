/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageGUI;

/**
 *
 * @author User
 */
public class UserInfo {
    private String kdNIM;
    private String NIM;
    private String Jurusan;
    private String TahunMasuk;
    private String Bulan;
    private String Tahun;
    private String Tanggal;

    public UserInfo(String NIM, String Jurusan, String TahunMasuk, String Bulan, String Tahun, String Tanggal) {
        this.NIM = NIM;
        this.Jurusan = Jurusan;
        this.TahunMasuk = TahunMasuk;
        this.Bulan = Bulan;
        this.Tahun = Tahun;
        this.Tanggal = Tanggal;
    }

    public UserInfo() {
    }

    public String getNIM() {
        //21 TI, 22 SI, 23 MJ, 24 TE, 25 AK
        //2422090906
        //TahunMasuk, Jurusan, Tanggal, Bulan, Tahun
        String NIM = kdNIM.substring(0,11) ;
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getJurusan() {
        String kdJurusan = kdNIM.substring(2,4);
        if(kdJurusan.equals("21")){
            Jurusan = "Teknik Informatika";
        }else if(kdJurusan.equals ("22")){
            Jurusan = "Sistem Informasi";
        }else if(kdJurusan.equals ("23")){
            Jurusan = "Manajemen";
        }else if(kdJurusan.equals ("24")){
            Jurusan = "Teknik Elektro";
        }else if(kdJurusan.equals ("25")){
            Jurusan = "Akuntansi";
        }else{
            Jurusan = "None";
        }
        return Jurusan;
    }

    public void setJurusan(String Jurusan) {
        this.Jurusan = Jurusan;
    }

    public String getTahunMasuk() {
        String kdThnMsk = kdNIM.substring(0,2);
        int ThnMsk = Integer.parseInt(kdThnMsk);
        String Pthn;
        if(ThnMsk < 26){
            Pthn = "20";
        }else{
            Pthn = "19";
        }
        TahunMasuk = Pthn+kdThnMsk;
        return TahunMasuk;
    }

    public void setTahunMasuk(String TahunMasuk) {
        this.TahunMasuk = TahunMasuk;
    }

    public String getBulan() {
        String kdBulan = kdNIM.substring(6,8);
        if(kdBulan.equals("01")){
            Bulan = "Januari";
        }else if(kdBulan.equals("02")){
            Bulan = "Februari";
        }else if(kdBulan.equals("03")){
            Bulan = "Maret";
        }else if(kdBulan.equals("04")){
            Bulan = "April";
        }else if(kdBulan.equals("05")){
            Bulan = "Mei";
        }else if(kdBulan.equals("06")){
            Bulan = "Juni";
        }else if(kdBulan.equals("07")){
            Bulan = "Juli";
        }else if(kdBulan.equals("08")){
            Bulan = "Agustus";
        }else if(kdBulan.equals("09")){
            Bulan = "September";
        }else if(kdBulan.equals("10")){
            Bulan = "Oktober";
        }else if(kdBulan.equals("11")){
            Bulan = "November";
        }else if(kdBulan.equals("12")){
            Bulan = "Desember";
        }else{
            Bulan = "BAKAAAAAAAA";
        }
        return Bulan;
    }

    public void setBulan(String Bulan) {
        this.Bulan = Bulan;
    }

    public String getTahun() {
        String kdThnMsk = kdNIM.substring(9,11);
        int ThnMsk = Integer.parseInt(kdThnMsk);
        String Pthn;
        if(ThnMsk < 26){
            Pthn = "20";
        }else{
            Pthn = "19";
        }
        Tahun = Pthn+kdThnMsk;
        return Tahun;
    }

    public void setTahun(String Tahun) {
        this.Tahun = Tahun;
    }

    public String getTanggal() {
        Tanggal = kdNIM.substring(4,6);
        return Tanggal;
    }

    public void setTanggal(String Tanggal) {
        this.Tanggal = Tanggal;
    }
    
    
}
