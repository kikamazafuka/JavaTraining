package by.epam.javatraining.artsem.maintask02.model;

public class Vegetable {

    private double calories;
    private double weight;
    private String name;


    public Vegetable() {

    }

    public Vegetable(String name) {
        this.name = name;
    }


    public Vegetable(String name, double calories) {

        this.name = name;
        this.calories = calories;
        this.weight = 100;
    }

    public Vegetable(String name, double calories, double weight) {

        this.name = name;
        this.calories = calories;
        this.weight = weight;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double countCalories() {
        return calories * weight / 100.0;
    }

    public String toString() {
        return "" + name + " " + weight + " gramms " + "contains " + countCalories() + " kcal";
    }
}
