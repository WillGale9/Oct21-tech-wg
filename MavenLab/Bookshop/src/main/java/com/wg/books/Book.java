package com.wg.books;

public class Book {
    private String title;
    private double price;
    private String author;
    private String publisher;
    private double salePercentage;

    public Book(String title, int price, String author, String publisher) {
        super();
        this.title = title;
        this.price = price;
        this.author = author;
        this.publisher = publisher;
    }

    public void setSaleDiscount(double salePercentage) {
        this.salePercentage = salePercentage / 100.0;
    }

    public double calculateSalePrice() {
        return price - price*salePercentage;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }
    public void setName(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


}