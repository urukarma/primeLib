package com.prime;

import com.prime.algorithm.PrimeMatrixGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ConsoleApplicationTest {

    @Mock
    private PrimeMatrixGenerator primeMatrixGenerator;

    @InjectMocks
    ConsoleApplication consoleApplication;

    @Test(expected = RuntimeException.class)
    public void testForInvalidInput() throws Exception {
        String[] args = {"1.2"};
        consoleApplication.run(args);
    }

    @Test(expected = RuntimeException.class)
    public void testForNegetiveNumber() throws Exception {
        String[] args = {"-3"};
        consoleApplication.run(args);
    }
}
