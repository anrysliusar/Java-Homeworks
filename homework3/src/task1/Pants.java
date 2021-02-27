package task1;

public class Pants extends Clothes implements ManClothes, WomanClothes {
    public Pants() {
    }

    public Pants(int price, String color, ClothingSize size) {
        super(price, color, size);
    }

    @Override
    public void dressMan() {
        System.out.println("Dress a pants for a man!");

    }

    @Override
    public void dressWoman() {
        System.out.println("Dress a pants for a woman!");
    }

    @Override
    public String toString() {
        return "Pants{" +
                super.toString() +
                "}";
    }
}
