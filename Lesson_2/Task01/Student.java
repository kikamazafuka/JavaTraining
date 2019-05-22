package Lesson_2;

public class Student {

    public String name;
    public int mark;

    public Student (String name, int mark){
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString (){
        return name + ":" + mark;
    }
}
