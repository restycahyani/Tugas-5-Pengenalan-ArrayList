package com.company;

public class Manajer extends Pekerja{
private int LamaKerja;

    public Manajer(String nama, String NIK, String NIP, boolean JenisKelamin, boolean Menikah, int JamKerja, int HariKerja, int LamaKerja){
        super(nama, NIK, NIP, JenisKelamin, Menikah, JamKerja, HariKerja);
        this.LamaKerja = LamaKerja;
    }
    public int getLamaKerja() {
        return LamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        LamaKerja = lamaKerja;
    }
    public double bonusManajer(){
        return bonus() * 0.3;
    }

    @Override
    public String toString() {
        return "\nNama\t\t\t: " + getNama() + "\nNIK\t\t\t\t: " + getNIK()
                + "\nJenis Kelamin\t: " + (isJenisKelamin()? "Laki-Laki": "Perempuan")
                + "\nPendapatan\t\t: " + (getPendapatan() + bonus() + gaji()) + "$\nBonus\t\t\t: " + (bonus() + bonusManajer()) + "\nGaji\t\t\t: " + gaji()
                + "\nStatus\t\t\t: " + getStatus() + "\nLama Kerja\t\t: " + getLamaKerja() + " hari";
    }
}
