package AnimalFarm.animals;

import AnimalFarm.Plant;
import AnimalFarm.Size;

public class Cow extends Animal<Plant> {

    public Cow() {
        super(Size.large);
    }

    @Override
    public String speak() {
        return "Moooo";
    }
}
