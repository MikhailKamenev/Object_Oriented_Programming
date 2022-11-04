import Lesson2_Incapsulation.transport.Car;
import Lesson2_Incapsulation.transport.Car.Key;
import Lesson1_Object.Human;
import Lesson2_Incapsulation.Flower;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Максим",-1988, "Минск", "бренд-менеджер");
        Human ann = new Human("Аня", 1993, "Москва", "методист образовательных программ");
        Human kat = new Human("Катя", 1992, null, "продакт менеджер");
        Human arti = new Human(null, 1995, "Москва","директор по развитию бизнеса");
        Human vova = new Human("Владимир", "Казань", "безработный", 21);
        maxim.setTown("");
        ann.setYearOfBirth(-1988);
        System.out.println(vova);
        System.out.println(maxim);
        System.out.println(ann);
        System.out.println(kat);
        System.out.println(arti);
        Car vaz = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия", "механика", "седан", "У123Р4560", 5, "летние");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "автомат", "седан", "А777А777", 4, "летние");
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия", "автмат", "купе", "Х333Х333", 2, "летние");
        Car kia = new Car("Kia", "Sportage", 2.4, "красный", 2018, "Южная Корея", "робот", "кроссовер", "В432М543", 5, "зимние");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "механика", "седан", "С556С556", 5, "зимние");
        System.out.println(vaz);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        System.out.println(vaz.checkRegNumber());
        // FLOWERS
        Flower rosa = new Flower("Роза", null, "Голландия", 35.59);
        Flower hriz = new Flower("Хризантема", null, null, 15, 5);
        Flower pion = new Flower("Пион", null, "Англия", 69.9, 1);
        Flower hypso = new Flower("Гипсофила", null, "Турция", 19.5, 10);
        System.out.println(rosa);
        System.out.println(hriz);
        System.out.println(pion);
        System.out.println(hypso);
        flowersCost(rosa, hriz,pion,hypso);
        Key vazRemote = vaz.new Key("Без удаленного запуска", "Ключевой доступ");
        Key audiRemote = audi.new Key("Удаленный запуск", "Бесключевой доступ");
        Key bmwRemote = bmw.new Key("Удаленный запуск", "Бесключевой доступ");
        Key kiaRemote = kia.new Key("Удаленный запуск", "Ключевой доступ");
        Key hyundaiRemote = hyundai.new Key("Удаленный запуск", "Ключевой доступ");
        System.out.println(vazRemote.getRemoteAccess());
        kia.new Insurance(LocalDate.now(), 1234.00, "26783948586");
        System.out.println(kia);
        kia.getInsurance().checkInsurance();
    }

    public static void flowersCost(Flower... flowers) {
        double totalCost = 0;
        for (Flower flower:flowers) {
            totalCost += flower.getCost();
        }
        totalCost = totalCost * 1.1;
        System.out.println("Стоимость букета = "+totalCost+" руб.");
    }
}