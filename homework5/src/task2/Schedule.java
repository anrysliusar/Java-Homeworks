package task2;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Schedule {
    private Set<Seance> seances;


    public Schedule() {
    }

    public Schedule(TreeSet<Seance> seances) {
        this.seances = seances;
    }

    public Set<Seance> getSeances() {
        return seances;
    }

    public void setSeances(Set<Seance> seances) {
        this.seances = seances;
    }

    public void addSeance(Seance seance){
        seances.add(seance);
    }

    public void removeSeance(Seance seanceIn){
        seances.removeIf(seance -> seance.equals(seanceIn));
    }

    public void removeSeance(Movie movie){
        seances.removeIf(seance -> seance.getMovie().equals(movie));
    }

    public void removeSeance(String titleMovie){
        seances.removeIf(seance -> seance.getMovie().getTitle().equals(titleMovie));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schedule schedule = (Schedule) o;
        return Objects.equals(seances, schedule.seances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seances);
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "seances=" + seances +
                '}';
    }
}
