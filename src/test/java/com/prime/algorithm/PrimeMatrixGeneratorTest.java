package com.prime.algorithm;

import com.prime.model.Table;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PrimeMatrixGeneratorTest {

    @Mock
    PrimeNumberGenerator primeNumberGenerator;

    @InjectMocks
    PrimeMatrixGenerator primeMatrixGenerator;

    @Before
    public void setup() {
    }

    @Test
    public void generatePrimeMatrixTest() {
        List<Long> list = new ArrayList<Long>(Arrays.asList(2L, 3L, 5L));
        when(primeNumberGenerator.getFirstNPrimes(3)).thenReturn(list);
        Table table = primeMatrixGenerator.generatePrimeMatrix(3);
        Table expectedTable = new Table(3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                expectedTable.setElement(i, j, list.get(i) + list.get(j));
            }
        }
        assertTrue(table.equals(expectedTable));
    }
}