package by.epam.javatraining.artsem.lesson_05.task_02;

public class LetterLogic {


    static boolean isVovelSecond(char letter) {
        letter = Character.toLowerCase(letter);
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y';
    }

    static boolean isVovelThird(char letter) {
        letter = Character.toLowerCase(letter);
        switch (letter) {
            case 'a':
                break;
            case 'e':
                break;
            case 'i':
                break;
            case 'o':
                break;
            case 'u':
                break;
            case 'y':
                break;
            default:
                return false;

        }
        return true;
    }

    static boolean isVovelFourth(char letter) {
        letter = Character.toLowerCase(letter);
        boolean isVovel = true;
        char[] arr = {'a', 'i', 'e', 'o', 'u', 'y'};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != letter) {
                isVovel = false;
            }
        }
        return isVovel;
    }
}

