package ru.otus.java.basic.safarov.homework09;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class MainTest {

    @Test
    void listRange() {
        int min = 2;
        int max = 5;
        List<Integer> list = List.of(2, 3, 4, 5);
        assertEquals(list, Main.listRange(min, max));
    }

    @Test
    void sumItemGtFive() {
        List<Integer> list = List.of(4, 5, 6);
        assertEquals(6, Main.sumItemGtFive(list));
    }

    @Test
    void fillListValue() {
        int value = 2;
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        Main.fillListValue(list, value);
        assertEquals(new ArrayList<>(Arrays.asList(2, 2, 2)), list);
    }

    @Test
    void increaseList(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        int value = 1;
        Main.increaseList(list, value);
        assertEquals(new ArrayList<>(Arrays.asList(2, 3, 4)), list);
    }

    @Test
    void getNameEmployees(){
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            employees.add(new Employee("name" + (i+1), (int)((Math.random() * (65-18)) + 18 )));
        }
        List<String> list = List.of("name1", "name2", "name3");
        assertEquals(list, Main.getNameEmployees(employees));
    }

    @Test
    void getEmployeesOld(){
        List<Employee> employees = new ArrayList<>();
        int[] ages = {18, 20, 21};
        int minAge = 20;
        for (int i = 0; i < 3; i++) {
            employees.add(new Employee("name" + (i+1), ages[i]));
        }
        List<Employee> result = Main.getEmployeesOld(employees, minAge);
        assertEquals(2, result.size());
        assertEquals(21, result.get(1).getAge());
        assertEquals(20, result.get(0).getAge());
    }

    @Test
    void isAboveAvgAgeTrue(){
        List<Employee> employees = new ArrayList<>();
        int[] ages = {19, 20, 21};
        int minAvgAge = 19;
        for (int i = 0; i < 3; i++) {
            employees.add(new Employee("name" + (i+1), ages[i]));
        }
        assertTrue(Main.isAboveAvgAge(employees, minAvgAge));
    }

    @Test
    void isAboveAvgAgeFalse(){
        List<Employee> employees = new ArrayList<>();
        int[] ages = {19, 20, 21};
        int minAvgAge = 20;
        for (int i = 0; i < 3; i++) {
            employees.add(new Employee("name" + (i+1), ages[i]));
        }
        assertFalse(Main.isAboveAvgAge(employees, minAvgAge));
    }

    @Test
    void getYoungEmployee(){
        List<Employee> employees = new ArrayList<>();
        int[] ages = {19, 20, 21};
        for (int i = 0; i < 3; i++) {
            employees.add(new Employee("name" + (i+1), ages[i]));
        }
        assertEquals(employees.get(0), Main.getYoungEmployee(employees));
    }
}