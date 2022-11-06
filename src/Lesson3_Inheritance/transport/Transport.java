package Lesson3_Inheritance.transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String bodyColour;
    private int maxSpeed;

    public Transport(String brand, String model, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.maxSpeed = 100;
        this.bodyColour = "White";
    }

    public Transport(String brand, String model, int year, String country, String bodyColour, int maxSpeed) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "Unknown";
        } else {this.brand = brand;}
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "Unknown";
        } else {this.model = model;}
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Unknown";
        } else {
            this.country = country;
        }
        if (bodyColour == null || bodyColour.isEmpty() || bodyColour.isBlank()) {
            this.bodyColour = "white";
        } else {
            this.bodyColour = bodyColour;
        }
        if (maxSpeed <= 0) {
            this.maxSpeed = Math.abs(maxSpeed);
        } else {
            this.maxSpeed = maxSpeed;}
    }

    @Override
    public String toString() {
        return "Short characteristics: Brand - "+brand+". Model - "+model+". Production year - "+year+
                ". Production country - "+country+ ". Body colour - "+bodyColour+". Max speed - "+maxSpeed+"km/h";
    }

    public abstract void refill();

    public void setBodyColour(String bodyColour) {
        if (bodyColour == null || bodyColour.isEmpty() || bodyColour.isBlank()) {
            this.bodyColour = "white";
        } else {
            this.bodyColour = bodyColour;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = Math.abs(maxSpeed);
        } else {
            this.maxSpeed = maxSpeed;}
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyColour() {
        return bodyColour;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
