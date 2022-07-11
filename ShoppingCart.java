import java.util.HashMap;
import java.util.Map;
public class ShoppingCart {
    private Map<String,Item> cart;

    public ShoppingCart(){
        this.cart = new HashMap<>();
    }
    public void add(String product,int price){
        this.cart.put(product,new Item(product,1, price));
    }
    public int price(){
        int sum =0;
        for (Item prod : cart.values()){
            sum+=prod.price();
        } return sum;
    }
}
