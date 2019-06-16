package by.epam.javatraining.artsem.lesson_06.task_04;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddLogicTest {

    @Test
    public void isEven() {
        int a = 246;
        boolean expected = true;

        assertEquals(expected, EvenOddLogic.isEven(a));
    }

    @Test
    public void isOdd() {
        int a = 135;
        boolean expected = true;

        assertEquals(expected, EvenOddLogic.isOdd(a));
    }
}