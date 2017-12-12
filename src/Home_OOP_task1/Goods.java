package Home_OOP_task1;

/**
 * Created by Viktoriia_Sherstiuk on 7/11/2017.
 */
abstract public class Goods implements Comparable<Goods> {

    private String name;
   private double price;

    public Goods() {
    }

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
   public int compareTo(Goods o) {
        if (this.price < o.getPrice())
            return -1;
        else { return this.price == o.getPrice()  ? 0: 1;
    }


    }



    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }



}
