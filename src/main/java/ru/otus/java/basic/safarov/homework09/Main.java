package ru.otus.java.basic.safarov.homework09;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    }

    public static List<Integer> listRange(int min, int max) {
        List<Integer> result = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            result.add(i);
        }
        return result;
    }

    public static int sumItemGtFive(List<Integer> list) {
        int sum = 0;
        for (int item : list) {
            if (item > 5) {
                sum += item;
            }
        }
        return sum;
    }

    public static void fillListValue(List<Integer> list, int value){
        for (int i = 0; i < list.size(); i++) {
            list.set(i, value);
        }
    }

    public static void increaseList(List<Integer> list, int value) {
//        list.replaceAll(el -> el + value);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + value);
        }
    }

    public static List<String> getNameEmployees(List<Employee> employees) {
        List<String> names = new ArrayList<>();
        for(Employee employee: employees){
            names.add(employee.getName());
        }
        return names;
    }

    public static List<Employee> getEmployeesOld(
            List<Employee> employees, int minAge){
        List<Employee> result = new ArrayList<>();
        for (Employee employee: employees){
            if (employee.getAge() >= minAge){
                result.add(employee);
            }
        }
        return result;
    }

    public static boolean isAboveAvgAge(
            List<Employee> employees, int minAvg){
        int sumAge = 0;
        for (Employee employee: employees){
            sumAge += employee.getAge();
        }
        return (sumAge / employees.size()) > minAvg;
    }
    
    public static Employee getYoungEmployee(
            List<Employee> employees){
        Employee result = null;
        int minAge = -1;
        for (Employee employee: employees){
            if (minAge == -1){
                result = employee;
                minAge = employee.getAge();
                continue;
            }
            if (employee.getAge() < minAge){
                result = employee;
                minAge = employee.getAge();
            }
                
        }
        return result;
    }

}
