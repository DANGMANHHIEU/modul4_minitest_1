package com.example.minitest1.service;

import com.example.minitest1.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService implements IBookService{
    private static final List<Book> book;
    static {
        book = new ArrayList<>();
        book.add(new Book(1,"Doremon","Truyện hay","Nobita,Xuka,Chaien,Xeko,Doremon","2023"));
        book.add(new Book(2,"Doremon","Truyện hay","Nobita,Xuka,Chaien,Xeko,Doremon","2023"));
        book.add(new Book(3,"Doremon","Truyện hay","Nobita,Xuka,Chaien,Xeko,Doremon","2023"));
        book.add(new Book(4,"Doremon","Truyện hay","Nobita,Xuka,Chaien,Xeko,Doremon","2023"));
        book.add(new Book(5,"Doremon","Truyện hay","Nobita,Xuka,Chaien,Xeko,Doremon","2023"));
        book.add(new Book(6,"Doremon","Truyện hay","Nobita,Xuka,Chaien,Xeko,Doremon","2023"));
    }
    @Override
    public List<Book> finAll() {
        return new ArrayList<>(book);
    }

    @Override
    public void save(Book books) {
        book.add(books);
    }

    @Override
    public void update(int id, Book books) {
        int x=0;
        for(int i=0; i<book.size();i++){
            if(book.get(i).getId()==id){
                x=i;
                break;
            }
        }
          book.set(x,books);
    }

    @Override
    public void delete(int id) {
        int x=0;
        for(int i=0; i<book.size();i++){
            if(book.get(i).getId()==id){
                x=i;
                break;
            }
        }
        book.remove(x);
    }

    @Override
    public Book finById(int id) {
        int x=0;
        for(int i=0; i<book.size();i++){
            if(book.get(i).getId()==id){
                x=i;
                break;
            }
        }
        return book.get(x);
    }

    public static void main(String[] args) {

        BookService bookService = new BookService();
        System.out.println(bookService.finById(1));
    }
}
