package com.situ.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.situ.ssm.entity.Student;
import com.situ.ssm.service.IStudentService;

@Controller
public class RESTfulController {
	
	@Autowired
	private IStudentService studentService;
	
	@RequestMapping(value="/students", method = RequestMethod.GET)
	@ResponseBody
	public List<Student> list(){
		List<Student> list = studentService.findAll();
		return list;
	}
	
	// GET           /students/11    返回id为11的学生信息
	 @RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
	 @ResponseBody
	 public Student findById(@PathVariable("id")Integer id) {
	 	Student student = studentService.findById(id);
	 	return student;
	 }
	 
	 	// DELETE     /students/11    删除id为11的学生信息
	 @RequestMapping(value = "/students/{id}", method = RequestMethod.DELETE)
	 @ResponseBody
	 public void deleteById(@PathVariable("id")Integer id) {
	 	studentService.deleteById(id);
	 }
	
}
