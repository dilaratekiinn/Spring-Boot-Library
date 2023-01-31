package com.example.demo.Controller;

import com.example.demo.Service.ClassroomService;
import com.example.demo.Service.StudentService;
import com.example.demo.Service.StudentclassService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class StudentClassController {

    private final StudentService studentService;
    private final ClassroomService classroomService;
    private final StudentclassService studentclassService;

    public StudentClassController(StudentService studentService, ClassroomService classroomService, StudentclassService studentclassService) {
        this.studentService = studentService;
        this.classroomService = classroomService;
        this.studentclassService = studentclassService;
    }
}
