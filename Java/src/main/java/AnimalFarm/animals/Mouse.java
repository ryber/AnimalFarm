package AnimalFarm.animals;

import AnimalFarm.Food;
import AnimalFarm.Size;

public class Mouse extends Animal<Food> {

    public Mouse() {
        super(Size.tiny);
    }

    @Override
    public String speak() {
        return "squueek";
    }
}
