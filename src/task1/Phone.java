package task1;

public class Phone {
    public int number;
    public String model;
    public int weight;

//    public Phone(int number, String model, int weight) {
//        this.number = number;
//        this.model = model;
//        this.weight = weight;
//    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone() {
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void reciveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void reciveCall(String name, int number) {
        System.out.println("Звонит2 " + name);
    }

    public int getNumber() {
        return (number);
    }
}
