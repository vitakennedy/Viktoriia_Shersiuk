package Home_OOP_task1;

/**
 * Created by Viktoriia_Sherstiuk on 7/11/2017.
 */
public class notebook extends goods {
    private String format;
    private int numberOfSheets;

    public notebook(String name, double price, String format, int numberOfSheets) {
        super(name, price);
        this.format = format;
        this.numberOfSheets = numberOfSheets;
    }

    public notebook() {
    }

    public String getFormat() {
        return format;
    }

    public int getNumberOfSheets() {
        return numberOfSheets;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setNumberOfSheets(int numberOfSheets) {
        this.numberOfSheets = numberOfSheets;
    }

    @Override
    public String toString() {
        return "notebook{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", format='" + format + '\'' +
                ", numberOfSheets=" + numberOfSheets +
                '}';
    }
}
