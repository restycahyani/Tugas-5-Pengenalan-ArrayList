package com.car;

public class Main {
    public static void main(String[] args) {
        CarRider ming = new CarRider("Lin Ming", 19, "081234567891");
        CarRider yohan = new CarRider("Bei Yohan", 20, "081122223333");
        CarRider ling = new CarRider("Ling Ling", 28, "084455556666");
        CarRider alfi = new CarRider("ALfitul", 20, "087788889999");

        CarData.addCar("SUV", "N 1111 AB", "Honda");
        CarData.addCar("SPORT", "N 2222 AB", "SSC Tuatara");
        CarData.addCar("TRUCK", "N 3333 AB", "Suzuki");
        CarData.addCar("PICK-UP", "N 4444 SG", "Yamaha");

        CarData.listOfCar();

        RentArchive.Rent(ming, CarData.carList.get(0), 9);
        RentArchive.Rent(yohan, CarData.carList.get(1), 3);
        RentArchive.Rent(ling, CarData.carList.get(2), 1);
        RentArchive.Rent(alfi, CarData.carList.get(0), 2);

        System.out.println();
        Car.setStatus("true");
        Car.setStatus("true");
        Car.setStatus("true");
        Car.setStatus("false");

        System.out.println();
        RentArchive.info();
    }
}
