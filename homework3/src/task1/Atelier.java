package task1;


import java.util.ArrayList;


public class Atelier {
    private ArrayList<Clothes> clothes;

    public Atelier() {
    }

    public Atelier(ArrayList<Clothes> clothes) {
        this.clothes = clothes;
    }

    public ArrayList<Clothes> getClothes() {
        return clothes;
    }

    public void setClothes(ArrayList<Clothes> clothes) {
        this.clothes = clothes;
    }

    public void manChoice(){
        System.out.println("Men's choice");
        for (Clothes cloth : clothes) {
            if(cloth instanceof ManClothes){
                System.out.println(cloth);
            }
        }
    }

    public void womanChoice(){
        System.out.println("Women's choice");
        for (Clothes cloth : clothes) {
            if(cloth instanceof WomanClothes){
                System.out.println(cloth);
            }
        }
    }

    @Override
    public String toString() {
        return "Atelier{" +
                "clothes=" + clothes +
                '}';
    }
}
