package by.epam.javatraining.artsem.lesson_06.task_04;

public class EvenOddLogic {

    public static boolean isEven(int number) {
        boolean isEven = true;
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                isEven = false;
            }
            number /= 10;
        }
        return isEven;
    }

    public static boolean isOdd(int number) {
        boolean isOdd = true;
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                isOdd = false;
            }
            number /= 10;
        }
        return isOdd;
    }
}
