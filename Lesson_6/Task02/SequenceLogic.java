package by.epam.javatraining.artsem.lesson_06.task_02;

public class SequenceLogic {

    public static boolean isUpSeq(int number){
        int lastDigit= number%10;
        boolean flag = true;
        while (number>0){
            number/=10;
            int nextDig = number%10;
            if (nextDig>=lastDigit){
                flag = false;
            }
            lastDigit=nextDig;
        }
        return flag;
    }

    public static boolean isDownSeq(int number){
        int lastDigit= number%10;
        boolean flag = true;
        while (number>0){
            number/=10;
            int nextDig = number%10;
            if (nextDig<=lastDigit){
                flag = false;
            }
            lastDigit=nextDig;
        }
        return flag;
    }

    public static boolean isIncrSeq (int number) {
        String temp = Integer.toString(number);
        int[] arr = new int[temp.length()];
        boolean flag = true;
        for (int i = 0; i < temp.length()-1; i++) {
            arr[i] = temp.charAt(i);
            arr[i] = Character.getNumericValue(arr[i]);
        }
        for (int i = 0; i<arr.length-1; i++){
            if (arr[i]>=arr[i+1]){
                flag = false;
            }
        }
        return flag;
    }

   /* public static int [] getArr (int number){
        String temp = Integer.toString(number);
        int[] arr = new int[temp.length()];
        boolean flag = true;
        for (int i = 0; i < temp.length()-1; i++) {
            arr[i] = temp.charAt(i);
            arr[i] = Character.getNumericValue(arr[i]);
        }
        return arr;
    }

    public static boolean isDecSeq (int [] arr){

        boolean flag = true;
        for (int i = 0; i<arr.length-1; i++){
            if (arr[i]<=arr[i+1]){
                flag = false;
            }
        }

        return flag;
    }*/
}
