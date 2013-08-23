package AnimalFarm.animals;

import AnimalFarm.Size;

public class Mouse extends Omnivore {

    public Mouse() {
        super(Size.tiny);
    }

    @Override
    public String speak() {
        return "squueek";
    }
}
