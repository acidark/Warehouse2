import java.util.HashMap;
import java.util.Map;
public class ShoppingCart {
    private Map<String,Item> cart;
    private Item newItem;

    public ShoppingCart(){
        this.cart = new HashMap<>();
    }
    public void add(String product,int price){
        this.newItem = new Item(product, 0, price);
        if(!(this.cart.containsKey(product))){
            this.cart.put(product, this.newItem );
        }
        //this.cart.put(product,newItem);
        this.cart.get(product).increseQuantity();

    }
    public int price(){
        int sum =0;
        for (Item prod : cart.values()){
            sum+=prod.price();
        } return sum;
    }
    public void print(){
        for(String itemInCart : cart.keySet()){
            System.out.println(cart.get(itemInCart));
        }

    }
}
