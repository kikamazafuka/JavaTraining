/** Chief aplication. Create Salad
 * @author Artur Semenas
 * @version 1.0 17.06.2019
 *class Chief to work with Salad and Vegetables
 *
 *
 * */

package by.epam.javatraining.artsem.maintask02.controller;

import by.epam.javatraining.artsem.maintask02.model.Cucumber;
import by.epam.javatraining.artsem.maintask02.model.Salads;
import by.epam.javatraining.artsem.maintask02.model.Tomatoes;
import by.epam.javatraining.artsem.maintask02.model.Vegetable;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.List;

public class Chief {

    private static final Logger LOGGER = Logger.getLogger(Chief.class);


    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");

        Vegetable tamoto = new Vegetable("cucumber", 120, 200);

        Cucumber cucumber = new Cucumber();
        cucumber.setName("Big cuc");

        Tomatoes tamat = new Tomatoes();

        String s = tamoto.toString();

        LOGGER.info(s);

        Salads sal = new Salads();

        sal.addIngredient(cucumber);

        sal.addIngredient(tamoto);

        sal.setname("Light Salad");

        List<?> veg = sal.getIngredients();

        for (int i = 0; i < veg.size(); i++) {

            LOGGER.info(veg.get(i));

        }

    }
}
