package com.prime.algorithm;

import com.prime.model.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * This class is responsible for generating the table.
 */
@Component
public class PrimeMatrixGenerator {

    @Autowired
    private PrimeNumberGenerator primeNumberGenerator;

    /**
     * @param n
     * @return This returns a table where cell (a,b) is a sum of a-th and b-th prime number
     * example if n is 2 it returns the below table.
     * 4 5
     * 5 6
     */
    public Table generatePrimeMatrix(int n) {

        List<Long> primes = primeNumberGenerator.getFirstNPrimes(n);
        Table table = new Table(n);
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                table.setElement(row, col, primes.get(row) + primes.get(col));
            }
        }
        return table;
    }
}
