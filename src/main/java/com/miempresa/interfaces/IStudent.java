package com.miempresa.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.miempresa.models.Student;

@Repository
public interface IStudent extends CrudRepository<Student, Integer>{

}
