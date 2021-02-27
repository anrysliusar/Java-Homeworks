package task3;

public class Man extends Human implements ManClothes{
    private int footSize;

    public Man() {
    }

    public Man(int footSize) {
        this.footSize = footSize;
    }

    public Man(String name, int age, int footSize) {
        super(name, age);
        this.footSize = footSize;
    }

    public int getFootSize() {
        return footSize;
    }

    public void setFootSize(int footSize) {
        this.footSize = footSize;
    }

    @Override
    public void dressMan() {
        System.out.println(String.format("Put %s in a size %d shoe", getName(),footSize));
    }

    @Override
    public String toString() {
        return "Man{" +
                "footSize=" + footSize +
                '}' + super.toString();
    }
}
