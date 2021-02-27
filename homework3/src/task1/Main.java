package task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Clothes> wears = new ArrayList<>();
        wears.add(new Dress(500, "yellow", ClothingSize.XS));
        wears.add(new Tie(100, "blue", ClothingSize.M));
        wears.add(new Pants(100, "black", ClothingSize.XXS));
        wears.add(new TShirt(100, "white", ClothingSize.L));

        Atelier atelier = new Atelier(wears);
        atelier.manChoice();
        atelier.womanChoice();
    }
}
