package Task_03;

public class SequenceLogic {

    public  static boolean isUpSeq(int number){

        int a = number % 10;
        number /= 10;
        int b = number % 10;
        number /= 10;
        int c = number % 10;
        number /= 10;
        int d = number % 10;

        return (d<c)&&(c<b)&&(b<a);
    }

    public  static boolean isDownSeq(int number){

        int a = number % 10;
        number /= 10;
        int b = number % 10;
        number /= 10;
        int c = number % 10;
        number /= 10;
        int d = number % 10;

        return (d>c)&&(c>b)&&(b>a);
    }
}
