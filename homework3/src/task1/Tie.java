package task1;

public class Tie extends Clothes implements ManClothes {
    public Tie() {
    }

    public Tie(int price, String color, ClothingSize size) {
        super(price, color, size);
    }


    @Override
    public void dressMan() {
        System.out.println("Dress a tie for a man!");
    }

    @Override
    public String toString() {
        return "Tie{" +
                super.toString() +
                "}";
    }
}
