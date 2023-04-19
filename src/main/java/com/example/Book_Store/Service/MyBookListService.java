package com.example.Book_Store.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Book_Store.Entity.MyBookList;
import com.example.Book_Store.Repository.MyBookRepository;

@Service
public class MyBookListService {

	@Autowired
	private MyBookRepository mybook;

	public void saveMyBooks(MyBookList book) {
		mybook.save(book);
	}

	public List<MyBookList> getAllMyBooks() {
		return mybook.findAll();
	}

	public void deleteById(int id) {
		mybook.deleteById(id);
	}
}
