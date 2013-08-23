package AnimalFarm.animals;

import AnimalFarm.Food;
import AnimalFarm.Meat;
import AnimalFarm.Size;

public abstract class Carnivore extends Animal {
    protected Carnivore(Size size) {
        super(size);
    }

    @Override
    protected boolean canEat(Food food) {
        return food instanceof Meat;
    }
}
