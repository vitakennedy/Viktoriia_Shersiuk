package Home_OOP_task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Viktoriia_Sherstiuk on 7/11/2017.
 */
public class ShopGoodsImplements {

    List<Goods> item = new ArrayList<Goods>();

    public void add(Goods newGood) {
        item.add(newGood);
    }

    public int count(Goods newGood) {
        return item.size();
    }


    public Goods set(int index) {
        return item.get(index);
    }

    public void sortByCost() {
        Collections.sort(item);
    }

    public void print() {
        item.forEach( System.out::println);
      /*  for (Goods a :item
             ) {
            System.out.println(a);
        };*/

    }


    public Stream<Goods> getstream() {
        return item.stream();
    }


}
