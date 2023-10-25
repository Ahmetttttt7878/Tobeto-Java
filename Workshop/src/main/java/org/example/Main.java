package org.example;


public class Main {
    public static void main(String[] args) {


        // Category Object
        Category c = new Category("Cosmetics","This is Cosmetics Category");


        // Product Object
        Product p = new Product(1, "Parfum",48.99,c);

        //User Info
        User u = new User("Ahmet","male",27,"deneme@gmail.com","01111111111","Istanbul");

        //Order Info
        Order o = new Order(10,p,c,"peşin",u);


        System.out.println(p.getCategory().getName() +" "+ p.getId() +" "+ p.getName() + " "+ p.getPrice());
        System.out.println("Category Name: " + c.getName() + " Category Description: " + c.getDescription());
        System.out.println(o.getOrderId() + "\n" +o.getProduct().getId() + "\n"+ o.getProduct().getName() +  "\n"+ o.getProduct().getPrice() + "\n" + o.getPaymentMethod()+ "\n"+ p.getCategory().getDescription()+ "\n" + o.getUser().getName());



    }
}