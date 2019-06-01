package by.epam.javatraining.artsem.lesson_05.task_03;

import by.epam.javatraining.artsem.lesson_05.task_01.View;

import java.util.Random;

public class Task_03 {
    public static void main(String[] args) {

        int a = new Random().nextInt(100);
        String str = MoodSensorLogic.moodDefine(a);
        View.print(str);

    }
}
