package com.situ.ssm.dao;

import java.util.List;

import com.situ.ssm.entity.Student;

public interface StudentDao {
	List<Student> findAll();

	Student findById(Integer id);

	void deleteById(Integer id);

}
