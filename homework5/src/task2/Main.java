package task2;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Seance> seances = new TreeSet<>();

        seances.add(new Seance(new Movie("Nachalo", new Time(2, 5)), new Time(19, 0)));
        seances.add(new Seance(new Movie("Spiderman", new Time(1,55)), new Time(22,0)));
        seances.add(new Seance(new Movie("Fast and Furious 7", new Time(2,30)), new Time(14,30)));


        TreeSet<Seance> seances2 = new TreeSet<>();
        seances2.add(new Seance(new Movie("Maze Runner", new Time(2,3)), new Time(20,30)));
        seances2.add(new Seance(new Movie("Maze Runner 2", new Time(2,9)), new Time(23,30)));

        Schedule schedule1 = new Schedule(seances);
        Schedule schedule2 = new Schedule(seances2);

        Map<Days, Schedule> cinema = new TreeMap<>();
        cinema.put(Days.SUNDAY, schedule2);
        cinema.put(Days.MONDAY, schedule1);
        cinema.put(Days.TUESDAY, schedule1);

        Cinema cinema1 = new Cinema(cinema, new Time(8, 30), new Time(23, 59));
        cinema1.removeMovie("Maze Runner");


    }
}
