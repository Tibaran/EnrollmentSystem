package com.miempresa.interfaceService;

import java.util.List;

import com.miempresa.models.Course;

public interface ICourseService {
	public List<Course> list();
	public int save(Course c);
	public void delete(int id);
}
