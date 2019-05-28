package Lesson_4;

public class CalcLogic {

    // Arithmetical mean calculation
    public static double calcArith(int number) {

        double count = 6d;
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
     
        return (a + b + c + d + e + f) / count;
    }

    // Geometric mean calculation
    public static double calcGeom(int number) {

        double count = 6d;
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
      
        return (a * b * c * d * e * f) / count;
    }
}
