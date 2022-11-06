import Lesson3_Inheritance.transport.Bus;
import Lesson3_Inheritance.transport.Car;
import Lesson3_Inheritance.transport.Car.Key;
//import Lesson1_Object.Human;
import Lesson2_Incapsulation.Flower;
import Lesson3_Inheritance.transport.Train;
import Lesson3_Inheritance.transport.Transport;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        Human maxim = new Human("Максим",-1988, "Минск", "бренд-менеджер");
//        Human ann = new Human("Аня", 1993, "Москва", "методист образовательных программ");
//        Human kat = new Human("Катя", 1992, null, "продакт менеджер");
//        Human arti = new Human(null, 1995, "Москва","директор по развитию бизнеса");
//        Human vova = new Human("Владимир", "Казань", "безработный", 21);
//        maxim.setTown("");
//        ann.setYearOfBirth(-1988);
//        System.out.println(vova);
//        System.out.println(maxim);
//        System.out.println(ann);
//        System.out.println(kat);
//        System.out.println(arti);
//        // FLOWERS
//        Flower rosa = new Flower("Роза", null, "Голландия", 35.59);
//        Flower hriz = new Flower("Хризантема", null, null, 15, 5);
//        Flower pion = new Flower("Пион", null, "Англия", 69.9, 1);
//        Flower hypso = new Flower("Гипсофила", null, "Турция", 19.5, 10);
//        System.out.println(rosa);
//        System.out.println(hriz);
//        System.out.println(pion);
//        System.out.println(hypso);
//        flowersCost(rosa, hriz,pion,hypso);
//    public static void flowersCost(Flower... flowers) {
//        double totalCost = 0;
//        for (Flower flower:flowers) {
//            totalCost += flower.getCost();
//        }
//        totalCost = totalCost * 1.1;
//        System.out.println("Стоимость букета = "+totalCost+" руб.");
//    }
//        System.out.println(vaz.checkRegNumber());
//        System.out.println(vazRemote.getRemoteAccess());
//        kia.new Insurance(LocalDate.now(), 1234.00, "26783948586");
//        System.out.println(kia);
//        kia.getInsurance().checkInsurance();
        Car vaz = new Car("Автоваз", "Гранта", 2016, "Россия", "белый",
                180, 1.5, "Мкпп", "баклажан", "Х123АЧ123",
                5, "летние");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2021, "Germany",
                "black", 320, 3.0, "DSG", "sedan",
                "A777АA777", 5, "летние");
        Car bmw = new Car("BMW", "Z1", 2021, "Germany",
                "black", 320, 3.0, "Auto", "Cabrio",
                "X666XX666", 2, "летние");
        Car kia = new Car("KIA", "Sportage", 2019, "South Korea",
                "silver", 230, 2.0, "Auto", "Crossover",
                "X6XX666", 5, "зимние");
        Car hyundai = new Car("Hyundai", "Avante", 2019, "South Korea",
                "white", 200, 1.6, "Auto", "sedan",
                "X678XX678", 5, "зимние");
        Key vazRemote = vaz.new Key("Без удаленного запуска", "Ключевой доступ");
        Key audiRemote = audi.new Key("Удаленный запуск", "Бесключевой доступ");
        Key bmwRemote = bmw.new Key("Удаленный запуск", "Бесключевой доступ");
        Key kiaRemote = kia.new Key("Удаленный запуск", "Ключевой доступ");
        Key hyundaiRemote = hyundai.new Key("Удаленный запуск", "Ключевой доступ");
        Train wowo = new Train("Ласточка", "В-901", 2011, "Россия", "", 301,
                3500, 0, "Белорусский вокзал, Москва",
                "Минск пассажирский, Минск", 11);
        Train chuhchuh = new Train("Ленинград", "D-125", 2019, "Россия", "",
                270, 1700, 0, "Ленинградский вокзал, Москва",
                "Ленинград пассажирский, Санкт-петербург", 8);
        Bus schoolBus = new Bus("Пазик", "Ауф", 1862, "Российская империя",
                "ЧРНБРПШКРБН", 18_000_000);
        Bus fromOneToAnotherSideOfTheCity = new Bus("Газель", "НЕ ДЛЯ ВЫСОКИХ ЛЮДЕЙ", 1990,
                "СССР","желтый",220);
        Bus toUkraine = new Bus("Z", "НЕ ДЛЯ УМНЫХ ЛЮДЕЙ", 2022, "Раша", "something weird", 10);

        System.out.println(vaz);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        System.out.println(audi.checkRegNumber());
        audi.getInsurance().checkInsurance();
        System.out.println(hyundai.getKey().getRemoteAccess());
        System.out.println(wowo);
        System.out.println(chuhchuh);
        System.out.println(schoolBus);
        System.out.println(fromOneToAnotherSideOfTheCity);
        System.out.println(toUkraine);
        vaz.setFuel("petrol");
        System.out.println(vaz.getFuel());
        wowo.refill();
        chuhchuh.getFuel();
    }

}