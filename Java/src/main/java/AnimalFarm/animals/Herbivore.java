package AnimalFarm.animals;

import AnimalFarm.Food;
import AnimalFarm.Plant;
import AnimalFarm.Size;

public abstract class Herbivore extends Animal {
    protected Herbivore(Size size) {
        super(size);
    }

    @Override
    protected boolean canEat(Food food) {
        return food instanceof Plant;
    }
}
