package AnimalFarm;

import AnimalFarm.animals.Animal;
import AnimalFarm.animals.Cow;
import AnimalFarm.animals.Tiger;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class AnimalTest {

    @Test
    public void animalsAreHungryUntilTheyHaveEaten() throws Exception {
        Animal animal = new Tiger();
        Animal food = new Cow();

        assertTrue(animal.isHungry());

        animal.eat(food);

        food.eat(animal);

        assertFalse(animal.isHungry());
    }



}
