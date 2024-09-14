package parking;

public class Car {
    private  int id;
    private String name;
    private String number;
    private static int staticId = 1;

    public Car( String name, String number) {
        this.id = Car.staticId++;
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public int getId() {
        return id;
    }
}
