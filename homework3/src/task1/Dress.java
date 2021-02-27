package task1;

public class Dress extends Clothes implements WomanClothes {
    public Dress() {
    }

    public Dress(int price, String color, ClothingSize size) {
        super(price, color, size);
    }

    @Override
    public void dressWoman() {
        System.out.println("Dress woman!");

    }

    @Override
    public String toString() {
        return "Dress{" +
                super.toString() +
                "}";
    }
}
