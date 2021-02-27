package task1;

public class Mammal extends Animal{
    private int height;
    private int weight;

    public Mammal() {
    }

    public Mammal(int age, boolean isAlive, String habitat, String name, int height, int weight) {
        super(age, isAlive, habitat, name);
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }

    @Override
    public String toString() {
        return "task1.Mammal{" +
                "height=" + height +
                ", weight=" + weight +
                '}' + super.toString();
    }
}
