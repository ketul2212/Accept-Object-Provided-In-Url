package com.ketul.demo;

public class Employee {

	private int id;
	private String name;
	private String lang;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	
	public String toString() {
		return "[id = " + id + ", name = " + name + ", lang = " + lang + "]";
	}
}
