package task2;

public class Book extends Papyrus{
    private String name;
    private int pages;
    private int price;

    public Book() {
    }

    public Book(String name, int pages, int price) {
        this.name = name;
        this.pages = pages;
        this.price = price;
    }

    public Book(int length, int width, String name, int pages, int price) {
        super(length, width);
        this.name = name;
        this.pages = pages;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                '}' + super.toString();
    }
}
