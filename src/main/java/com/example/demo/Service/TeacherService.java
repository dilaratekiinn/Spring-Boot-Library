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

    public List<Teacher> listAll()
    {
        return teacherRepository.findAll();
    }

    public Teacher save(Teacher teacher) {

       return teacherRepository.save(teacher);

    }

    public Teacher getById(long id) {


        return teacherRepository.findById(id).orElseThrow();
    }

    public void delete(long id) {

        teacherRepository.deleteById(id);
    }



}
