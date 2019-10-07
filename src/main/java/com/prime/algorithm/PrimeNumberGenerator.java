package com.prime.algorithm;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is responsible for generating primes.
 */
@Component
public class PrimeNumberGenerator {

    /**
     * @param numberOfPrimes number of prime numbers to be generated.
     * @return A List which contains the list of first numberOfPrimes prime numbers.
     */
    public List<Long> getFirstNPrimes(int numberOfPrimes) {

        ArrayList listOfPrimes = new ArrayList<Long>();

        long number = 2;
        for (int count = 0; count < numberOfPrimes; ) {
            if (checkIfPrime(number)) {
                count += 1;
                listOfPrimes.add(number);
            }
            number += 1;
        }
        return listOfPrimes;
    }

    private boolean checkIfPrime(long number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
