package com.simplilearn.collections.list.employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class EmployeeSet {

	public static void main(String[] args) {
		// add employee type 
		Employee employee1 = new Employee(1001,"Jon Snow","King",10018.04);
		Employee employee2 = new Employee(1002,"Robb Stark","Deceased",45018.04);
		Employee employee3 = new Employee(1003,"Sansa Stark","Leader",45568.04);
		Employee employee4 = new Employee(1004,"Arya Stark","Assassin",67867818.04);
		Employee employee5 = new Employee(1005,"Rickon Stark","Kid",67867818.04);
		
		// create list of employees
		Set<Employee> listOfEmployees = new LinkedHashSet<Employee>();
		
		// insert into list
		listOfEmployees.add(employee1);
		listOfEmployees.add(employee2);
		listOfEmployees.add(employee3);
		listOfEmployees.add(employee4);
		
		System.out.println(listOfEmployees);
		
		System.out.println("---------------------------");
		

	}

}
