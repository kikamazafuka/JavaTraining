package by.epam.javatraining.artsem.lesson_06.task_05;

public class PrimeNumberLogic {


    public static boolean isPrime(int number) {

        if (number <= 2) {
            return false;
        }
        double s = Math.sqrt(number);
        for (int i = 2; i <= s; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
