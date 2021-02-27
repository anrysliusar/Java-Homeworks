package task2;

public enum Sex {
    MALE("male"),
    FEMALE("female"),
    OTHER("other");

    String sex;

    Sex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return sex;
    }
}
