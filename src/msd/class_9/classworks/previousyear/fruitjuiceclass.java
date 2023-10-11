package msd.class_9.classworks.previousyear;

public class fruitjuiceclass {

}
class FruitJuice{
    int product_code;
    String flavour;
    String pack_type;
    int pack_size;
    int product_price;
    FruitJuice(){
        product_code = 0;
        flavour = "";
        pack_type = "";
        pack_size = 0;
        product_price = 0;
    }
    void input(int product_code, String flavour, String pack_type, int pack_size, int product_price){
        this.product_code = product_code;
        this.flavour = flavour;
        this.pack_type = pack_type;
        this.pack_size = pack_size;
        this.product_price = product_price;
    }
    void discount(){
        product_price -= 10;
    }
    void display(){
        System.out.println("Product Code: " + product_code);
        System.out.println("Flavour: " + flavour);
        System.out.println("Pack Type: " + pack_type);
        System.out.println("Pack Size: " + pack_size);
        System.out.println("Product Price: " + product_price);
    }
}