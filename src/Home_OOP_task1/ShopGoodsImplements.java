package Home_OOP_task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Viktoriia_Sherstiuk on 7/11/2017.
 */
public class ShopGoodsImplements {

    List<goods> item = new ArrayList<goods>();

    public void add(goods newGood) {
        item.add(newGood);
    }

    public int count(goods newGood) {
        return item.size();
    }


    public goods set(int index) {
        return item.get(index);
    }

    public void sortByCost() {
        Collections.sort(item);
    }

    public void print() {
        item.forEach( System.out::println);
      /*  for (goods a :item
             ) {
            System.out.println(a);
        };*/

    }


    public Stream<goods> getstream() {
        return item.stream();
    }


}
