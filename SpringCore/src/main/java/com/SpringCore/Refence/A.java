package com.SpringCore.Refence;

public class A {
	private int id;
	private B objectOfB;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public B getObjectOfB() {
		return objectOfB;
	}
	public void setObjectOfB(B objectOfB) {
		this.objectOfB = objectOfB;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "A [id=" + id + ", objectOfB=" + objectOfB + "]";
	}
	

}
