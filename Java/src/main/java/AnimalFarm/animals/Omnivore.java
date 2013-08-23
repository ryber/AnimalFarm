package AnimalFarm.animals;

import AnimalFarm.Food;
import AnimalFarm.Size;

public abstract class Omnivore extends Animal {
    protected Omnivore(Size size) {
        super(size);
    }

    @Override
    protected boolean canEat(Food food) {
        return true;
    }
}
