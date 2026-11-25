package com.example.SpringBoot_CRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot_CRUD.entity.Student;
import com.example.SpringBoot_CRUD.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student s)
	{
		return service.save(s);
	}
	
	@PostMapping("/saveall")
	public List<Student> saveAllStudent(@RequestBody List<Student> s)
	{
		return service.saveAll(s);
	}
	
	@GetMapping("/findAll")
	public List<Student> findAll()
	{
		return service.fetchAll();
	}
	
	@GetMapping("/find/{id}")
	public Student findById(@PathVariable int id)
	{
		return service.fetchbyid(id);
	}
	
	@PutMapping("/update")
	public String updatepartially(@RequestBody Student student)
	{
		service.save1(student);
		return "Data Updated";
	}public StudentController() {
		// TODO Auto-generated constructor stub
	}
	
	
	@PatchMapping("/patch/{id}")
	public Student patchStudent(@PathVariable int id, @RequestBody Student s)
	{
		return service.patch(id, s);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletebyid(@PathVariable int id)
	{
		return service.deletebyId(id);
	}
	
	@DeleteMapping("/delete")
	public String delete()
	{
		return service.deleteAll();
	}
}
