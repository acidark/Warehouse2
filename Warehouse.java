import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Warehouse {
    //private String product;
    //private int price;
    //private int stock;
    private Map<String,Integer> productInWarehouse;
    private Map<String,Integer> stockBalance;
    public Warehouse(){
        //Map<String,Integer> productInWarehouse = new HashMap<>();
        //Map<String,Integer> stockBalance = new HashMap<>();
        this.productInWarehouse = new HashMap<>();
        this.stockBalance = new HashMap<>();
    }
    public void addProduct(String product,int price,int stock){
        //this.product = product;
        //this.price = price;
        //this.stock = stock;
        //this.productInWarehouse = new HashMap<>();
        this.productInWarehouse.put(product, price);
        this.stockBalance.put(product, stock);
    }
    public boolean take(String product){
        if(!(this.stockBalance.containsKey(product))){
            return false;
        }
        if(this.stockBalance.get(product)>0){
            int balance = this.stockBalance.get(product);
            //balance--;
            this.stockBalance.put(product, balance--);
            return true;
        } 
        this.stockBalance.remove(product);
        return false;
        //int Balance = this.stockBalance.get(product);
        //int Balance = this.stockBalance.get(product);
        //Balance--;
        //this.stockBalance.put(product, Balance);
        //if(this.stockBalance.get(product)<=0){
        //    this.stockBalance.put(product,0);
        //    return false;
        //} return true;

    }
    public Set<String> products(){
        return this.stockBalance.keySet();
    }

    public int stock(String product){
        //if(this.stockBalance.containsKey(product)){
        //    return this.stockBalance.get(product);
        //}
        //return 0;
        return this.stockBalance.getOrDefault(product, 0);
    }
    /*public void products(){
        for(String producto : this.productInWarehouse.keySet()){
            System.out.println(producto);
        }
    }*/
    public int price(String product){
        return this.productInWarehouse.getOrDefault(product, -99);
        //if(!(this.productInWarehouse.containsKey(product))){
        //    return -99;
        //}
        //return this.productInWarehouse.get(product);
    }

    /*public boolean equals(Object object){
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
    }*/
}
