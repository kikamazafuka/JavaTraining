package by.epam.javatraining.artsem.lesson_06.task_05;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberLogicTest {

    @Test
    public void isPrime() {
        int a = 3;
        boolean expected = true;
        assertEquals(expected, PrimeNumberLogic.isPrime(a));
    }
}