package by.epam.javatraining.artsem.lesson_06.task_04;

import by.epam.javatraining.artsem.lesson_05.task_01.View;

public class Task_04 {

    public static void main(String[] args) {

        boolean a = EvenOddLogic.isEven(2468);
        boolean b = EvenOddLogic.isOdd(173);
        View.print("Digits is even: " + a);
        View.print("Digits is odd: " + b);
    }
}
