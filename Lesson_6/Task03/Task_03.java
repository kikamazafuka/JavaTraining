package by.epam.javatraining.artsem.lesson_06.task_03;

import by.epam.javatraining.artsem.lesson_05.task_01.View;

public class Task_03 {
    public static void main(String[] args) {

        int a = FactorialLogic.calcFactorial(-5);
        View.print("fact: " + a);
    }
}
