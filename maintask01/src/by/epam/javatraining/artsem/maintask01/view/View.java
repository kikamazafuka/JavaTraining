package by.epam.javatraining.artsem.maintask01.view;

public class View {

    public static void print(String message) {
        System.out.println(message);
    }

    public static void print(int [] array) {
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
