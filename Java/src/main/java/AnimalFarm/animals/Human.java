package AnimalFarm.animals;

import AnimalFarm.Food;
import AnimalFarm.Size;

public class Human extends Animal<Food> {

    public Human() {
        super(Size.medium);
    }

    @Override
    public String speak() {
        return "Hi!";
    }
}
