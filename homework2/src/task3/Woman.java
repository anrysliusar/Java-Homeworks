package task3;

public class Woman extends Human implements WomanClothes{
    private int dressSize;


    public Woman() {
    }

    public Woman(int dressSize) {
        this.dressSize = dressSize;
    }

    public Woman(String name, int age, int dressSize) {
        super(name, age);
        this.dressSize = dressSize;
    }

    public int getDressSize() {
        return dressSize;
    }

    public void setDressSize(int dressSize) {
        this.dressSize = dressSize;
    }



    @Override
    public void dressWoman() {
        System.out.println(String.format("Put %s in a dress size %d", getName(),dressSize));
    }

    @Override
    public String toString() {
        return "Woman{" +
                "dressSize=" + dressSize +
                '}' + super.toString();
    }
}
