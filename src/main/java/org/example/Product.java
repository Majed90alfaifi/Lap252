package org.example;

public abstract class Product { //Q3>> make the class abstract so now should not be instantiated directly in main class
    private int id;
    private double price;
    private String name;
    static int quantity;   //Q1>> make the variable (quantity) static instead of private

    private double weight; //Q7>> make the variable (weight) private to prevent subclasses manipulate it directly
    public Product(int id, double price, String name){
        this.id = id;
        this.price = price;
        this.name = name;
        Product.quantity ++;
    }
    public void applySaleDiscount(double percentage){
        this.price = this.price - ((percentage/100) * this.price);
    }

    final void addToShoppingCart(){ //Q5>> to prevent subclasses from overriding this method

        System.out.println(this.name + " has been added to the shopping cart.");

    }

    public int getTotalQuantity(){
        return this.quantity;
    }

    public void getSellableStatus(){
        System.out.println("This product is sellable");
    }

    public double getSalePrice(double percentage){
        return this.price - ((percentage/100) * this.price);
    }
    public String toString(){
        return "Product info:\n+Id: " + this.id + "\t" + "name: " + this.name +
                "\tPrice: SR" + this.price;
    }
}