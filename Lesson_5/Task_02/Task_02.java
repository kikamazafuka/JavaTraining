package by.epam.javatraining.artsem.lesson_05.task_02;

import by.epam.javatraining.artsem.lesson_05.task_01.View;

public class Task_02 {
    public static void main(String[] args) {

        boolean a = LetterLogic.isVovelThird('Y');
        boolean b = LetterLogic.isVovelFourth('a');
        View.print("Letter is vovel: "+a);
    }
}
