package Lesson1_Object;

public class Car {
    String brand;
    String model;
    double engineCapacity;
    String colour;
    int year;
    String country;

    public Car(String brand, String model, double engineCapacity, String colour, int year, String country) {
        this.brand = brand;
        if (brand == null) {
            this.brand = "default";
        }
        this.model = model;
        if (model == null) {
            this.model = "default";
        }
        this.engineCapacity = engineCapacity;
        if (engineCapacity <= 0) {
            this.engineCapacity = 1.5;
        }
        this.colour = colour;
        if (colour == null) {
            this.colour = "белый";
        }
        this.year = year;
        if (year <= 0) {
            this.year = 2000;
        }
        this.country = country;
        if (country == null) {
            this.country = "default";
        }
    }

    @Override
    public String toString() {
        return brand +" "+ model +", "+ year +" год выпуска, производство - " + country+
                ", цвет - " + colour + ", объем двигателя = " + engineCapacity+".";
    }
}
