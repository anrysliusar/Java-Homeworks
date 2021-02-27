package task1;

public class TShirt extends Clothes implements ManClothes, WomanClothes {

    public TShirt() {
    }

    public TShirt(int price, String color, ClothingSize size) {
        super(price, color, size);
    }


    @Override
    public void dressMan() {
        System.out.println("Dress a t-shirt for a man!");
    }

    @Override
    public void dressWoman() {
        System.out.println("Dress a t-shirt for a woman!");

    }


    @Override
    public String toString() {
        return "TShirt{" +
                super.toString() +
                "}";
    }
}
