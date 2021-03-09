package task1;

import task2.Days;
import task2.Schedule;

import java.util.*;

public class ZooClub{
    Map<Person, List<Pet>> club;

    public ZooClub() {
    }

    public ZooClub(Map<Person, List<Pet>> club) {
        this.club = club;
    }

    public Map<Person, List<Pet>> getClub() {
        return club;
    }

    public void setClub(Map<Person, List<Pet>> club) {
        this.club = club;
    }


    @Override
    public String toString() {
        return "ZooClub{" +
                "club=" + club +
                '}';
    }
}
