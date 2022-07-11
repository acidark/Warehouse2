

public class Main {

    public static void main(String[] args) {
        // Test your app here
        Warehouse fabrica = new Warehouse();
        fabrica.addProduct("milk", 10, 10);
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
        System.out.println(fabrica.products());

    }
}
