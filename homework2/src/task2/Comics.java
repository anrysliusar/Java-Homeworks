package task2;

public class Comics extends Book{
    private String painter;

    public Comics() {
    }

    public Comics(String painter) {
        this.painter = painter;
    }

    public Comics(String name, int pages, int price, String painter) {
        super(name, pages, price);
        this.painter = painter;
    }

    public Comics(int length, int width, String name, int pages, int price, String painter) {
        super(length, width, name, pages, price);
        this.painter = painter;
    }

    public String getPainter() {
        return painter;
    }

    public void setPainter(String painter) {
        this.painter = painter;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "painter='" + painter + '\'' +
                '}' + super.toString();
    }
}
