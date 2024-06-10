package com.simplilearn.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.simplilearn.dto.CourseDTO;
import com.simplilearn.dto.StudentDTO;
import com.simplilearn.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Override
	public StudentDTO enrollStudentInCourse(Long studentId, Long courseId) {
		// write your logic here
		return null;
	}

	@Override
	public List<CourseDTO> viewStudentEnrollments(Long studentId) {
		// write your logic here
		return null;
	}

	@Override
	public StudentDTO manageStudentEnrollment(Long studentId, Long courseId, boolean enroll) {
		// write your logic here
		return null;
	}

	@Override
	public List<StudentDTO> listStudentsForCourse(Long courseId) {
		// write your logic here
		return null;
	}

	@Override
	public StudentDTO createStudent(StudentDTO studentDTO) {
		// write your logic here
		return null;
	}
}
