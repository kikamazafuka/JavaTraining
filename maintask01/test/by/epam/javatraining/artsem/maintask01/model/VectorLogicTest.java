/**
 * Test Class of VectorLogic class
 *
 * @author Artur Semenas
 * @see#VectorLogic class
 */
package by.epam.javatraining.artsem.maintask01.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class VectorLogicTest {

    @Test
    public void findMax() {

        int[] arr = new int[]{1, 2, 4, 52, 3};
        int expected = 52;
        assertEquals(expected, VectorLogic.findMax(arr));
    }

    @Test
    public void findMin() {

        int[] arr = new int[]{1, 2, 4, 52, 3};
        int expected = 1;
        assertEquals(expected, VectorLogic.findMin(arr));
    }

    @Test
    public void findArithMean() {

        double[] arr = new double[]{1, 2, 3};
        double expected = 2d;
        double delta = 0.1;
        assertEquals(expected, VectorLogic.findArithMean(arr), delta);
    }

    @Test
    public void findGeomMean() {

        double[] arr = new double[]{1, 2, 3};
        double expected = 1.9;
        double delta = 1;
        assertEquals(expected, VectorLogic.findArithMean(arr), delta);
    }

    @Test
    public void isUpSort() {
        int[] arr = new int[]{4, 1, 2, 3};
        boolean expected = false;
        assertEquals(expected, VectorLogic.isUpSort(arr));
    }

    @Test
    public void isDownSort() {

        int[] arr = new int[]{4, 3, 2, 1};
        boolean expected = true;
        assertEquals(expected, VectorLogic.isDownSort(arr));
    }

    @Test
    public void findLocMaxPos() {

        int[] arr = new int[]{0, 3, 2, 1};
        int expected = 1;
        assertEquals(expected, VectorLogic.findLocMaxPos(arr));
    }

    @Test
    public void findLocMin() {

        int[] arr = new int[]{2, 3, 0, 1};
        int expected = 2;
        assertEquals(expected, VectorLogic.findLocMinPos(arr));
    }

    @Test
    public void linearSearch() {
        
        int[] array = new int[]{1, 7, 9, 25, 2, 19};
        int valueToSearch = 7;
        int expectedPosition = 1;
        assertEquals(expectedPosition, VectorLogic.linearSearch(array, valueToSearch));
    }

    @Test
    public void binarySearch() {

        int[] array = new int[]{1, 7, 9, 25, 2, 19};
        int valueToSearch = 1;
        int expectedPosition = 0;
        assertEquals(expectedPosition, VectorLogic.binarySearch(array, valueToSearch));
    }

    @Test
    public void reverse() {

        int[] arr = new int[]{3, 2, 1};
        int[] expected = new int[]{1, 2, 3};
        VectorLogic.reverse(arr);
        assertArrayEquals(expected, arr);

    }

    @Test
    public void bubbleUpSort() {

        int[] arr = new int[]{3, 2, 1};
        int[] expected = new int[]{1, 2, 3};
        VectorLogic.bubbleUpSort(arr);
        assertArrayEquals(expected, arr);

    }

    @Test
    public void bubbleDownSort() {

        int[] arr = new int[]{3, 1, 2};
        int[] expected = new int[]{3, 2, 1};
        VectorLogic.bubbleDownSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void insertionSort() {

        int[] arr = new int[]{3, 2, 1};
        int[] expected = new int[]{1, 2, 3};
        VectorLogic.insertionSort(arr);
        assertArrayEquals(expected, arr);

    }

    @Test
    public void selectionSort() {

        int[] arr = new int[]{3, 2, 1};
        int[] expected = new int[]{1, 2, 3};
        VectorLogic.selectionSort(arr);
        assertArrayEquals(expected, arr);
    }
