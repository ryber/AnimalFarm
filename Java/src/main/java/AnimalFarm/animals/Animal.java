package AnimalFarm.animals;


import AnimalFarm.Food;
import AnimalFarm.Meat;
import AnimalFarm.Size;

public abstract class Animal<DietType extends Food> implements Meat {

    private final Size size;
    private Food stomachContents = null;

    protected Animal(Size size){
       this.size = size;
    }

    public abstract String speak();

    public void eat(DietType food){
       stomachContents = food;

    }

    public boolean isHungry() {
        return stomachContents == null;
    }

}
