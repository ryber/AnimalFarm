package AnimalFarm;

public class Human extends Animal<Food> {
    @Override
    public String speak() {
        return "Hi";
    }
}
