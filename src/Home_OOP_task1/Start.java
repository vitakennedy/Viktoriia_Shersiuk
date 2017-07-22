package Home_OOP_task1;


/**
 * Created by Viktoriia_Sherstiuk on 7/11/2017.
 */
public class Start {
    public static void main(String[] args) {
        pen pen1 = new pen("BIC Kids Blue",75.00, "blue", "gel");
        pen pen2 = new pen("BIC Easy Click",120.00, "red", "oil");
        pen pen3 = new pen("BIC Round Stick Click",4575.00, "black", "rollers");

        notebook notebook1 = new notebook(" Herlitz X Book", 86.00, "A7", 50);
        notebook notebook2 = new notebook("  Optima Орнамент", 75.00, "A4", 96);
        notebook notebook3 = new notebook("  Optima", 70.00, "A4", 96);




        ShopGoodsImplements goodsImplements = new ShopGoodsImplements();

        goodsImplements.add(pen1);
        goodsImplements.add(pen2);
        goodsImplements.add(pen3);
        goodsImplements.add(notebook1);
        goodsImplements.add(notebook2);
        goodsImplements.add(notebook3);

        System.out.println("Average price of gooods:"+AvrPriceGoods.avrPrice(goodsImplements)+"\n");

        goodsImplements.print();

       goodsImplements.sortByCost();
       System.out.println("\n"+"Goods are sorting by asceding:"+"\n");
       goodsImplements.print();


    }


}
