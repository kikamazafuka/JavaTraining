package by.epam.javatraining.artsem.lesson_05.task_01;

public class Dragon {

    static int headsOnBirth = 3;
    static int midAge = 200;
    static int oldAge = 300;
    static int recentNumberOfHeads;

    public static int headCount(int age) {

       // int recentNumberOfHeads = 0;
        int headstil200 = headsOnBirth + midAge*3;
        int headstill300 = headstil200 - age%100*2;
        int headsOver300 = 0;

        if (age > midAge && age < oldAge) {
            recentNumberOfHeads = headsOnBirth + (age - midAge) * 2 + 600;
        } else if (age > oldAge) {
            recentNumberOfHeads = headsOnBirth + (age - oldAge) + 800;

        } else recentNumberOfHeads = headsOnBirth + age * 3;


        return recentNumberOfHeads;
    }
    
        public static int eyesCount (int heads){
        return heads*2;
    }
}
