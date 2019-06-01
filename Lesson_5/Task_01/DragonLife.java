package by.epam.javatraining.artsem.lesson_05.task_01;

public class DragonLife {

    public static void main(String[] args) {

        int n = Dragon.headCount(305);
        int eyes = Dragon.eyesCount(n);
        View.print("Heads: " + n);
        View.print("Eyes: " + eyes)
    }
}
