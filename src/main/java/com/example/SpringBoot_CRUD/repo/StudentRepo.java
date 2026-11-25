package com.example.SpringBoot_CRUD.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBoot_CRUD.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
