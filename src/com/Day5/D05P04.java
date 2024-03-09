package com.Day5;

import java.util.HashSet;

class Product {
    private String productId;
    private String productName;

    public Product(String productId, String productName) {
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


public class D05P04 {
	public static void main(String[] args) {
        // Create a HashSet to store products
        HashSet<Product> products = new HashSet<>();

        // Add predefined product information to the HashSet
        products.add(new Product("P001", "Maruti 800"));
        products.add(new Product("P002", "Maruti Zen"));
        products.add(new Product("P003", "Maruti Dezire"));
        products.add(new Product("P004", "Maruti Alto"));

        // Check if a specific product exists
        String productIdToFind = "P003";
        boolean found = false;
        for (Product product : products) {
            if (product.getProductId().equals(productIdToFind)) {
                found = true;
                break;
            }
        }

        // Print the result
        if (found) {
            System.out.println("Product Found");
        } else {
            System.out.println("Product Not Found");
        }
    }


}
