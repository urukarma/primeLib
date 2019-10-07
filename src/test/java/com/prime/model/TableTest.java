package com.prime.model;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TableTest {

    Table expectedTable, actualTable;

    @Before
    public void setup() {
        List<Long> list = new ArrayList<Long>(Arrays.asList(2L, 3L, 5L));
        expectedTable = new Table(3);
        actualTable = new Table(3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                actualTable.setElement(i, j, list.get(i) + list.get(j));
                expectedTable.setElement(i, j, list.get(i) + list.get(j));
            }
        }
    }

    @Test
    public void equalsTest() {
        assertFalse(expectedTable.equals(null));
        assertFalse(expectedTable.equals(new Table(3)));
        assertFalse(expectedTable.equals(new Table(2)));
        assertEquals(actualTable, expectedTable);
    }
}
