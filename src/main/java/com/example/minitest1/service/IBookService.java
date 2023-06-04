package com.example.minitest1.service;

import com.example.minitest1.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> finAll();
     void save(Book book);
      void update(int id,Book books);
      void delete(int id);
   Book finById(int id);
}
