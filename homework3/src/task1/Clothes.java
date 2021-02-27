package task1;


public abstract class Clothes {
    int price;
    String color;
    ClothingSize size;

    public Clothes() {
    }

    public Clothes(int price, String color, ClothingSize size) {
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ClothingSize getSize() {
        return size;
    }

    public void setSize(ClothingSize size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
