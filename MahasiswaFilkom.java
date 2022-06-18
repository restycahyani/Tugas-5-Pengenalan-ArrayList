package com.company;

public class MahasiswaFilkom extends Manusia{
private String NIM;
private double IPK;

    public MahasiswaFilkom(String nama, String NIK, boolean JenisKelamin, boolean Menikah, String NIM, double IPK) {
        super(nama, NIK, JenisKelamin, Menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    public String getNIM() {
        return NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }
    public double GetBeasiswa(){
    if(IPK >= 3.5 && IPK <= 4.0){
        return 75 + getTunjangan();
    }else if( IPK >= 3.0 && IPK <= 3.5){
        return 50 + getTunjangan();
    }else{
        return getTunjangan();
    }
    }

    public String getStatus(){
        String akt = "20" + NIM.substring(0, 2);
        String prodi = switch (NIM.substring(6, 7)){
            case "2" -> "Teknik Meniup Gelembung";
            case "3" -> "Teknik Berburu Ubur Ubur";
            case "4" -> "Sistem Perhamburgeran";
            case "6" -> "Pendidikan Chum Bucket";
            case "7" -> "Teknologi Telepon Kerang";
            default -> "";
        };
        return prodi + ", " + akt;
    }

    @Override
    public String toString() {
        return "\nNama           : " + getNama() + "\nNIK            : " + getNIK()
                + "\nJenis Kelamin  : " + (isJenisKelamin()? "Laki-Laki": "Perempuan")
                + "\nPendapatan     : " + GetBeasiswa() + "$" + "\nIPK            : " + getIPK()
                + "\nNIM            : " + getNIM() + "\nStatus         : " + getStatus();
    }
}
