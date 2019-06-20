/** Chief aplication. Create Salad
 * @author Artur Semenas
 * @version 1.0 17.06.2019
 *class describes Cucumber
 *
 *
 * */

package by.epam.javatraining.artsem.maintask02.model;

import java.util.Objects;

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

    @Override
    public String toString() {
        return " " + name + " " + weight + " gramms " + "contains " + countCalories() + " kcal";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vegetable vegetable = (Vegetable) o;
        return Double.compare(vegetable.calories, calories) == 0 &&
                Double.compare(vegetable.weight, weight) == 0 &&
                Objects.equals(name, vegetable.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calories, weight, name);
    }
}

