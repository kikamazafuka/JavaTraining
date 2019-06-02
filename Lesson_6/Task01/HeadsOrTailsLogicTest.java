package by.epam.javatraining.artsem.lesson_06.task_01;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeadsOrTailsLogicTest {

   /* @Test
    public void countHeads() {
        int count = 10;
        int heads = 3;
        int tails = 7;
        assertEquals();

    }*/


    @Test
    public void countTails() {
        int count = 10;
        int heads = 3;
        int tails = 7;
        assertEquals(tails,HeadsOrTailsLogic.countTails(count, heads));

    }
}