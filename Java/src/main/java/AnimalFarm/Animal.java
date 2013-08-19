package AnimalFarm;

public abstract class Animal<T extends Food> implements Meat {
    public abstract String speak();

    public void eat(T food){

    }
}
