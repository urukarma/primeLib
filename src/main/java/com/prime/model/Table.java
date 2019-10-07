package com.prime.model;

import java.io.PrintWriter;

/**
 * This is a data structure used to store the generated primes in form of table.
 */
public class Table {

    private long[][] matrix;
    private int size;
    private final String SPACE = " ";

    public Table(int size) {
        this.size = size;
        matrix = new long[size][size];
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Table table = (Table) o;
        if (size != table.size) return false;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] != table.matrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Sets the given value for given rowIndex, columnIndex in the table.
     *
     * @param rowIndex
     * @param columnIndex
     * @param value
     */
    public void setElement(int rowIndex, int columnIndex, long value) {
        matrix[rowIndex][columnIndex] = value;
    }

    /**
     * Writes the stored matrix in form of a table for given printWriter object. This could be standard output/file.
     *
     * @param printWriter
     */
    public void writer(PrintWriter printWriter) {
        for (int rowIndex = 0; rowIndex < size; rowIndex++) {
            for (int columnIndex = 0; columnIndex < size; columnIndex++) {
                printWriter.print(matrix[rowIndex][columnIndex] + SPACE);
            }
            printWriter.println();
        }
    }
}
