package by.epam.javatraining.artsem.maintask01.model;

import org.apache.log4j.Logger;

public class SortingAlgorithms {

    private static final Logger LOGGER = Logger.getLogger(VectorLogic.class);

    //BigO of bubbleSort is O(n^2)

    public static void bubbleUpSort(int[] array) {

        LOGGER.info("Bubblu sort UP");

        if (array.length == 0) {
            LOGGER.warn("Incorrect array length");
            return;
        }

       /* boolean isSorted = false;
        int length = array.length;

        while (!isSorted) {
            isSorted = true;
            for (int j = 1; j < length; j++) {
                if (array[j] < array[j - 1]) {
                    isSorted = false;
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
            length--;
        }*/

        for (int i = array.length - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }

    public static void bubbleDownSort(int[] array) {

        boolean isSorted = false;

        int length = array.length;
        while (!isSorted) {
            isSorted = true;
            for (int j = 1; j < length; j++) {
                if (array[j] > array[j - 1]) {
                    isSorted = false;
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
            length--;
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


}
