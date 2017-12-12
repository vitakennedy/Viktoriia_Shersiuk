package Home_OOP_task1;


/**
 * Created by Viktoriia_Sherstiuk on 7/11/2017.
 */
public class Start {
    public static void main(String[] args) {
        Pen pen1 = new Pen("BIC Kids Blue",75.00, "blue", "gel");
        Pen pen2 = new Pen("BIC Easy Click",120.00, "red", "oil");
        Pen pen3 = new Pen("BIC Round Stick Click",4575.00, "black", "rollers");

        Notebook notebook1 = new Notebook(" Herlitz X Book", 86.00, "A7", 50);
        Notebook notebook2 = new Notebook("  Optima Орнамент", 75.00, "A4", 96);
        Notebook notebook3 = new Notebook("  Optima", 70.00, "A4", 96);




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
