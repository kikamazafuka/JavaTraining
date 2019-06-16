/**
 * Main task 01 v.1.0 by Artur Semenas 09.06.2019
 *
 * @author Artur Semenas
 * @version 1.0
 */

package by.epam.javatraining.artsem.maintask01.model;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class VectorLogic {

    private static final Logger LOGGER = Logger.getLogger(VectorLogic.class);

    public static int findMax(int[] array) {
        PropertyConfigurator.configure("log4j.properties");
        LOGGER.info("find max");

        if (array.length == 0) {
            LOGGER.warn("Incorrect array length");
            return -1;
        }

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            LOGGER.trace("find max" + i);
            if (array[i] > max) {
                max = array[i];

            }
        }
        return max;
    }


    public static int findMin(int[] array) {

        LOGGER.debug("find min");

        if (array.length == 0) {
            return -1;
        }

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double findArithMean(double[] array) {

        if (array.length == 0) {
            return -1;
        }

        double arithMean = 0;

        for (int i = 0; i < array.length; i++) {
            arithMean += array[i];
        }
        return arithMean / array.length;
    }

    public static double findGeomMean(double[] array) {

        if (array.length == 0) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                return -1;
            }
        }

        double geomMean = 1.0;

        for (int i = 0; i < array.length; i++) {
            geomMean *= array[i];
        }
        return Math.pow(geomMean, 1.0 / array.length);
    }

    public static boolean isUpSort(int[] array) {

        if (array.length == 0) {
            return false;
        }

        boolean isUpSort = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isUpSort = false;
                break;
            }
        }
        return isUpSort;
    }

    public static boolean isDownSort(int[] array) {

        if (array.length == 0) {
            return false;
        }

        boolean isDownSort = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                isDownSort = false;
                break;
            }
        }
        return isDownSort;
    }

    //BigO of findMaxPos is O(1)

    public static int findLocMaxPos(int[] array) {

        if (array.length == 0) {
            return -1;
        }

        int locMaxPosition = 0;

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                locMaxPosition = i;
                break;
            } else locMaxPosition = -1;
        }

        return locMaxPosition;
    }

    //BigO of findMinPos is O(1)

    public static int findLocMinPos(int[] array) {

        if (array.length == 0) {
            return -1;
        }

        int locMinPosition = 0;

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < array[i + 1] && array[i] < array[i - 1]) {
                locMinPosition = i;
                break;
            } else locMinPosition = -1;
        }

        return locMinPosition;
    }


    // BigO of linearSearch is O(n)

    public static int linearSearch(int[] array, int elementToSearch) {

        if (array.length == 0) {
            return -1;
        }

        int result = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToSearch) {
                result = i;
            }
        }
        return result;
    }

    // BigO of binarySearch is O(log(n))

    public static int binarySearch(int array[], int elementToSearch) {

        if (array.length == 0) {
            return -1;
        }

        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;

            if (array[middleIndex] == elementToSearch) {
                return middleIndex;
            } else if (array[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            } else if (array[middleIndex] > elementToSearch) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    // BigO of reverse is O(n)

    public static void reverse(int[] array) {

        if (array.length == 0) {
            return;
        }

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

    }

    //BigO of bubbleSort is O(n^2)

    public static void bubbleUpSort(int[] array) {

        if (array.length == 0) {
            return;
        }

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    isSorted = false;
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

    }

    public static void bubbleDownSort(int[] array) {

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int j = 1; j < array.length; j++) {
                if (array[j] > array[j - 1]) {
                    isSorted = false;
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }


    }

    //BigO of insertionSort is O(n^2)

    public static void insertionSort(int[] array) {

        if (array.length == 0) {
            return;
        }

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (min < array[j]) {
                    array[j + 1] = array[j];
                } else break;
            }
            array[j + 1] = min;
        }

    }

    //BigO of selectionSort is O(n^2)

    public static void selectionSort(int[] array) {

        if (array.length == 0) {
            return;
        }

        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[i]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    // BigO of binarySearch is O(log(n))

    public static void quickSort(int[] array, int low, int high) {

        if (array.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

        int middle = low + (high - low) / 2;
        int num = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < num) {
                i++;
            }

            while (array[j] > num) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }


        if (low < j) {
            quickSort(array, low, j);
        }

        if (high > i) {
            quickSort(array, i, high);
        }
    }

}



