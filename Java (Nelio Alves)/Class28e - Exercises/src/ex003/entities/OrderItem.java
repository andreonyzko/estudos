package ex003.entities;

public class OrderItem {
    private int quantity;
    private double price;
    private Product product;

    public OrderItem(int quantity, double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double subtotal(){
        return price*quantity;
    }

    @Override
    public String toString() {
        return product.getName() + ", $" + String.format("%.2f", product.getPrice()) + ", Quantity: " + quantity + ", Subtotal: $" + String.format("%.2f", subtotal());
    }
}
