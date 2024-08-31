# Java Developer. Basic

_Сафаров Алексей Расимович_  
email: <safarov-ar@yandex.ru>  
г.Тверь

## Homework 11

1. Part 1.  
   Даны класс Person и enum Position
   ```java
      public class Person {
      String name;
      Position position;
      Long id;
      }
   
   public enum Position {
      MANAGER, DIRECTOR, DRIVER, ENGINEER, SENIOR_MANAGER, DEVELOPER, QA,
      JANITOR, PLUMBER, BRANCH_DIRECTOR, JUNIOR_DEVELOPER
   }
   ```
   Реализуйте класс PersonDataBase, содержащий список Person, и имеющий методы,  
   со следующей асимптотической сложностью (методы и конструктор класса Person  
   реализовать самостоятельно):
   - Person findById(Long id) - найти Person по id - O(1)
   - void add(Person person) - добавить Person - O(1)
   - isManager(Person person) - O(1) - true если Position : MANAGER, DIRECTOR,  
    BRANCH_DIRECTOR или SENIOR_MANAGER
   - isEmployee(Long id) - O(1) - true если Employee имеет любой другой Position



2. Part 2   
   1. Из Предварительно отсортированного списка (List) сформировать  
      двоичное дерево поиска.
   2. Написать рекурсивную функцию поиска в сформированном дереве
   3. Класс должен имплементировать следующий интерфейс

      ```java
      public interface SearchTree {
      /**
      @param element to find
      @return element if exists, otherwise - null
      */
      T find(T element);
      List getSortedList();
      }
      ```

deadline: 26.08.2024  
start: 23.08.2024  
completed: 30.08.2024  
