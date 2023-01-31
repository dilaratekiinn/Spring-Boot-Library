package com.example.demo.Controller;

import com.example.demo.Model.Classroom;
import com.example.demo.Service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/classroom")
public class ClassroomController {
    @Autowired
    private final ClassroomService classroomService;

    public ClassroomController(ClassroomService classroomService) {

        this.classroomService = classroomService;
    }


    @GetMapping("/classroom")
    public Classroom getClassroom(@PathVariable("id") long id) {

        return classroomService.getById(id);
    }

    @PostMapping("/classrooms")
    public Classroom postClassroom(@RequestBody Classroom classroom) {

        return classroomService.save(classroom);
    }

    @DeleteMapping(value = "/classroom/{id}")
    public void deleteClassroom(@PathVariable("id") Long id) {

        classroomService.delete(id);
    }

}
