package com.learning.StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class FilterIntro2 {

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"ankit", "Singh", 18000, 2);
		Employee e2 = new Employee(2,"Mohan", "Raj", 45000, 1);
		Employee e3 = new Employee(3,"Rahul", "Verma", 25000, 4);
		Employee e4 = new Employee(4,"Ankit", "Yadav", 10000, 2);
		Employee e5 = new Employee(5,"Ram", "Roy", 35000, 5);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		//list.stream().filter(obj->obj.getSalary()>16000 && obj.getEmp_name().toUpperCase().charAt(0)=='A').forEach(obj->System.out.println(obj.getEmp_name()+" "+obj.getEmp_lname()));
	   //list.stream().map(obj->obj.getSalary()+(obj.getSalary()*10/100)).forEach(obj->System.out.println(obj));

//
//	   list.stream()
//			    .map(o -> {
//			        o.setSalary(o.getSalary() + (o.getSalary() * 0.1)); // Increment salary by 10%
//			        return o;
//			    })
//			    .forEach(o->System.out.println(o));
		
//		list.stream()
//		.forEach(emp -> emp.setSalary(emp.getSalary() + (emp.getSalary() *0.1 ))
//				);
//		
//		list.stream().forEach(emp->System.out.println(emp));
		
		long result =list.stream().filter(emp -> emp.getExp_year()>=4).count();
		
		System.out.println(result);

	}

}
