package com.Day5;


import java.util.HashSet;
class Product2 {
    private String productId;
    private String productName;

    public Product2(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return productId + " " + productName;
    }
}


public class ProductDetials {
	
	public static void main(String[] args) {
        // Create a HashSet to store products
        HashSet<Product2> products = new HashSet<>();

        // Add predefined product information to the HashSet
        products.add(new Product2("P001", "Maruti 800"));
        products.add(new Product2("P002", "Maruti Zen"));
        products.add(new Product2("P003", "Maruti Dezire"));
        products.add(new Product2("P004", "Maruti Alto"));

        // List all the product details
      
        for (Product2 product : products) {
            System.out.println(product);
        }
    }


}
