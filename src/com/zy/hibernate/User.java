package com.zy.hibernate;

public class User {
/*
create table user(
	id nvarchar(16) primary key,
	name nvarchar(16) not null,
	sex nchar(2) not null,
	age int check(age>=0 and age<=100),
	email nvarchar(32)
);
 */
	private String id;
	private String name;
	private String sex;
	private Integer age;
	private String email;
	
	public User() {}
	public User(String id, String name, String sex, Integer age, String email) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.email = email;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", email=" + email + "]";
	}
}
