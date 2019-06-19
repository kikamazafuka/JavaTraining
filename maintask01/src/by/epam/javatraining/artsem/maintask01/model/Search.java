package by.epam.javatraining.artsem.maintask01.model;

import org.apache.log4j.Logger;

import static by.epam.javatraining.artsem.maintask01.model.VectorLogic.bubbleUpSort;

public class Search {

    private static final Logger LOGGER = Logger.getLogger(VectorLogic.class);

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

        LOGGER.info("Binary search");

        if (array.length == 0) {
            LOGGER.warn("Incorrect array length");
            return -1;
        }

        bubbleUpSort(array);

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

}
