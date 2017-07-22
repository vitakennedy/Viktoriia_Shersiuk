package Home_OOP_task1;


import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * Created by Viktoriia_Sherstiuk on 7/22/2017.
 */
public class AvrPriceGoods {
    public static double avrPrice(ShopGoodsImplements goodsImplements) {
      /*  OptionalDouble average = goodsImplements.getstream().mapToDouble(g -> g.getPrice()).average();
        return average.isPresent() ? average.getAsDouble() : 0;*/
        double average;
        return  average = goodsImplements.getstream().mapToDouble(g -> g.getPrice()).average().getAsDouble();
    }
}