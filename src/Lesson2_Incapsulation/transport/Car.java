package Lesson2_Incapsulation.transport;

import java.time.LocalDate;
import java.util.Date;

public class Car {
    public class Insurance{
        private final LocalDate expirationDate;
        private final double cost;
        private final String number;

        public Insurance() {
            this(LocalDate.now(), 5500.00, "123456789");
        }

        public Insurance(LocalDate expirationDate, double cost, String number) {
            if (expirationDate == null) {
                this.expirationDate = LocalDate.now();
            } else {
                this.expirationDate = expirationDate;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else{
                this.number = number;}
        }

        public LocalDate getExpirationDate() {
            return expirationDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }
        public void checkInsurance() {
            if (expirationDate.isBefore(LocalDate.now()) || expirationDate.isEqual(LocalDate.now())) {
                System.out.println("Срочно обновите страховой полис");
            } else {
                System.out.println("Страховой полис действителен");}
            if (registrationNumber.length() != 9) {
                System.out.println("Регистрационный номер страхового полиса неверный");
            } else {
                System.out.println("Регистрационный номер страхового полиса в порядке");
            }
        }
    }
    public class Key{
        private String remoteAccess;
        private String keyLess;

        public Key() {
            this("без автозапуска", "ключевой доступ");
        }

        public Key(String remoteAccess, String keyLess) {
            this.remoteAccess = remoteAccess;
            this.keyLess = keyLess;
        }

        public String getRemoteAccess() {
            return remoteAccess;
        }

        public void setRemoteAccess(String remoteAccess) {
            if (remoteAccess == null || remoteAccess.isEmpty() || remoteAccess.isBlank()) {
                this.remoteAccess = "Информация не указана";
            } else {
                this.remoteAccess = remoteAccess;
            }
        }

        public String getKeyLess() {
            return keyLess;
        }

        public void setKeyLess(String keyLess) {
            if (keyLess == null || keyLess.isBlank() || keyLess.isEmpty()) {
                this.keyLess = "Информация не указана";
            } else {
                this.keyLess = keyLess;
            }
        }
    }
    private String brand;
    private String model;
    public double engineCapacity;
    public String colour;
    private int year;
    private  String country;
    public String gearBox;
    private String body;
    public String registrationNumber;
    private int seats;
    public boolean winterTires;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, double engineCapacity, String colour, int year, String country,
               String gearBox, String body, String registrationNumber, int seats, String tires) {
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
        this.gearBox = gearBox;
        if (gearBox == null) {
            this.gearBox = "manual transmission";
        }
        this.body = body;
        if (body == null) {
            this.body = "default";
        }
        this.registrationNumber = registrationNumber;
        if (registrationNumber == null) {
            this.registrationNumber = "X000X000";
        }
        this.winterTires = true;
        if (tires == null) {
            this.winterTires = true;
        }
        if (key == null) {
            this.key = new Key();
        }
        else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public String getColour() {
        return colour;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getGearBox() {
        return gearBox;
    }

    public String getBody() {
        return body;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getSeats() {
        return seats;
    }

    public boolean getTires() {
        return winterTires;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setGearBox(String gearBox) {
        if (gearBox == null) {
            this.gearBox = "manual transmission";
        } else {
            this.gearBox = gearBox;
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setTires(String tires) {
        this.winterTires = winterTires;
    }

    public void changeTires(){
        winterTires=!winterTires;
    }

    public boolean checkRegNumber() {
        if (registrationNumber.length() != 8) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) && !Character.isAlphabetic(chars[4])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) && !Character.isDigit(chars[2]) && !Character.isDigit(chars[3]) &&
                !Character.isDigit(chars[5]) && !Character.isDigit(chars[6]) && !Character.isDigit(chars[7])) {
            return false;
        }
        return true;
    }
    public Key getKey() {
        return key;
    }
    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + year + " год выпуска, производство - " + country +
                ", цвет - " + colour + ", объем двигателя = " + engineCapacity + "литра." +
                "коробка передач - " + getGearBox() + ". Тип кузова - " + getBody() + ". Регистрационный номер - " +
                getRegistrationNumber() + ". Количество мест - " + getSeats() + ". Тип шин - " +
                (getTires() ? "летние" : "зимние") +"Страховой полис действителен до: " +getInsurance().getExpirationDate()+
                ". Номер страхового полиса - "+getInsurance().getNumber()+
                ". Стоимость страхового полиса - "+getInsurance().getCost()+" руб. "+
                "Запуск: "+getKey().getRemoteAccess()+". Доступ в автомобиль - "+
                getKey().getKeyLess()+".";
    }


}
