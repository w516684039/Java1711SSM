package com.situ.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.ssm.dao.StudentDao;
import com.situ.ssm.entity.Student;
import com.situ.ssm.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentDao studentdao;
	
	
	@Override
	public List<Student> findAll() {
		return studentdao.findAll();
	}


	@Override
	public Student findById(Integer id) {
		return studentdao.findById(id);
	}


	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		studentdao.deleteById(id);
	}

}
