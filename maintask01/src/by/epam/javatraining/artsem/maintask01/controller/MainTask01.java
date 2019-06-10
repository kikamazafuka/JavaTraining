/** Main task 01 v.1.0 by Artur Semenas 09.06.2019
 *@author Artur Semenas
 *@version 1.0
 *
 *
 *
 *
 * */


package by.epam.javatraining.artsem.maintask01.controller;

import by.epam.javatraining.artsem.maintask01.model.VectorLogic;
import by.epam.javatraining.artsem.maintask01.view.View;

public class MainTask01 {

    public static void main(String[] args) {

        int[] array = new int[]{0, 3, 2, 1};
        double [] doubles = new double[]{1,2,3};


        int max = VectorLogic.findMax(array);
        View.print("Max: " + max);

        int min = VectorLogic.findMin(array);
        View.print("Min: " + min);


        double arithMean = VectorLogic.findArithMean(doubles);
        View.print("Arithmetic mean: " + arithMean);


        double geomMean = VectorLogic.findGeomMean(doubles);
        View.print("Geometric mean: " + geomMean);

        boolean isUpSort = VectorLogic.isUpSort(array);
        View.print("Is Up Sort: " + isUpSort);

        boolean isDownSort = VectorLogic.isDownSort(array);
        View.print("Is Down Sort: " + isDownSort);

        int locMax = VectorLogic.findLocMaxPos(array);
        View.print("Loc max position: "+locMax);

        int locMin = VectorLogic.findLocMinPos(array);
        View.print("Loc min position: "+locMin);

        int[] reverse = VectorLogic.reverse(array);
        View.print(reverse);

        int [] bubbleUpSort = VectorLogic.bubbleUpSort(array);
        View.print(bubbleUpSort);

        int [] bubbleDownSort = VectorLogic.bubbleDownSort(array);
        View.print(bubbleDownSort);

        int [] ibubbleDownSort = VectorLogic.insertionSort(array);
        View.print(ibubbleDownSort);

        int search = VectorLogic.linearSearch(array, 7);
        View.print("result: "+search);

       int [] select = VectorLogic.selectionSort(array);
       View.print(select);

       
    }
}
