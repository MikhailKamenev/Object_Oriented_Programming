package Lesson3_Inheritance.transport;

public class Train extends Transport {
        private double cost;
    private double timeOfTravelling;
    private String departureStation;
    private String arrivalStation;
    private int numberOfCarriages;
    private String fuel;

    public Train(String brand, String model, int year, String country, String bodyColour, int maxSpeed,
                 double cost, double timeOfTravelling, String departureStation, String arrivalStation,
                 int numberOfCarriages) {
        super(brand, model, year, country, bodyColour, maxSpeed);
        if (cost < 0) {
            this.cost = Math.abs(cost);
        } else if (cost > 50_000||cost==0) {
            this.cost = 10_000;
        } else {
            this.cost = cost;
        }
        if (timeOfTravelling < 0) {
            this.timeOfTravelling = Math.abs(timeOfTravelling);
        } else if (timeOfTravelling == 0 || timeOfTravelling > 300) {
            this.timeOfTravelling = 24;
        } else {
            this.timeOfTravelling = timeOfTravelling;
        }
        if (departureStation == null || departureStation.isEmpty() || departureStation.isBlank()) {
            this.departureStation = "Moscow";
        } else {
            this.departureStation = departureStation;
        }        if (arrivalStation == null || arrivalStation.isEmpty() || arrivalStation.isBlank()) {
            this.arrivalStation = "Moscow";
        } else {
            this.arrivalStation = arrivalStation;
        }
        if (numberOfCarriages < 0) {
            this.numberOfCarriages = Math.abs(numberOfCarriages);
        } else if (numberOfCarriages == 0||numberOfCarriages>50) {
            this.numberOfCarriages = 5;
        } else {
            this.numberOfCarriages = numberOfCarriages;
        }
        if (fuel == null || fuel.isEmpty() || fuel.isBlank()) {
            this.fuel = "diesel";
        } else {
            this.fuel = fuel;
        }
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        if (fuel == null || fuel.isEmpty() || fuel.isBlank()) {
            this.fuel = "diesel";
        } else {
            this.fuel = fuel;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost < 0) {
            this.cost = Math.abs(cost);
        } else if (cost > 50_000||cost==0) {
            this.cost = 10_000;
        } else {
            this.cost = cost;
        }
    }

    public double getTimeOfTravelling() {
        return timeOfTravelling;
    }

    public void setTimeOfTravelling(double timeOfTravelling) {
        if (timeOfTravelling < 0) {
            this.timeOfTravelling = Math.abs(timeOfTravelling);
        } else if (timeOfTravelling == 0 || timeOfTravelling > 300) {
            this.timeOfTravelling = 24;
        } else {
            this.timeOfTravelling = timeOfTravelling;
        }
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        if (departureStation == null || departureStation.isEmpty() || departureStation.isBlank()) {
            this.departureStation = "Moscow";
        } else {
            this.departureStation = departureStation;
        }
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        if (arrivalStation == null || arrivalStation.isEmpty() || arrivalStation.isBlank()) {
            this.arrivalStation = "Moscow";
        } else {
            this.arrivalStation = arrivalStation;
        }
    }

    public int getNumberOfCarriages() {
        return numberOfCarriages;
    }

    public void setNumberOfCarriages(int numberOfCarriages) {
        if (numberOfCarriages < 0) {
            this.numberOfCarriages = Math.abs(numberOfCarriages);
        } else if (numberOfCarriages == 0||numberOfCarriages>50) {
            this.numberOfCarriages = 5;
        } else {
            this.numberOfCarriages = numberOfCarriages;
        }
    }

    @Override
    public String toString() {
        return super.toString()+". Price - "+cost+"rub. Travel time - "+timeOfTravelling+"hours. Departure station - "+
                departureStation+". Arrival station - "+arrivalStation+". Number of coaches - "+numberOfCarriages;
    }

    @Override
    public void refill() {
        System.out.println("Я хз как эта штука заправляется, платить тоже вроде не надо");
    }
}
