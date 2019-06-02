package by.epam.javatraining.artsem.lesson_06.task_01;

import by.epam.javatraining.artsem.lesson_05.task_01.View;

public class Task_01 {

    public static void main(String[] args) {

        int number = 10;

        int resHeads = HeadsOrTailsLogic.countHeads(number);
        int resTails = HeadsOrTailsLogic.countTails(number, resHeads);
        //String str = HeadsOrTailsLogic.countHeadsAndTails(number);
        View.print("Heads: " + resHeads + " Tail: " + resTails);
        //View.print(str);
    }
}
