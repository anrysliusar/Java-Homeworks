package task1;

public class Human extends Mammal{
    private int numBrothers;
    private int numSisters;

    public Human() {
    }

    public Human(int age, boolean isAlive, String habitat, String name, int height, int weight, int numBrothers, int numSisters) {
        super(age, isAlive, habitat, name, height, weight);
        this.numBrothers = numBrothers;
        this.numSisters = numSisters;
    }

    public int getNumSisters() {
        return numSisters;
    }

    public void setNumSisters(int numSisters) {
        this.numSisters = numSisters;
    }

    public int getNumBrothers() {
        return numBrothers;
    }

    public void setNumBrothers(int numBrothers) {
        this.numBrothers = numBrothers;
    }

    @Override
    public String toString() {
        return "task1.Human{" +
                "numBrothers=" + numBrothers +
                ", numSisters=" + numSisters +
                '}' + super.toString();
    }
}
