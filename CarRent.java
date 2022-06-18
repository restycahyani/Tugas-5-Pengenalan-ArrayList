package com.car;

public class CarRent {
    public CarRider rider;
    public Car car;
    public int rentDur;

    CarRent(CarRider rider, Car car, int rentDur) {
        this.rider = rider;
        this.car = car;
        this.rentDur = rentDur;
    }

    public CarRider getRider() {
        return rider;
    }
    public Car getCar() {
        return car;
    }
    public int getRentDur() {
        return rentDur;
    }
}
