package AnimalFarm.animals;

import AnimalFarm.Meat;
import AnimalFarm.Size;

public class Tiger extends Animal<Meat> {

    public Tiger() {
        super(Size.large);
    }

    @Override
    public String speak() {
        return null;
    }
}
