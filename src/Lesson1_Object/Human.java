package Lesson1_Object;

import java.time.LocalDate;

public class Human {
    String name;
    private int yearOfBirth;
    private String town;
    String jobTitle;
    int age;

    public Human(String name, String town, String jobTitle, int age) {
        this.name = name;
        this.town = town;
        this.jobTitle = jobTitle;
        this.age = age;
        if (age >= 0) {
            this.yearOfBirth = LocalDate.now().getYear() - age;
        } else {
            this.yearOfBirth = LocalDate.now().getYear() - Math.abs(age);
        }
    }

    public Human(String name, int yearOfBirth, String town, String jobTitle) {
        this.name = name;
        if (name == null) {
            this.name = "Информация не указана";
        }
        this.yearOfBirth = yearOfBirth;
        this.town = town;
        this.jobTitle = jobTitle;
        if (jobTitle == null) {
            this.jobTitle = "Информация не указана";
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth>=0){
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
    }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
            if (town == null ||town.isEmpty()||town.isBlank()) {
                this.town = "Информация не указана";
            }else {
                this.town = town;
            }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут: " + name + ". Я из города: " + getTown() +
                ". Я родился в " + getYearOfBirth() + " году. Я работаю на позиции '"+jobTitle+"'. Будем знакомы!";
    }
}
