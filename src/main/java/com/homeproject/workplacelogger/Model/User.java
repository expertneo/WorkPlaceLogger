package com.homeproject.workplacelogger.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "User")
	private List<Activity> activities = new ArrayList<>();

	private String name;
	private String email;
	private int age;
	private LocalDate createdAt;

	public User() {
		super();
	}

	public User(Integer userId, List<Activity> activities, String name, String email, int age, LocalDate createdAt) {
		super();
		this.userId = userId;
		this.activities = activities;
		this.name = name;
		this.email = email;
		this.age = age;
		this.createdAt = createdAt;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public List<Activity> getActivities() {
		return activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
}
