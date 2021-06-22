package com.miempresa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.miempresa.interfaceService.IStudentService;
import com.miempresa.models.Student;

@Controller
@RequestMapping
public class MainController {
	
	@GetMapping("/title")
	public String title() {
		return "titulo";
	}
	@GetMapping("/options")
	public String options() {
		return "opciones";
	}
	@GetMapping("/content")
	public String content() {
		return "contenido";
	}
	
	@Autowired
	private IStudentService studentService;
	
	@GetMapping("/listStudents")
	public String listStudents(Model model) {
		List<Student> students = studentService.list();
		model.addAttribute("students", students);
		return "students";
	}
}
