import java.util.HashMap;
import java.util.Map;
public class Warehouse {
    private String product;
    private int price;
    private int stock;
    private Map<String,Integer> productInWarehouse;
    
    public void addProduct(String product,int price,int stock){
        this.product = product;
        this.price = price;
        this.stock = stock;
        this.productInWarehouse = new HashMap<>();
        productInWarehouse.put(product, price);
    }
    public int price(String product){
        if(!(productInWarehouse.containsKey(product))){
            return -99;
        }
        return productInWarehouse.get(product);
    }
}
