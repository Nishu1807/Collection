package com.nishi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class App {

	public static void main1(String[] args) {
		Employee e = new Employee(1, "Nishigandha", 24);
		Employee e2 = new Employee(2, "Monika", 24);
		Map<String, Employee> map = new HashMap<String, Employee>();
		map.put("Nishi", e);
		map.put("Monika", e2);
		System.out.println(map.size());
		Employee e3 = new Employee(3, "Monika", 25);
		map.put("Monika", e3);
		System.out.println("new Size--" + map.size());
	}

	public static void main(String[] args) {
		Employee e = new Employee(1, "Nishigandha", 24);
		Employee e4 = new Employee(1, "Nishigandha", 24);
		Employee e5 = new Employee(1, "Niigandha", 24);
		Employee e2 = new Employee(2, "Monika", 24);
		Set<Employee> set = new HashSet<Employee>();
		set.add(e);
		set.add(e2);
		set.add(e4);
		set.add(e5);
		Employee e3 = new Employee(2, "Monika", 24);
		set.add(e3);
	
		System.out.println("new Size--" + set.size());
	}
}
