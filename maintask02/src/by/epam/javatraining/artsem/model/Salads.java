/** Chief aplication. Create Salad
 * @author Artur Semenas
 * @version 1.0 17.06.2019
 *class describes Salad
 *
 *
 *
 * */

package by.epam.javatraining.artsem.maintask02.model;

import java.util.ArrayList;
import java.util.List;

public class Salads {

    String name;
    private List<Vegetable> vegetables = new ArrayList<Vegetable>();


    public Salads() {

    }

    public Salads(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    //count calories of current salad

    public double countSaladCalories() {

        double calories = 0.0;

        for (Vegetable vegetable : vegetables) {
            calories += vegetable.countCalories();
        }

        return calories;
    }

    public List<?> getIngredients() {
        return vegetables;
    }

    public boolean addIngredient(Vegetable vegetable) {
        return vegetables.add(vegetable);
    }
}
