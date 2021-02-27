package task2;

public class Papyrus {
    private int length;
    private int width;

    public Papyrus() {
    }

    public Papyrus(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Papyrus{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
