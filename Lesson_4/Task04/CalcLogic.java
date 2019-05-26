package Lesson_4;

public class CalcLogic {

    // Arithmetical mean calculation
    public static double calcArith(int number) {

        int a = number % 10;
        number /= 10;
        int b = number % 10;
        number /= 10;
        int c = number % 10;
        number /= 10;
        int d = number % 10;
        number /= 10;
        int e = number % 10;
        number /= 10;
        int f = number % 10;

        double arithm = (a + b + c + d + e + f) / 6d;
        return arithm;
    }

    // Geometric mean calculation
    public static double calcGeom(int number) {

        int a = number % 10;
        number /= 10;
        int b = number % 10;
        number /= 10;
        int c = number % 10;
        number /= 10;
        int d = number % 10;
        number /= 10;
        int e = number % 10;
        number /= 10;
        int f = number % 10;

        double geometr = (a * b * c * d * e * f) / 6d;
        return geometr;
    }
}
