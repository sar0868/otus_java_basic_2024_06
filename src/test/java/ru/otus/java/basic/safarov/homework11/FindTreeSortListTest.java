package ru.otus.java.basic.safarov.homework11;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindTreeSortListTest {
    List<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 1));
    FindTreeSortList findTreeSortList = new FindTreeSortList(list);

    @Test
    void find() {
        assertEquals(4, findTreeSortList.find(4));
    }

    @Test
    void findError() {
        assertNull(findTreeSortList.find(3));
    }

    @Test
    void getSortedList() {
        assertEquals(List.of(1, 2, 4), findTreeSortList.getSortedList());
    }
}