package com.example.demo.Controller;


import com.example.demo.Model.Teacher;
import com.example.demo.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/teachers")
public class TeacherController {

    @Autowired
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {

        this.teacherService = teacherService;
    }


    @GetMapping("/teacher/{id}")
    public Teacher getTeacher( @PathVariable ("id") Long id) {

        return  teacherService.getById(id);
    }



    @PostMapping("/teacher")
    public Teacher postSaveTeacher(@RequestBody Teacher teacher) {

        return teacherService.save(teacher);
    }

    @DeleteMapping(value = "/teacher/{id}")
    public void deleteTeacher(@PathVariable("id") Long id) {

        teacherService.delete(id);
    }

}
