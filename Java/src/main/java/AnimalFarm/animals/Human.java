package AnimalFarm.animals;

import AnimalFarm.Size;

public class Human extends Omnivore {

    public Human() {
        super(Size.medium);
    }

    @Override
    public String speak() {
        return "Hi!";
    }
}
