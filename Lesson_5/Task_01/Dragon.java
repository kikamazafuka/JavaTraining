package by.epam.javatraining.artsem.lesson_05.task_01;

public class Dragon {

    static final int headsOnBirth = 3;
    static final int headsOnMidAge = 2;
    static final int midAge = 200;
    static final int oldAge = 300;
    static final int eyes = 2;
    static int recentNumberOfHeads;

    public static int headCount(int age) {
        
        if (age < 0) {
            return -1;
        }

        if (age > midAge && age <= oldAge) {
            recentNumberOfHeads = headsOnBirth + (age - midAge) * headsOnMidAge
                    + headsOnBirth * midAge;
        } else if (age > oldAge) {
            recentNumberOfHeads = headsOnBirth + age - oldAge + (oldAge - midAge) * headsOnMidAge
                    + midAge * headsOnBirth;

        } else recentNumberOfHeads = headsOnBirth + age * headsOnBirth;

        return recentNumberOfHeads;
    }

    public static int eyesCount(int age) {
        return headCount(age) * eyes;
    }
}
