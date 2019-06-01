package by.epam.javatraining.artsem.lesson_05.task_02;

public class LetterLogic {


    static boolean isVovel(char letter) {
        return letter == 97 || letter == 101 || letter == 105 || letter == 111 || letter == 117 || letter == 121
                  || letter == 65 || letter == 69 || letter == 73 || letter == 79 || letter == 85 || letter==89;
    }

    static boolean isVovel(String letter) {
        if (letter.length()>1){
            System.out.println("It's not a letter, type correct data");
            return false;
        }
        char a = letter.toLowerCase().charAt(0);
        return a == 97 || a == 101 || a == 105 || a == 111 || a == 117 || a == 121;
    }

    static boolean isVovel(double letter) {
        System.out.println("It's not a letter, type correct data");
        return false;
    }
}

