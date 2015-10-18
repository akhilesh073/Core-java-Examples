package com.akh.collection.hashMap;

public class Student {
	private String name;
	private int age;
	private String lesson;
	private int grade;

	public String getName(String name) {
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

	public String getLesson() {
		return lesson;
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}
	public String toString(){
		return "[name= " +this.name+" , age= "+this.age+" , lesson= "+this.lesson+" , grade= "+this.grade+" ]";
	}

}
