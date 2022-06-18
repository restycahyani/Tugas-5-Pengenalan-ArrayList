package com.company;

public class Pekerja extends Manusia{
private double Gaji;
private double Bonus;
private int JamKerja;
private int HariKerja;
private String NIP;

    public Pekerja(String nama, String NIK, String NIP, boolean JenisKelamin, boolean Menikah, int JamKerja, int HariKerja) {
        super(nama, NIK, JenisKelamin, Menikah);
        this.NIP = NIP;
        this.JamKerja = JamKerja;
        this.HariKerja = HariKerja;
    }

    public double getGaji() {
        return Gaji;
    }

    public double getBonus() {
        return Bonus;
    }

    public int getJamKerja() {
        return JamKerja;
    }

    public int getHariKerja() {
        return HariKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setGaji(double gaji) {
        this.Gaji = gaji;
    }

    public void setBonus(double bonus) {
        Bonus = bonus;
    }

    public void setJamKerja(int jamKerja) {
        JamKerja = jamKerja;
    }

    public void setHariKerja(int hariKerja) {
        HariKerja = hariKerja;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }
    public double gaji(){
        return getJamKerja() * getHariKerja() * 15;
    }
    public double bonus(){
        double bonusLembur = ((getHariKerja()/7) * 7 + (getHariKerja() % 7)) * ((getJamKerja() - 7) * 15);
        double bonusLibur = ((getHariKerja()/7) * 2 * getJamKerja() * 20);
        if(getJamKerja() > 7) {
            return bonusLembur + bonusLibur;
        } else {
            return bonusLibur;
        }
    }
    public String getStatus(){
        String Departemen = "";
        String KantorCabang = switch (NIP.substring(0,1)){
            case "1" -> "Mondstadt";
            case "2" -> "Liyue";
            case "3" -> "Inazuma";
            case "4" -> "Sumeru";
            case "5" -> "Fontaine";
            case "6" -> "Natlan";
            case "7" -> "Snezhnaya";
            default -> "";
        };
        switch (NIP.substring(6,7)){
            case "1" -> Departemen = "Pemasaran";
            case "2" -> Departemen = "Humas";
            case "3" -> Departemen = "Riset";
            case "4" -> Departemen = "Teknologi";
            case "5" -> Departemen = "Personalia";
            case "6" -> Departemen = "Akademik";
            case "7" -> Departemen = "Administrasi";
            case "8" -> Departemen = "Operasional";
            case "9" -> Departemen = "Pembangunan";
        }
        return Departemen + ", " + KantorCabang + " Cabang ke-" +  NIP.substring(2,3);
    }

    @Override
    public String toString() {
        return "\nNama\t\t\t: " + getNama() + "\nNIK\t\t\t\t: " + getNIK()
                + "\nJenis Kelamin\t: " + (isJenisKelamin()? "Laki-Laki": "Perempuan")
                + "\nPendapatan\t\t: " + (getTunjangan() + bonus() + gaji()) + "\nBonus\t\t\t: " + bonus() + "\nGaji\t\t\t: " + gaji()
                + "\nStatus\t\t\t: " + getStatus();
    }
}
