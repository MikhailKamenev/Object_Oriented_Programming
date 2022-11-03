import Lesson1_Object.Car;
import Lesson1_Object.Human;

public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Максим",-1988, "Минск", "бренд-менеджер");
        Human ann = new Human("Аня",1993,"Москва", "методист образовательных программ");
        Human kat = new Human("Катя", 1992, null, "продакт менеджер");
        Human arti = new Human(null, 1995, "Москва","директор по развитию бизнеса");
        System.out.println(maxim);
        System.out.println(ann);
        System.out.println(kat);
        System.out.println(arti);
        Car vaz = new Car("Lada","Granta",1.7, "желтый",2015,"Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage", 2.4, "красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        System.out.println(vaz);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}