package AnimalFarm.animals;

import AnimalFarm.Size;

public class Tiger extends Carnivore {

    public Tiger() {
        super(Size.large);
    }

    @Override
    public String speak() {
        return "raaaawrrrr";
    }
}
