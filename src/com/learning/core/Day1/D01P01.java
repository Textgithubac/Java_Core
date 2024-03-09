package com.learning.core.Day1;
class Book {
    private String bookTitle;
    private double bookPrice;

    // Getter and Setter methods for bookTitle
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    // Getter and Setter methods for bookPrice
    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }
}


public class D01P01 {
	public static Book createBooks(String title, double price) {
        Book book = new Book();
        book.setBookTitle(title);
        book.setBookPrice(price);
        return book;
    }

    public static void showBooks(Book book) {
        System.out.println("Book Title: " + book.getBookTitle() + " and price: " + book.getBookPrice());
    }

    public static void main(String[] args) {
        Book book = createBooks("java programming", 350.00);

        
        showBooks(book);
    }
	

}
