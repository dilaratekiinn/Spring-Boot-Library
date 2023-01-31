package com.example.demo.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    public StudentRepository studentRepository;

    public List<Student> listAll() {

        return studentRepository.findAll();
    }

    public Student save(Student student) {

        return studentRepository.save(student);
    }
    public  Student getById(long id) {


        return studentRepository.findById(id).orElseThrow();
    }


    public void delete(long id) {
        studentRepository.deleteById(id);

    }
}
