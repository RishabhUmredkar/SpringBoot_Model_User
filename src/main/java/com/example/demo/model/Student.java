package com.example.demo.model;

public class Student {

	private int roll;
	private String name;
	private String marks;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name, String marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	
	
}
