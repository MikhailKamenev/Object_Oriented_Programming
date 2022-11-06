package Lesson3_Inheritance.transport;

public class Bus extends Transport {
    private String fuel;
    public Bus(String brand, String model, int year, String country, String bodyColour, int maxSpeed) {
        super(brand, model, year, country, bodyColour, maxSpeed);
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

    @Override
    public void refill() {
        System.out.println("Подъехать к заправочной колонке так, чтобы лючок бензобака " +
                "был с той же стороны что и заправочный шланг");
        System.out.println("Выберите тип топлива "+fuel+".");
        System.out.println("Оплатите необходимое количество топлива. Дождитесь завершения процесса заправки.");
        System.out.println("Извлеките заправочный шланг из горловины");
    }
}
