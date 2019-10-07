package com.prime.algorithm;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doCallRealMethod;

@RunWith(MockitoJUnitRunner.class)
public class PrimeNumberGeneratorTest {

    @Mock
    PrimeNumberGenerator primeNumberGenerator;

    @Before
    public void setup() {
        doCallRealMethod().when(primeNumberGenerator).getFirstNPrimes(anyInt());
    }

    @Test
    public void getPrimesWithinHundredTest() {
        List<Long> list = primeNumberGenerator.getFirstNPrimes(25);
        assertEquals(25, list.size());
        assertEquals((Long) 2L, list.get(0));
        assertEquals((Long) 97L, list.get(list.size() - 1));
    }

    @Test
    public void getPrimesWithinThousandTest() {
        List<Long> list = primeNumberGenerator.getFirstNPrimes(168);
        assertEquals(168, list.size());
        assertEquals((Long) 2L, list.get(0));
        assertEquals((Long) 997L, list.get(list.size() - 1));
    }

}
