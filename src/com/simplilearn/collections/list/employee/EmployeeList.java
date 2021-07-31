package com.simplilearn.collections.list.employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {
		// add employee type 
		Employee employee1 = new Employee(1001,"Jon Snow","King",10018.04);
		Employee employee2 = new Employee(1002,"Robb Stark","Deceased",45018.04);
		Employee employee3 = new Employee(1003,"Sansa Stark","Leader",45568.04);
		Employee employee4 = new Employee(1004,"Arya Stark","Assassin",67867818.04);
		Employee employee5 = new Employee(1005,"Rickon Stark","Kid",67867818.04);
		
		// create list of employees
		List<Employee> listOfEmployees = new ArrayList<Employee>();
		
		// insert into list
		listOfEmployees.add(employee1);
		listOfEmployees.add(employee2);
		listOfEmployees.add(employee3);
		listOfEmployees.add(employee4);
		
		System.out.println(listOfEmployees);
		System.out.println("---------------------------");
		//insert data at index
		listOfEmployees.add(0,employee4);
		System.out.println(listOfEmployees);
		
		// replace
		System.out.println("---------------------------");
		listOfEmployees.set(2, employee5);
		System.out.println(listOfEmployees);
		
		// iterate over list
		System.out.println("---------------------------");
		Iterator<Employee> itr = listOfEmployees.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("---------------------------");
		for (Employee emp : listOfEmployees) {
			System.out.println(emp);
		}
		
		// update a value
		System.out.println("---------------------------");
		listOfEmployees.get(0).name = "Underfoot";
		System.out.println(listOfEmployees);

	}

}
