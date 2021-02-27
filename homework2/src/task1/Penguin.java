package task1;

public class Penguin extends Bird{
    private int maxSpeed;

    public Penguin() {
    }

    public Penguin(int age, boolean isAlive, String habitat, String name, int wingLength, boolean canFly, int maxSpeed) {
        super(age, isAlive, habitat, name, wingLength, canFly);
        this.maxSpeed = maxSpeed;
    }
}
