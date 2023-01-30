package com.example.demo.Controller;


import ch.qos.logback.core.model.Model;
import com.example.demo.Model.Teacher;
import com.example.demo.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping("/teacherindex")
public class TeacherController {

    private final TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping(value = "/teacher")
    public String getSaveTeacher(@ModelAttribute("teacher") Teacher teacher) {

        return teacherService.save(teacher);

    }

    @PostMapping(value = "/teacher")
    public String postSaveTeacher(@ModelAttribute Teacher teacher) {
        teacherService.save(teacher);
        return teacherService.save(teacher);
    }

    @DeleteMapping(value = "/teacher/{id}")
    public void deleteTeacher(@PathVariable("id") Long id) {
        teacherService.delete(id);
    }

}
