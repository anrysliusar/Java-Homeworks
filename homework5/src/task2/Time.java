package task2;


public class Time {
    private int min;
    private int hours;

    public Time() {
    }

    public Time(int hours, int min) {
        if (min < 0 || min > 59) {
            if (hours < 0 || hours > 23) {
                System.out.println("wrong input");
                return;
            }
        }
        this.min = min;
        this.hours = hours;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (min < 0 || min > 59) {
            System.out.println("wrong input");
            return;
        }
        this.min = min;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours < 0 || hours > 23) {
            System.out.println("wrong input");
            return;
        }
        this.hours = hours;
    }


    @Override
    public String toString() {
        return "Time{" +
                "min=" + min +
                ", hours=" + hours +
                '}';
    }
}
