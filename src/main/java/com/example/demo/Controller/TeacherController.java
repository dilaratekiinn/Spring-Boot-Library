package com.example.demo.Controller;


import com.example.demo.Model.Teacher;
import com.example.demo.Service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@Controller
@RequestMapping("/teacherindex")
public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping(value = "/saveteacher")
    public String getSaveTeacher(@ModelAttribute("teacher")Teacher teacher){

        return "teacher/create";
    }
    @PostMapping(value = "/saveteacher")
    public String postSaveTeacher(@ModelAttribute Teacher teacher) {
        teacherService.save(teacher);
        return "redirect:/teacherindex";
    }

    @GetMapping(value = "/deleteTeacher/{id}")
    public String deleteTeacher(@PathVariable("id") Long id) {
        deleteTeacher(id);
        return "redirect:/teacherindex";
    }

}
