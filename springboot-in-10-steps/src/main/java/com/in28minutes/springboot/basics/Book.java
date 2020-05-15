package com.in28minutes.springboot.basics;

public class Book {
	
	private Long id;
	private String name;
	private String author;
	
	public Book(Long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
