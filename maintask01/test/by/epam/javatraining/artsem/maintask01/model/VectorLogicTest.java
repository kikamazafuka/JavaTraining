package by.epam.javatraining.artsem.maintask01.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class VectorLogicTest {

    @Test
    public void findMax() {

        int [] arr = new int[]{1,2,4,52,3};
        int expected = 52;
        assertEquals(expected, VectorLogic.findMax(arr));
    }

    @Test
    public void findMin() {

        int [] arr = new int[]{1,2,4,52,3};
        int expected = 1;
        assertEquals(expected, VectorLogic.findMin(arr));
    }

    @Test
    public void findArithMean() {

        double [] arr = new double[]{1,2,3};
        double expected = 2d;
        double delta = 0.1;
        assertEquals(expected, VectorLogic.findArithMean(arr),delta);
    }

    @Test
    public void findGeomMean() {
    }

    @Test
    public void isUpSort() {
    }

    @Test
    public void isDownSort() {
    }

    @Test
    public void findLocMax() {
    }

    @Test
    public void findLocMin() {
    }

    @Test
    public void linearSearch() {
    }

    @Test
    public void binarySearch() {
    }

    @Test
    public void reverse() {
    }

    @Test
    public void bubbleUpSort() {
    }

    @Test
    public void bubbleDownSort() {
    }

    @Test
    public void insertionSort() {
    }

    @Test
    public void selectionSort() {
    }
}