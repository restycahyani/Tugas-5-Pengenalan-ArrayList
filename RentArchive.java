package com.car;

import java.util.ArrayList;

public class RentArchive {
    public static ArrayList<CarRent> rentData = new ArrayList<>();

    public static void Rent(CarRider rider, Car car, int rentDur) {
        rentData.add(new CarRent(rider, car, rentDur));
    }

    static void info() {
        System.out.println("============================");
        System.out.println("\tINFORMASI PELANGGAN\t");
        System.out.println("============================");
        for (int i = 0; i < rentData.size(); i++) {
            System.out.println("NAMA PEMINJAM\t: " + rentData.get(i).getRider().getName());
            System.out.println("TIPE MOBIL\t\t: " + rentData.get(i).getCar().getCarType());
            System.out.println("NO POLISI\t\t: " + rentData.get(i).getCar().getPolNum());
            System.out.println("LAMA RENTAL\t\t: " + rentData.get(i).getRentDur());
            System.out.println("----------------------------");
        }
    }
}
