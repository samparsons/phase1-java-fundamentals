package com.simplilearn.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class StudentArrayDeque {

	public static void main(String[] args) {
		// create multiple student objects
		
		Student student1 = new Student(1001,"Robb Stark",1,"Winterfell University");
		Student student2 = new Student(1002,"Jon Snow",2,"Winterfell University");
		Student student3 = new Student(1003,"Arya Stark",9,"East Winterfell College");
		Student student4 = new Student(1004,"Sansa Stark",3,"Blacksmith Prep Academy");
		
		Queue<Student> studentQueue = new ArrayDeque<Student>();
		
		studentQueue.add(student1);
		studentQueue.add(student2);
		studentQueue.add(student3);
		studentQueue.add(student4);
		System.out.println("---------------------------");
		System.out.println(studentQueue);
		System.out.println("---------------------------");
		for(Student s : studentQueue) {
			System.out.println("Student Object: "+s);
		}
		// get method gets a value
		System.out.println("---------------------------");
		for(Student s : studentQueue) {
			System.out.println("Student Id: "+s.getId());
		}
		

	}

}
