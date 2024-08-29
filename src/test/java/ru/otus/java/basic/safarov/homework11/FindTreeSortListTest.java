package ru.otus.java.basic.safarov.homework11;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindTreeSortListTest {
    List<Integer> list = new ArrayList<>(Arrays.asList(8, 7, 6, 5, 10, 1, 9));
    FindTreeSortList<Integer> findTreeSortList = new FindTreeSortList<>(list);

    @Test
    void find() {
        assertEquals(6, findTreeSortList.find(6));
    }

    @Test
    void findError() {
        assertNull(findTreeSortList.find(3));
    }

    @Test
    void getSortedList() {
        assertEquals(List.of(1, 5, 6, 7, 8, 9, 10), findTreeSortList.getSortedList());
    }
}