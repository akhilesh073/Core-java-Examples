package com.akh.collection.hashMap;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student student[] = new Student[4];
		student[0] = new Student();
		student[0].setName("Akhilesh");
		student[0].setGrade(60);
		student[0].setAge(25);
		student[0].setLesson("HTML/CSS");
		student[1] = new Student();
		student[1].setName("Sandeep");
		student[1].setGrade(90);
		student[1].setAge(24);
		student[1].setLesson("JavaScript");
		student[2] = new Student();
		student[2].setName("Nikhil");
		student[2].setGrade(70);
		student[2].setAge(26);
		student[2].setLesson("Data Structure");
		student[3] = new Student();
		student[3].setName("Amit");
		student[3].setGrade(80);
		student[3].setAge(25);
		student[3].setLesson("Core and advanced JAVA");
		System.out.println("Order of students before sorting:");
		System.out.println("==================================");
		display(student);
		System.out.println("Order of students after sorting Name:");
		System.out.println("==================================");
		Arrays.sort(student, new NameComparator());

		System.out.println("Order fo student after sorting Grade:");
		System.out.println("==================================");
		Arrays.sort(student, new GradeComparator());
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].getName() + "    \t"
					+ student[i].getGrade() + "    \t" + student[i].getAge()
					+ "    \t" + student[i].getLesson());
		}
		System.out.println("Order fo student after sorting Age:");
		System.out.println("==================================");
		Arrays.sort(student, new AgeComparator());
		display(student);
		System.out.println("Order fo student after sorting Lesson:");
		System.out.println("==================================");
		// Arrays.sort(student, new LessonComparator());

		// Through annomous comparator class*****

		Arrays.sort(student, new Comparator<Object>() {
			public int compare(Object o1, Object o2) {
				return (((Student) (o1)).getLesson())
						.compareTo(((Student) (o2)).getLesson());
			}

		});
		display(student);
	}

	private static void display(Student[] student) {
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].getName() + "    \t"
					+ student[i].getGrade() + "    \t" + student[i].getAge()
					+ "    \t" + student[i].getLesson());
		}
	}

}
