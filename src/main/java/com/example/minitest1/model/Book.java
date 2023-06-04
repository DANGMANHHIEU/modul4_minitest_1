package com.example.minitest1.model;

public class Book {
    private int id;
    private String bookName;
    private String bookTitle;
    private String bookContent;
    private String created_date;

    public Book() {
    }

    public Book(int id, String bookName, String bookTitle, String bookContent, String created_date) {
        this.id = id;
        this.bookName = bookName;
        this.bookTitle = bookTitle;
        this.bookContent = bookContent;
        this.created_date = created_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookContent() {
        return bookContent;
    }

    public void setBookContent(String bookContent) {
        this.bookContent = bookContent;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookContent='" + bookContent + '\'' +
                ", created_date='" + created_date + '\'' +
                '}';
    }
}
