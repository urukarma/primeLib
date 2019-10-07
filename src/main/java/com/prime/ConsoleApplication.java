package com.prime;

import com.prime.algorithm.PrimeMatrixGenerator;
import com.prime.model.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.OutputStream;
import java.io.PrintWriter;

import static java.lang.System.exit;

/**
 * This class is the starting point of application. Performs sanity check on input and is a orchestrator.
 */
@SpringBootApplication
public class ConsoleApplication implements CommandLineRunner {

    @Autowired
    private PrimeMatrixGenerator primeMatrixGenerator;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ConsoleApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

    @Override
    public void run(String... args) throws Exception {

        String size = null;
        if (args.length > 0) {
            size = args[0];
        }

        try {
            int tableSize = Integer.parseInt(size);
            if (tableSize < 0) {
                throw new RuntimeException("table size must be positive");
            }
            Table table = primeMatrixGenerator.generatePrimeMatrix(tableSize);
            OutputStream outputStream = System.out;
            PrintWriter printWriter = new PrintWriter(outputStream);
            table.writer(printWriter);
            printWriter.close();
        } catch (Exception e) {
            System.out.println(size + " is not an positive integer. This only accepts positive integers");
            throw new RuntimeException(e);
        }
        exit(0);
    }
}