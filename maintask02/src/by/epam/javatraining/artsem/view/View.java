package by.epam.javatraining.artsem.maintask02.view;

import java.util.List;

public class View {

    public static void print(String message) {
        System.out.println(message);
    }

    public static void print(int [] array) {
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void print (List o){
        for (int i = 0; i < o.size(); i++) {

            System.out.println(o.get(i));
        }
    }
}
