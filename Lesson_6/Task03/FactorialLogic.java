package by.epam.javatraining.artsem.lesson_06.task_03;

public class FactorialLogic {

    public static int calcFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
