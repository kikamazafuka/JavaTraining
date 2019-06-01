package by.epam.javatraining.artsem.lesson_05.task_02;

import org.junit.Test;

import static org.junit.Assert.*;

public class LetterLogicTest {

    @Test
    public void isVovelChar() {
        char a = 'a';
        boolean expected = true;
        assertEquals(expected, LetterLogic.isVovel(a));
    }

    @Test
    public void isVovelString() {
        String a = "a";
        boolean expected = true;
        assertEquals(expected, LetterLogic.isVovel(a));
    }

    @Test
    public void isVovelDouble() {
        double a = 2.0;
        boolean expected = false;
        assertEquals(expected, LetterLogic.isVovel(a));
    }
}