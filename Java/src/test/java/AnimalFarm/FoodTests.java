package AnimalFarm;

import org.junit.Before;
import org.junit.Test;

public class FoodTests {

    private Human fred;
    private Cow bertha;
    private Tiger tony;
    private Grass grass;

    @Before
    public void setUp() throws Exception {
        fred = new Human();
        bertha = new Cow();
        tony = new Tiger();
        grass = new Grass();
    }

    @Test
    public void cowsOnlyEatPlans() throws Exception {

        bertha.eat(grass);

        //bertha.eat(fred);
    }
}
