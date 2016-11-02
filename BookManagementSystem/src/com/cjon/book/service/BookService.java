package com.cjon.book.service;

import com.cjon.book.dao.BookDAO;

public class BookService {

	
	
	public String getList(String keyword){
		
		
		BookDAO dao = new BookDAO();
		String result = dao.select(keyword);
		
		return result;
		
	}

	
	public boolean updateBook(String isbn, String price){
		BookDAO dao = new BookDAO();
		boolean result = dao.update(isbn,price);
		return result;
	}
}
