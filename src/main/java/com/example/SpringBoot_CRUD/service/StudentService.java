package com.example.SpringBoot_CRUD.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.SpringBoot_CRUD.entity.Student;
import com.example.SpringBoot_CRUD.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo repo;
	
	public Student save(Student student)
	{
		return repo.save(student);
	}
	
	public List<Student> saveAll(List<Student> s)
	{
		return repo.saveAll(s);
	}
	
	public List<Student> fetchAll()
	{
		return repo.findAll();
	}
	
	
	public Student fetchbyid(int id)
	{
	    Optional<Student> byId = repo.findById(id);
	    if(byId.isPresent())
	    {
	        return byId.get();
	    }
	    return null;
	}
	
	
	public String save1( Student student)
	{
		repo.save(student);
		return "Data Updated";
	}
	
	public Student patch(int id, Student s)
	{
		Student old = repo.findById(id).get();

		if (s.getName() != null)
		{
			old.setName(s.getName());
		}

		if (s.getSchool() != null)
		{
			old.setSchool(s.getSchool());
		}
		

		return repo.save(old);
	}
	public String deletebyId(int id)
	{
		repo.deleteById(id);
		return "Data Deleted at id"+id;
	}
	
	public String deleteAll()
	{
		repo.deleteAll();
		return "All Data Deleted";
	}
}

