package Task_03;

public class Task_03 {

    public static void main(String[] args) {

        int number = 1234;
        boolean decrRes = SequenceLogic.isDownSeq(number);
        boolean incrRes = SequenceLogic.isUpSeq(number);
        
        System.out.println("Increasing sequence: " + incrRes);
        System.out.println("Decreasing sequence: " + decrRes);

    }
}
