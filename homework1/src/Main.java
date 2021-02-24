public class Main {

    public static void main(String[] args){
        Car toyota = new Car("Toyota", 2008, "black", false, "diesel", 150, 2);

        Engine engine = new Engine("petrol", 115, 1.6, new String[]{"Vova", "Misha"});
        Car volvo = new Car("Volvo", 2015, "white", false, engine);

        Car tesla = new Car();
        tesla.setModel("Tesla");
        tesla.setEngine(new Engine("electric", 650, 0));
        tesla.setColor("red");
        tesla.setYearOfIssue(2019);
        tesla.setCrashed(true);


        if (volvo.isCrashed()){
            System.out.println(volvo.getModel() + " is crashed((");
        }else {
            System.out.println(volvo);
        }

    }
}

