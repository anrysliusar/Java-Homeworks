package task1;

public class Bird extends Animal{
    private int wingLength;
    private boolean canFly;

    public Bird() {}

    public Bird(int age, boolean isAlive, String habitat, String name, int wingLength, boolean canFly) {
        super(age, isAlive, habitat, name);
        this.wingLength = wingLength;
        this.canFly = canFly;
    }

    public int getWingLength() {
        return wingLength;
    }

    public void setWingLength(int wingLength) {
        this.wingLength = wingLength;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }

    @Override
    public String toString() {
        return "task1.Bird{" +
                "wingLength=" + wingLength +
                ", canFly=" + canFly +
                '}' + super.toString();
    }
}
