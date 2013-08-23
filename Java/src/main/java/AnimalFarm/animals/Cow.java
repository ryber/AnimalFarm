package AnimalFarm.animals;

import AnimalFarm.Food;
import AnimalFarm.Size;

public class Cow extends Herbivore {

    public Cow() {
        super(Size.large);
    }

    @Override
    public String speak() {
        return "Moooo";
    }

    public Milk milk(){
        return new Milk();
    }

    private class Milk implements Food {
    }
}
