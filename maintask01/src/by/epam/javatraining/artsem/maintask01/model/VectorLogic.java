/** Main task 01 v.1.0 by Artur Semenas 09.06.2019
 *@author Artur Semenas
 * @version 1.0
 *
 *
 *
 *
 * */

package by.epam.javatraining.artsem.maintask01.model;

public class VectorLogic {

    public static int findMax(int[] array) {

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    public static int findMin(int[] array) {

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double findArithMean(double[] array) {

        double arithMean = 0;

        for (int i = 0; i < array.length; i++) {
            arithMean += array[i];
        }
        arithMean /= array.length;
        return arithMean;
    }

    public static double findGeomMean(double[] array) {

        double geomMean = 1.0;

        for (int i = 0; i < array.length; i++) {
            geomMean *= array[i];
        }
        geomMean = Math.pow(geomMean, 1.0 / array.length);
        return geomMean;
    }

    public static boolean isUpSort(int[] array) {

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

        boolean isDownSort = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                isDownSort = false;
                break;
            }
        }
        return isDownSort;
    }

    public static int findLocMaxPos(int[] array) {

        int locMaxPosition = 0;

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                locMaxPosition = i;
                break;
            } else locMaxPosition = -1;
        }

        return locMaxPosition;
    }

    public static int findLocMinPos(int[] array) {

        int locMinPosition = 0;

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < array[i + 1] && array[i] < array[i - 1]) {
                locMinPosition = i;
                break;
            } else locMinPosition = -1;
        }

        return locMinPosition;
    }


    public static int linearSearch(int[] array, int elementToSearch) {

        int result = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToSearch) {
                result = i;
            }
        }
        return result;
    }


    public static int binarySearch(int array[], int elementToSearch) {

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

    public static int[] reverse(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }


    public static int[] bubbleUpSort(int[] array) {

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

        return array;
    }

    public static int[] bubbleDownSort(int[] array) {

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

        return array;
    }


    public static int[] insertionSort(int[] array) {

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
        return array;
    }


    public static int[] selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[i]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i]=array[min];
            array[min]=temp;
        }
        return array;
    }
    
}



