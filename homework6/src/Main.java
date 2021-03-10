import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        User vasya =  new User(1, "vasya", 31, Sex.MALE);
        User petya =  new User(2, "petya", 29, Sex.MALE);
        User kolya =  new User(3, "kolya", 28, Sex.MALE);
        User olya =   new User(4, "olya", 30, Sex.FEMALE);
        User max =    new User(5, "max", 31, Sex.OTHER);
        User anya =   new User(6, "anya", 12, Sex.FEMALE);
        User oleg =   new User(7, "oleg", 3, Sex.MALE);
        User andrey = new User(8, "andrey", 24, Sex.MALE);
        User masha =  new User(9, "masha", 67, Sex.FEMALE);
        User olia =   new User(10, "olia", 21, Sex.FEMALE);

        ArrayList<User> users = new ArrayList<>();

        users.add(vasya);
        users.add(petya);
        users.add(kolya);
        users.add(olya);
        users.add(max);
        users.add(anya);
        users.add(oleg);
        users.add(andrey);
        users.add(masha);
        users.add(olia);

//      - Проітерувати колекцію юзерів, вивевши тільки юзерів з парним значенням ід
        List<User> collect = users.stream()
                .filter(user -> user.getId() % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(collect);

//      - Проітерувати колекцію юзерів, вивевши тільки юзерів з ім'ям , довжина якого більше ніж 5 символів
        List<User> collect2 = users.stream()
                .filter(user -> user.getName().length() > 5)
                .collect(Collectors.toList());
        System.out.println(collect2);

//      - Проітерувати колекцію юзерів, вивевши тільки юзерів жінок
        List<User> collect3 = users.stream()
                .filter(user -> user.getSex().equals(Sex.FEMALE))
                .collect(Collectors.toList());
        System.out.println(collect3);
        
    }

}
