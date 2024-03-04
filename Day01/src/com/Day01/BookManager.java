package com.Day01;

public class BookManager {
	 public static Book createBook(String title, double price) {
	        Book book = new Book();
	        book.setBookTitle(title);
	        book.setBookPrice(price);
	        return book;
	    }

	    public static void showBook(Book book) {
	        System.out.println("Book Title: " + book.getBookTitle() + " and Price: " + book.getBookPrice());
	    }

	    public static void main(String[] args) {
	        // Input
	        String title = "Java Programming";
	        double price = 350.00;

	        // Create and show book
	        Book myBook = createBook(title, price);
	        showBook(myBook);
	    }

}
