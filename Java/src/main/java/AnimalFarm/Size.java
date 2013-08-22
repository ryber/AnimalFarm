package AnimalFarm;

public enum Size {
    tiny(10), small(50), medium(100), large(1000), huge(10000);

    private int calories;

    Size(int calories) {
        this.calories = calories;
    }

    public int getCalories(){
       return calories;
    }

    public boolean isLargerThan(Size size) {
        return calories >  size.getCalories();
    }
}
