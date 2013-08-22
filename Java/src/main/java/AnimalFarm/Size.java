package AnimalFarm;

public enum Size {
    tiny(1), small(10), medium(70), large(200), huge(5000);

    private int kilograms;

    Size(int kilograms) {
        this.kilograms = kilograms;
    }

    public int weight(){
       return kilograms;
    }

    public boolean isLargerThan(Size size) {
        return kilograms >  size.weight();
    }
}
