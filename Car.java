package com.car;

public class Car {
    public String carType, polNum, merk;
    public boolean status;

    public Car(String carType, String polNum, String merk, boolean status) {
        this.carType = carType;
        this.polNum = polNum;
        this.merk = merk;
        this.status = status;
    }

    public String getCarType() {
        return carType;
    }
    public String getPolNum() {
        return polNum;
    }
    public String getMerk() {
        return merk;
    }
    public boolean isStatus() {
        return status;
    }

    public static void setStatus(String status) {
        if (status == "true") {
            System.out.println("MOBIL BERHASIL DISEWA");
        } else {
            System.out.println("MAAF, MOBIL SUDAH DISEWA");
        }
    }
}