package com.simplilearn.dto;

import java.util.HashSet;
import java.util.Set;

public class StudentDTO {
	private Long id;

	private String name;

	private String email;

	private Set<Long> courseIds = new HashSet<>();

	public StudentDTO() {
		super();
	}

	public StudentDTO(Long id, String name, String email, Set<Long> courseIds) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.courseIds = courseIds;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Set<Long> getCourseIds() {
		return courseIds;
	}

	public void setCourseIds(Set<Long> courseIds) {
		this.courseIds = courseIds;
	}

	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", email=" + email + ", courseIds=" + courseIds + "]";
	}
}
