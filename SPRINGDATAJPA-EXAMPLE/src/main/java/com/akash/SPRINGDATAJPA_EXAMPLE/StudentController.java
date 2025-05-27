package com.akash.SPRINGDATAJPA_EXAMPLE;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController //marks the class as a Spring MVC controller, tells Spring to write the return value of methods directly to the HTTP response body, usually in JSON or XML
@Controller //	Used for traditional MVC (UI views). Returns a view name (e.g., Thymeleaf). You must use @ResponseBody manually.
public class StudentController {
	@Autowired //must use autowired for automatic dependency injection
	StudentRepositary repo;
	
	@PostMapping("/signup") //used to handle HTTP POST requests
	public String addStudent(@RequestParam String name, @RequestParam String password) { //@RequestParam It extracts values from the URL query string or form data and passes them as arguments to your controller method.
		Student s = new Student(name, password);
		repo.save(s);
		return "Student added";
	}
	
	@GetMapping("/students") //used to handle HTTP GET requests
	public String getAllStudents(Model ref){ // the Model is a key component used to pass data from the controller to the view (typically a template like JSP, Thymeleaf, etc.).
		List<Student> students = repo.findAll();
		ref.addAttribute("students", students);
		return "Landing.html";
	}
	
//	@GetMapping("/students") //used to handle HTTP GET requests
//	public List<Student> getAllStudents(){
//		List<Student> students = repo.findAll();
//		return students;
//	}
	
	@GetMapping("/students/id/{id}") 
	public Student getStudentById(@PathVariable int id){ //@PathVariable Extract from URI path segment, Used to extract dynamic values embedded in the URL path.
		Optional<Student> student = repo.findById(id);
		if(student.isPresent()) return student.get();
		else return null;
	}
	
	@GetMapping("/students/name/{name}") 
	public List<Student> getStudentByName(@PathVariable String name){ //@PathVariable Extract from URI path segment, Used to extract dynamic values embedded in the URL path.
		List<Student> students = repo.findByNameLike("%" + name + "%");
		return students;
	}
	
	@GetMapping("students/name/id/{id}")
	public String getStudentName(@PathVariable int id) {
		String s = repo.customQuery(id);
		return s;
	}
	
}
