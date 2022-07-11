import java.util.HashMap;
import java.util.Map;
public class Warehouse {
    private String product;
    private int price;
    private int stock;
    private Map<String,Integer> productInWarehouse;
    public Warehouse(){
        this.productInWarehouse = new HashMap<>();
    }
    public void addProduct(String product,int price,int stock){
        //this.product = product;
        //this.price = price;
        this.stock = stock;
        //this.productInWarehouse = new HashMap<>();
        this.productInWarehouse.put(product, price);
    }
    public void products(){
        for(String producto : this.productInWarehouse.keySet()){
            System.out.println(producto);
        }
    }
    public int price(String product){
        if(!(this.productInWarehouse.containsKey(product))){
            return -99;
        }
        return this.productInWarehouse.get(product);
    }

    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(!(getClass() == object.getClass())){
            return false;
        }
        //if(object instanceof this){
        //    return true;
        //}
        Warehouse objectoToCompare = (Warehouse) object;
        //if(objectoToCompare.product.equals(this.product)){
        //    return true;
        //} return false;
        if(!(this.product.equals(objectoToCompare.product))){
            return false;
        } return true;


    }
    public int hashCode(){
        return this.product.hashCode();
    }
}
