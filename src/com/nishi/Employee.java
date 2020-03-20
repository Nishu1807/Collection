package com.nishi;

public class Employee {
	private Integer id;
	private String name;
	private Integer age;
	public Employee(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {  // no arguments
		
		return id.hashCode();
	}
	@Override
	public boolean equals(Object obj) { // arguments
		if(this==obj)
			return true;
		Employee employee =(Employee) obj;  // object typecast in employee 
		if(name.equals(this.name)) {
			return true;
		}
		return false;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
