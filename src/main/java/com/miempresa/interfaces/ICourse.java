package com.miempresa.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.miempresa.models.Course;

@Repository
public interface ICourse extends CrudRepository<Course, Integer>{

}
