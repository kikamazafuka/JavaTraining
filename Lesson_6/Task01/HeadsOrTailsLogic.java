package by.epam.javatraining.artsem.lesson_06.task_01;

import java.util.Random;

public class HeadsOrTailsLogic {

    static int heads = 0;
    static int tails = 0;

    public static int countHeads(int number) {
        if (number<0){
            return -1;
        }
        for (int i = 0; i < number; i++) {
            int random = new Random().nextInt(2);
            if (random == 1) {
                heads++;
            }
        }
        return heads;
    }

    public static int countTails(int number, int heads){
        return number - heads;
    }

    public static String countHeadsAndTails(int number) {
        for (int i = 0; i < number; i++) {
            int random = new Random().nextInt(2);
            if (random == 1) {
                heads++;
                System.out.println(heads);
            } else tails++;
            System.out.println(tails);
        }
        return "Heads: " + heads + " Tails: " + tails;
    }

}
