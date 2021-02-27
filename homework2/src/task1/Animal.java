package task1;

public class Animal {
    private int age;
    private boolean isAlive;
    private String habitat;
    private String name;

    public Animal() {
    }

    public Animal(int age, boolean isAlive, String habitat, String name) {
        this.age = age;
        this.isAlive = isAlive;
        this.habitat = habitat;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeSound(){

    }

    @Override
    public String toString() {
        return "task1.Animal{" +
                "age=" + age +
                ", isAlive=" + isAlive +
                ", habitat='" + habitat + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
