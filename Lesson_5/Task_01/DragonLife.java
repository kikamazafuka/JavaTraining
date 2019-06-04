package by.epam.javatraining.artsem.lesson_05.task_01;

public class DragonLife {

    public static void main(String[] args) {

        int age = 305;
        int heads = Dragon.headCount(age);
        int eyes = Dragon.eyesCount(age);
        View.print("Heads: " + heads);
        View.print("Eyes: " + eyes)
    }
}
