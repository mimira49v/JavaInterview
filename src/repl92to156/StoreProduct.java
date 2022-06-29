package repl92to156;

public class StoreProduct {
        String lable;
        double price;
        String category;
        boolean hasExpiration;
        int stock;

    // all values
    StoreProduct(String lable, double price, String category, boolean hasExpiration, int stock) {
        this.lable = lable;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }

    //all parameters except category and hasExpiration
    StoreProduct(String lable, double price, int stock) {
        this.lable = lable;
        this.price = price;
        this.stock = stock;
        this.category = "misc";
        this.hasExpiration = false;
    }

    // all the parameters except category, expiration, and stock
    StoreProduct(String lable, double price) {
        this.lable = lable;
        this.price = price;
        this.stock = 0;
    }

    public void display() {
        System.out.println(lable + " " + price + " " + category + " " + hasExpiration + " " + stock);
    }
}
