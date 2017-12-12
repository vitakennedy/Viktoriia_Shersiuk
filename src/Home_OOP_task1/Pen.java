package Home_OOP_task1;

/**
 * Created by Viktoriia_Sherstiuk on 7/11/2017.
 */
public class Pen extends Goods {
    private String color;
    private String type;

    public Pen() {
    }

    public Pen(String name, double price, String color, String type) {
        super(name, price);
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
