package com.simplilearn.collections.queue;

// this kind of class can be called: encapsulated class or Bean or POJO or Entity 

public class Student {
	// encapsulated class, private properties, but public get and set methods.
	// private properties
	private int id;
	private String name;
	private int rank;
	private String college;
	
	// gets and sets
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
	
	// constructor
	public Student(int id, String name, int rank, String college) {
		super();
		this.id = id;
		this.name = name;
		this.rank = rank;
		this.college = college;
	}

	public Student() {
		super();
	}
	
	// toString method generated
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + ", college=" + college + "]";
	}
	
	
	
	

}
