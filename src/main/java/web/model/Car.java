package web.model;

public class Car {
    private int id;
    private String model;
    private String owner;

    public Car(int id, String model, String owner) {
        super();
        this.id = id;
        this.model = model;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getOwner() {
        return owner;
    }

}
