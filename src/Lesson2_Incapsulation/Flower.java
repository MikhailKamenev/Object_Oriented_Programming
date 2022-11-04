package Lesson2_Incapsulation;

public class Flower {
    String name;
    private String flowerColour;
    private String country;
    private double cost;
    int lifeSpan;

    public Flower(String name, String flowerColour, String country, double cost, int lifeSpan) {
        this.name = name;
        this.flowerColour = flowerColour;
        if (flowerColour == null||flowerColour.isEmpty()||flowerColour.isBlank()) {
            this.flowerColour = "белый";
        } else {
            this.flowerColour = flowerColour;
        }
        this.country = country;
        if (country == null || country.isBlank() || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        this.cost = cost;
        if (cost <= 0) {
            this.cost = 1.00;
        } else {
            this.cost = cost;
        }
        this.lifeSpan = lifeSpan;
        if (lifeSpan < 0) {
            this.lifeSpan = Math.abs(lifeSpan);
        }
    }

    public Flower(String name, String flowerColour, String country, double cost) {
        this(name, flowerColour, country, cost, 3);
    }

    public String getFlowerColour() {
        return flowerColour;
    }

    public void setFlowerColour(String flowerColour) {
        if (flowerColour == null||flowerColour.isEmpty()||flowerColour.isBlank()) {
            this.flowerColour = "белый";
        } else {
            this.flowerColour = flowerColour;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isBlank() || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1.00;
        } else {
            this.cost = cost;
        }
    }

    @Override
    public String toString() {
        return "Название " + name + ", цвет - " + flowerColour + ". Страна происхождения - " + country+
                ". Стоимость - " + cost +" руб/шт."+ " Время стояния - " + lifeSpan +" суток.";
    }
}
