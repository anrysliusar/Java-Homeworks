package task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Sofia", 35, Sex.FEMALE);
        User user2 = new User(2, "Vitia", 11, Sex.FEMALE);
        User user3 = new User(3, "Olia", 34, Sex.FEMALE);
        User user4 = new User(4, "Eduard", 36, Sex.OTHER);
        User user5 = new User(5, "Eva", 74, Sex.FEMALE);
        User user6 = new User(6, "Igor", 1, Sex.MALE);
        User user7 = new User(7, "Katya", 36, Sex.FEMALE);
        User user8 = new User(8, "Vasya", 28, Sex.MALE);
        User user9 = new User(9, "Andrew", 59, Sex.MALE);
        User user10 = new User(10, "Ira", 18, Sex.FEMALE);

        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);

        System.out.println("\nЮзери з парним значенням ід");
        for (User user: users) {
            if(user.getId() % 2 == 0){
                System.out.println(user);
            }
        }

        System.out.println("\nЮзери з ім'ям , довжина якого більше ніж 5 символів");
        for (User user: users) {
            if(user.getName().length() > 5){
                System.out.println(user);
            }
        }

        System.out.println("\nЮзери - жінки");
        for (User user: users) {
            if(user.getSex() == Sex.FEMALE){
                System.out.println(user);
            }
        }
    }
}
