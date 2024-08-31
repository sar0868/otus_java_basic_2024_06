package ru.otus.java.basic.safarov.homework04;

public class User {
    private String surname;
    private String name;
    private String patronymic;
    private int year;
    private String email;

    public User(String surname, String name, String patronymic, int year, String email) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.year = year;
        this.email = email;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "ФИО: " + surname + ' ' +
                name + ' ' +
                patronymic + '\n' +
                "Год рождения: " + year + '\n' +
                "e-mail: " + email;
    }
}