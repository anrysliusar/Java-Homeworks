package task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();
        Map<Person, List<Pet>> club = new HashMap<>();
        Person vasya = new Person("vasya",18);
        Person vlad = new Person("vlad",19);

//      1) додати учасника в клуб;
        club.put(vasya, null);
        club.put(vlad, null);
        System.out.println(club);

//      2) додати тваринку до учасника клубу.
        Pet barsik = new Pet("barsik", "cat");
        Pet rex = new Pet("rex", "dog");
        Pet nemo = new Pet("nemo", "fish");
        Pet richard = new Pet("richard", "dog");

        List<Pet> pets1 = new ArrayList<>();
        pets1.add(barsik);
        pets1.add(rex);

        List<Pet> pets2 = new ArrayList<>();
        pets2.add(nemo);
        pets2.add(richard);

        club.put(vasya, pets1);
        club.put(vlad, pets2);
        System.out.println(club);

//      3) видалити тваринку з власника.
        club.get(vasya).remove(barsik);
        System.out.println(club);


//      4) видалити учасника клубу.
        club.remove(vasya);
        System.out.println(club);

//      5) видалити конкретну тваринку з усіх власників.
        club.forEach((person, pets) -> pets.removeIf(pet -> pet.equals(nemo)));

//      6) вивести на екран зооклуб.
        System.out.println(club);
    }
}
