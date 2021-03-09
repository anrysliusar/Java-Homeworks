package task2;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Cinema {
    private Map<Days, Schedule> treeMap;
    private Time open;
    private Time close;

    public Cinema() {
    }

    public Cinema(Map<Days, Schedule> treeMap, Time open, Time close) {
        this.treeMap = treeMap;
        this.open = open;
        this.close = close;
    }

    public Map<Days, Schedule> getTreeMap() {
        return treeMap;
    }

    public void setTreeMap(Map<Days, Schedule> treeMap) {
        this.treeMap = treeMap;
    }

    public Time getOpen() {
        return open;
    }

    public void setOpen(Time open) {
        this.open = open;
    }

    public Time getClose() {
        return close;
    }

    public void setClose(Time close) {
        this.close = close;
    }

    public void addSeance(Days day, TreeSet<Seance> seances){
        treeMap.put(Days.valueOf(day.getDay()), new Schedule(seances));
    }

    public void addSeance(Seance seance, Days day){
        TreeSet<Seance> seances = new TreeSet <>();
        seances.add(seance);
        treeMap.put(Days.valueOf(day.getDay()), new Schedule(seances));
    }

    public void removeMovie(String title){
        for (Map.Entry<Days, Schedule> next : treeMap.entrySet()) {
            next.getValue().removeSeance(title);
        }
    }
    public void removeSeance (Seance seance, Days day){
        for (Map.Entry<Days, Schedule> next : treeMap.entrySet()) {
            next.getValue().removeSeance(seance);
        }
    }


    @Override
    public String toString() {
        return "Cinema{" +
                "treeMap=" + treeMap +
                ", open=" + open +
                ", close=" + close +
                '}';
    }
}
