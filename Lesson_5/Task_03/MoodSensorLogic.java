package by.epam.javatraining.artsem.lesson_05.task_03;

public class MoodSensorLogic {

    public static final String LUCKY = ":D";
    public static final String HAPPY = ":)";
    public static final String ANGRY = ":(";
    public static final String CONFUSED = "o.O";

    public static final Random number = new Random();
    public static final int moodCount = 4;

    public static String guessMood() {

        int a = number.nextInt(moodCount);
        String mood = HAPPY;
        switch (a) {
            case 1:
                mood = LUCKY;
                break;
            case 2:
                mood = ANGRY;
                break;
            case 3:
                mood = CONFUSED;
        }

        return mood;
    }
}

