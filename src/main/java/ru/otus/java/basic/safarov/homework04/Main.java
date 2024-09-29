package ru.otus.java.basic.safarov.homework04;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        User[] users = new User[10];

        for (int i = 0; i < users.length; i++) {
            String surname = "surname" + i;
            String name = "name" + i;
            String patronymic = "patronymic" + i;
            int year = (int) ((Math.random() * (2024 - 1950)) + 1950);
            String email = "example" + i + "@mail.com";
            users[i] = new User(surname, name, patronymic, year, email);
        }
        LocalDate date = LocalDate.now(); // получаем текущую дату
        int currentYear = date.getYear();
        for (User user: users){
            if (currentYear - user.getYear() > 40){
                System.out.println(user);
            }
        }
    }
}
