package task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Person, List<Pet>> club = new HashMap<>();
        Person vasya = new Person("vasya",18);
        Person vlad = new Person("vlad",19);

        Pet barsik = new Pet("barsik", "cat");
        Pet rex = new Pet("rex", "dog");
        Pet nemo = new Pet("nemo", "fish");

        List<Pet> pets1 = new ArrayList<>();
        pets1.add(barsik);
        pets1.add(rex);

        List<Pet> pets2 = new ArrayList<>();
        pets2.add(nemo);
        pets2.add(rex);

        club.put(vasya, pets1);
        club.put(vlad, pets2);

        ZooClub zooClub = new ZooClub(club);


        System.out.println("Вас вітає Zoo Club!");
        while (true){
            System.out.println("----------------------------------------------------\n");
            System.out.println("Введіть цифру що відповідає операції:\n"+
                    "1) додати учасника в клуб\n" +
                    "2) додати тваринку до учасника клубу\n" +
                    "3) видалити тваринку з власника\n" +
                    "4) видалити учасника клубу\n" +
                    "5) видалити конкретну тваринку з усіх власників\n" +
                    "6) вивести на екран зооклуб\n" +
                    "7) вийти");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input){
                case ("1"):
                    // 1) додати учасника в клуб;
                    System.out.println("Додаємо учасника в клуб \n Введіть ім'я");
                    String name = scanner.nextLine();
                    System.out.println("Введіть вік");
                    int age = Integer.parseInt(scanner.nextLine());
                    zooClub.getClub().put(new Person(name, age), new ArrayList<>());
                    break;

                case ("2"):
                    // 2) додати тваринку до учасника клубу.
                    System.out.println("Додаємо тваринку в клуб \n До кого додати (ім'я)?");
                    System.out.println("Доступні:" + zooClub.getClub().keySet());
                    String ownerName = scanner.nextLine();

                    System.out.println("Введіть ім'я тваринки");
                    String petName = scanner.nextLine();

                    System.out.println("Введіть тип тваринки (cat, dog, fish etc)");
                    String petType = scanner.nextLine();

                    for (Person personIn : zooClub.getClub().keySet()) {
                        if (personIn.getName().equals(ownerName)) {
                            zooClub.getClub().get(personIn).add(new Pet(petName, petType));
                        }
                    }
                    break;

                case ("3"):
                    // 3) видалити тваринку з власника.
                    System.out.println("Видаляємо тваринку з власника\nУ кого видалити (ім'я)?");
                    ownerName = scanner.nextLine();

                    System.out.println("Введіть ім'я тваринки");
                    petName = scanner.nextLine();

                    for (Person personIn : zooClub.getClub().keySet()) {
                        if (personIn.getName().equals(ownerName)) {
                            zooClub.getClub().get(personIn).removeIf(pet -> pet.getName().equals(petName));
                        }
                    }
                    break;

                case ("4"):
                    // 4) видалити учасника клубу.
                    System.out.println("Видаляємо учасника з клубу\nКого видалити (ім'я)?");
                    ownerName = scanner.nextLine();

                    Iterator<Person> iterator = zooClub.getClub().keySet().iterator();

                    List<Person> peopleToDelete = new ArrayList<>();
                    while (iterator.hasNext()){
                        Person person = iterator.next();
                        if (person.getName().equals(ownerName)){
                            peopleToDelete.add(person);
                        }
                    }

                    for (Person person : peopleToDelete) {
                        zooClub.getClub().remove(person);
                    }
                    break;

                case ("5"):
                    // 5) видалити конкретну тваринку з усіх власників.
                    System.out.println("Видаляємо конкретну тваринку з усіх власників\nВведіть ім'я тваринки");
                    petName = scanner.nextLine();

                    zooClub.getClub().forEach((person, pets) -> pets.removeIf(pet -> pet.getName().equals(petName)));
                    break;

                case ("6"):
                    // 6) вивести на екран зооклуб.
                    zooClub.getClub().forEach((person, pets) -> System.out.println(String.format("Person: %s \n pets: %s", person, pets)));
                    break;

                case ("7"):
                    // 7) вийти
                    return;
            }
        }
    }
}
