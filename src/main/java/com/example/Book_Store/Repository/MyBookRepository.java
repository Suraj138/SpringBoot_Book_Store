package com.example.Book_Store.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Book_Store.Entity.MyBookList;

public interface MyBookRepository extends JpaRepository<MyBookList,Integer> {

}
