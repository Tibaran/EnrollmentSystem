package com.miempresa.interfaceService;

import java.util.List;

import com.miempresa.models.Student;

public interface IStudentService {
	public List<Student> list();
	public int save(Student s);
	public void delete(int id);

}
