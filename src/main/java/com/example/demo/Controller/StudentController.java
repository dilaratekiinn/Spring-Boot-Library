package com.example.demo.Controller;


import com.example.demo.Model.Student;
import com.example.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/student")
public class StudentController {
    @Autowired
    private final StudentService studentService;

    public StudentController(StudentService studentService) {

        this.studentService = studentService;
    }

    @GetMapping(value = "/student/{id}")
    public Student getStudent(@PathVariable("id") Long id) {

        return studentService.getById(id);
    }

    @PostMapping("/students")
    public Student postStudent(@RequestBody Student student) {
        return studentService.save(student);

    }
    @DeleteMapping(value = "/student{id}")
     public void deleteStudent(@PathVariable("id") Long id){

        studentService.delete(id);
     }
}
