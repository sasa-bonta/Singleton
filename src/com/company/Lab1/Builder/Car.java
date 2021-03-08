package com.company.Lab1.Builder;

public class Car {

    private String brand;
    private String model;
    private int year;
    private String vin;
    private String fuel;
    private double engineVolume;
    private double weight;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private Car() {

    }

    public static class CarBuilder {

        private String brand;
        private String model;
        private int year;
        private String vin;
        private String fuel;
        private double engineVolume;
        private double weight;

        // Builder

        public CarBuilder withBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder withModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder ofYear(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder withVin(String vin) {
            this.vin = vin;
            return this;
        }

        public CarBuilder withFuel(String fuel) {
            this.fuel = fuel;
            return this;
        }

        public CarBuilder withEngineVolume(double engineVolume) {
            this.engineVolume = engineVolume;
            return this;
        }

        public CarBuilder withWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Car build() {
            Car car = new Car();
            car.brand = this.brand;
            car.model = this.model;
            car.year = this.year;
            car.vin = this.vin;
            car.fuel = this.fuel;
            car.engineVolume = this.engineVolume;
            car.weight = this.weight;
            return car;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", vin='" + vin + '\'' +
                ", fuel='" + fuel + '\'' +
                ", engineVolume=" + engineVolume +
                ", weight=" + weight +
                '}';
    }
}
