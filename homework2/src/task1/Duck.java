package task1;

public class Duck extends Bird{
    private int child;

    public Duck() {
    }

    public Duck(int age, boolean isAlive, String habitat, String name, int wingLength, boolean canFly, int child) {
        super(age, isAlive, habitat, name, wingLength, canFly);
        this.child = child;
    }

    public int getChild() {
        return child;
    }

    public void setChild(int child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "task1.Duck{" +
                "child=" + child +
                '}' + super.toString();
    }
}
