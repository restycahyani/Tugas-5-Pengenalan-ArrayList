package com.car;

import java.util.ArrayList;

public class CarData {
    public static ArrayList<Car> carList= new ArrayList<>();

    static void addCar(String carType, String polNum, String merk) {
        carList.add(new Car(carType, polNum, merk, true));
    }

    public static void listOfCar() {
        System.out.println("============================");
        System.out.println("\t\tDAFTAR MOBIL\t\t");
        System.out.println("============================");
        for (int i = 0; i < carList.size(); i++) {
            System.out.println("TIPE MOBIL\t: " + carList.get(i).getCarType());
            System.out.println("NO POLISI\t: " + carList.get(i).getPolNum());
            System.out.println("MERK MOBIL\t: " + carList.get(i).getMerk());
            System.out.println("----------------------------");
        }
    }
}
