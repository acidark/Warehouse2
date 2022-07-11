

public class Main {

    public static void main(String[] args) {
        // Test your app here
        Warehouse fabrica = new Warehouse();
        fabrica.addProduct("milk", 10, 10);
        fabrica.addProduct("coffeee", 5, 15);
        System.out.println(fabrica.price("milk"));
    }
}
