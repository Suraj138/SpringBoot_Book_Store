package com.example.Book_Store.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Book_Store.Entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
