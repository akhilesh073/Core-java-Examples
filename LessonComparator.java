package com.akh.collection.hashMap;

import java.util.Comparator;

public class LessonComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		String lesson1=o1.getLesson();
		String lesson2=o2.getLesson();
		return lesson1.compareTo(lesson2);
	}

	

}
