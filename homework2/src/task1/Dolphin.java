package task1;

public class Dolphin extends Mammal{
    private int tailLength;
    private boolean isTame;

    public Dolphin() {}

    public Dolphin(int age, boolean isAlive, String habitat, String name, int height, int weight, int tailLength, boolean isTame) {
        super(age, isAlive, habitat, name, height, weight);
        this.tailLength = tailLength;
        this.isTame = isTame;
    }

    public int getTailLength() {
        return tailLength;
    }

    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }

    public boolean isTame() {
        return isTame;
    }

    public void setTame(boolean tame) {
        isTame = tame;
    }

    @Override
    public String toString() {
        return "task1.Dolphin{" +
                "tailLength=" + tailLength +
                ", isTame=" + isTame +
                '}' + super.toString();
    }
}
