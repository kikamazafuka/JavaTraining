package by.epam.javatraining.artsem.lesson_06.task_03;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialLogicTest {

    @Test
    public void calcFactorial() {

        int number = 3;
        int expected = 6;

        assertEquals(expected, FactorialLogic.calcFactorial(number));
    }
}