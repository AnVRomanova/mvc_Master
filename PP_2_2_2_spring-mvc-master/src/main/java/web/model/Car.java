package web.model;

public class Car {
    private String name;
    private String color;
    private String user;

    public Car() {

    }

    public Car(String name, String color, String user) {
        this.name = name;
        this.color = color;
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Car {" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
