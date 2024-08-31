package ru.otus.java.basic.safarov.homework11;

import java.util.*;

public class PersonDataBase {
    private final Map<Long, Person> persons;
    private final Set<Position> managerPositions = new HashSet<>(List.of( Position.MANAGER, Position.DIRECTOR,
            Position.BRANCH_DIRECTOR, Position.SENIOR_MANAGER));

    public PersonDataBase() {
        persons = new HashMap<>();
    }

    public Person findById(Long id){
        return persons.get(id);
    }

    public void add(Person person){
        persons.put(person.getId(), person);
    }

    public boolean isManager(Person person){
        return managerPositions.contains(person.getPosition());
    }

    public boolean isEmployee(Long id){
        return !isManager(findById(id));
    }
}
