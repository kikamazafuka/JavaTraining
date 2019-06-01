package by.epam.javatraining.artsem.lesson_05.task_03;

public class MoodSensorLogic {

    public static String moodDefine(int number) {
        if (number < 0) {
            return "Incorrect mood data, please enter positive number";
        }
        if (number > 50) {
            return ":)";
        } else return ":(";
    }
}
