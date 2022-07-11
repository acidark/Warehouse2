import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Test your app here
        Warehouse fabrica = new Warehouse();
        /*fabrica.addProduct("milk", 10, 10);
        fabrica.addProduct("coffeee", 2, 2);
        fabrica.products();
        System.out.println(fabrica.price("coffeee"));
        System.out.println(fabrica.price("milk"));
        System.out.println(fabrica.price("produt"));
        System.out.println(fabrica.stock("miilk"));
        System.out.println(fabrica.take("coffeee"));
        System.out.println(fabrica.stock("coffeee"));
        System.out.println(fabrica.take("coffeee"));
        System.out.println(fabrica.take("coffeee"));
        //System.out.println(fabrica.products());*/

        /*for(String product : fabrica.products()){
            System.out.println(product);
        }*/
        /*Item newItem = new Item("pollo", 3, 10);
        System.out.println(newItem.price());
        newItem.increaseQuantity();
        System.out.println(newItem.price());
        ShoppingCart newCart = new ShoppingCart();
        newCart.add("carne", 15);
        newCart.add("pescado", 20);
        System.out.println(newCart.price());
        newCart.print();
        newCart.add("carne", 15);
        newCart.print();*/
        Warehouse newWarehouse = new Warehouse();
        newWarehouse.addProduct("pasta", 10, 20);
        newWarehouse.addProduct("cafe", 10, 22);
        newWarehouse.addProduct("ramen", 22, 33);
        Scanner scanner = new Scanner(System.in);
        Store store = new Store(newWarehouse, scanner);
        store.shop("hugo");
        System.out.println(newWarehouse.stock("cafe"));

    }
}
