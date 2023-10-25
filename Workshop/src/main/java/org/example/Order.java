package org.example;

public class Order {

    private int orderId;
    private Product product;
    private Category category;

    private String paymentMethod;

    private User user;

    public Order(int orderId, Product product, Category category, String paymentMethod, User user) {
        this.orderId = orderId;
        this.product = product;
        this.category = category;
        this.paymentMethod = paymentMethod;
        this.user = user;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
