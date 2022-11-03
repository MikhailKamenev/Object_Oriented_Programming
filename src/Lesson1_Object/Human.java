package Lesson1_Object;

public class Human {
    String name;
    int yearOfBirth;
    String town;
    String jobTitle;

    public Human(String name, int yearOfBirth, String town, String jobTitle) {
        this.name = name;
        if (name == null) {
            this.name = "Информация не указана";
        }
        if (yearOfBirth>=0){
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        this.town = town;
        if (town == null) {
            this.town = "Информация не указана";
        }
        this.jobTitle = jobTitle;
        if (jobTitle == null) {
            this.jobTitle = "Информация не указана";
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут: " + name + ". Я из города: " + town +
                ". Я родился в " + yearOfBirth + " году. Я работаю на позиции '"+jobTitle+"'. Будем знакомы!";
    }
}
