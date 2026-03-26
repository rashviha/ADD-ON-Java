public class ShoppingCart1 {
    void phone(String name, int price){
        System.out.println("Phone Name: " + name);
        System.out.println("Phone Price: " + price);
    }
    void phone(String name, int price, int quantity){
        System.out.println("Phone Name: " + name);
        System.out.println("Phone Price: " + price);
        System.out.println("Phone Quantity: " + quantity);
    }
    public static void main(String[] args){
        ShoppingCart1 obj = new ShoppingCart1();
        obj.phone( "Poco X6", 12000);
        obj.phone("Smasung", 35000, 2);


    }
}