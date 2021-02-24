public class Car {
    private String  model;
    private int yearOfIssue;
    private String color;
    private boolean isCrashed;
    private Engine engine;

    public Car(){}

    public Car(String  model, int yearOfIssue, String color, boolean isCrashed, Engine engine){
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.isCrashed = isCrashed;
        this.engine = engine;
    }

    public Car(String  model, int yearOfIssue, String color, boolean isCrashed, String type, int power, double volume){
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.isCrashed = isCrashed;
        this.engine = new Engine(type, power, volume);
    }

    public Car(String  model, int yearOfIssue, String color, boolean isCrashed, String type, int power, double volume, String[] drivers){
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.isCrashed = isCrashed;
        this.engine = new Engine(type, power, volume, drivers);

    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCrashed() {
        return isCrashed;
    }

    public void setCrashed(boolean crashed) {
        isCrashed = crashed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    @Override
    public String toString() {
        return "Car {" +
                "model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", color='" + color + '\'' +
                ", isCrashed=" + isCrashed +
                ", engine=" + engine +
                '}';
    }
}
