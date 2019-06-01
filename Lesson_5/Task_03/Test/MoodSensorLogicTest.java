package by.epam.javatraining.artsem.lesson_05.task_03;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoodSensorLogicTest {

    @Test
    public void moodDefine() {
        int a = 5;
        String expected = ":(";
        assertEquals(expected, MoodSensorLogic.moodDefine(a));
    }

    @Test
    public void moodDefine2() {
        int a = 51;
        String expected = ":)";
        assertEquals(expected, MoodSensorLogic.moodDefine(a));
    }

    @Test
    public void moodDefine3() {
        int a = -5;
        String expected = "Incorrect mood data, please enter positive number";
        assertEquals(expected, MoodSensorLogic.moodDefine(a));
    }
}