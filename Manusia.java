package com.company;

public class Manusia {
    private String nama;
    private String NIK;
    private boolean JenisKelamin;
    private boolean Menikah;

    public String getNama(){
        return nama;
    }

    public String getNIK() {
        return NIK;
    }

    public boolean isJenisKelamin() {
        return JenisKelamin;
    }

    public boolean isMenikah() {
        return Menikah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        JenisKelamin = jenisKelamin;
    }

    public void setMenikah(boolean menikah) {
        Menikah = menikah;
    }

    public Manusia(String nama, String NIK, boolean JenisKelamin, boolean Menikah){
    this.nama = nama;
    this.NIK = NIK;
    this.Menikah = Menikah;
    this.JenisKelamin = JenisKelamin;
    }

    public double getTunjangan(){
        if (JenisKelamin == true && Menikah == true){
            return 25;
        }else if (JenisKelamin == false && Menikah == true){
            return 20;
        }else
            return 15;
    }
    public double getPendapatan(){
        return getTunjangan();
    }
    @Override
    public String toString() {
        return "\nNama\t\t\t: " + getNama() + "\nNIK\t\t\t\t: " + getNIK()
                + "\nJenis Kelamin\t: " + (isJenisKelamin()? "Laki-Laki": "Perempuan")
                + "\nPendapatan\t\t: " + getPendapatan();
    }
}
