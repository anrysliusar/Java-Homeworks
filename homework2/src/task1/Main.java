package task1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(2, true, "water-ground", "turtle");
        Mammal mammal = new Mammal(5, true, "ground", "cow", 123, 350);
        Human human = new Human(5, true, "ground", "Vova", 140, 40, 2, 0);
        Dolphin dolphin = new Dolphin(2, true, "water", "My-little-dolphin", 200, 300, 50, false);
        Bird bird = new Bird(1, false, "air", "gorobets", 20, true);
        Duck duck = new Duck(1, false, "ground-air", "Utka", 30, false, 25);
        Penguin penguin = new Penguin(3, true, "ground-air", "task1.Penguin grey", 40, false, 30);

        Animal[] animals = new Animal[7];
        animals[0] = animal;
        animals[1] = mammal;
        animals[2] = human;
        animals[3] = dolphin;
        animals[4] = bird;
        animals[5] = duck;
        animals[6] = penguin;

        Mammal[] mammals = new Mammal[3];
        mammals[0] = mammal;
        mammals[1] = human;
        mammals[2] = dolphin;

        Bird[] birds = new Bird[3];
        birds[0] = bird;
        birds[1] = duck;
        birds[2] = penguin;

        Human[] humans = new Human[1];
        humans[0] = human;

        Dolphin[] dolphins = new Dolphin[1];
        dolphins[0] = dolphin;

        Duck[] ducks = new Duck[1];
        ducks[0] = duck;

        Penguin[] penguins = new Penguin[1];
        penguins[0] = penguin;




    }
}
