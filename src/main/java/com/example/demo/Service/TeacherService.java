package com.example.demo.Service;

import com.example.demo.Model.Teacher;
import com.example.demo.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> listAll() {
        return teacherRepository.findAll();
    }

    public String save(Teacher teacher) {

        teacherRepository.save(teacher);
        return null;
    }

    public Teacher get(long id) {
        return teacherRepository.findById(id).get();
    }

    public void delete(long id) {
        teacherRepository.deleteById(id);
    }
}
