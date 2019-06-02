package by.epam.javatraining.artsem.lesson_06.task_05;

public class PrimeNumberLogic {

    public static boolean isPrime(int number){
        if (number==2){
            return true;
        }
        boolean isPrime = true;
        if (number%2==0){
            isPrime = false;
        }
        return isPrime;
    }
}
