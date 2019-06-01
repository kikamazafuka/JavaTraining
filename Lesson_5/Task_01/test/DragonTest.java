package by.epam.javatraining.artsem.lesson_05.task_01;

import org.junit.Test;

import static org.junit.Assert.*;

public class DragonTest {

    @Test
    public void headCount() {

        int age = 200;
        int expHeads = (age+1)*3;
        assertEquals(expHeads,Dragon.headCount(age));
    }
}