package Task_05;

public class ReverseLogic {

    public static int reverse(int number) {

        int a = number % 10 * 1000000;
        number /= 10;
        int b = number % 10 * 100000;
        number /= 10;
        int c = number % 10 * 10000;
        number /= 10;
        int d = number % 10 * 1000;
        number /= 10;
        int e = number % 10 * 100;
        number /= 10;
        int f = number % 10 * 10;
        int g = number / 10;

        int reverseNum = a  + b +  c +  d +  e +  f +  g;

        return reverseNum;
    }
}
