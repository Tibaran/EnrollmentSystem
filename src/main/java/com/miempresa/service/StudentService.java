package com.miempresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miempresa.interfaceService.IStudentService;
import com.miempresa.interfaces.IStudent;
import com.miempresa.models.Student;

@Service
public class StudentService implements IStudentService{
	
	@Autowired
	private IStudent repo;

	@Override
	public List<Student> list() {
		return (List<Student>)repo.findAll();
	}

	@Override
	public int save(Student s) {
		Student st = repo.save(s);
		if(!st.equals(null)) {
			return 1;
		}
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
	

}
