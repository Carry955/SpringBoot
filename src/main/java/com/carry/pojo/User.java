package com.carry.pojo;

public class User {
	private String number;
	private String name;
	private int age;
	private String gender;
	public String getNumber() {
		return number;
	}
	@Override
	public String toString() {
		return "User [number=" + number + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
