package com.example.demo.Service;

import com.example.demo.Model.Classroom;
import com.example.demo.Repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassroomService {
    @Autowired
    private ClassroomRepository classroomRepository;

    public List<Classroom> listAll(){

        return classroomRepository.findAll();
    }
    public Classroom save(Classroom classroom) {

        return classroomRepository.save(classroom);
    }

    public Classroom getById(long id) {

        return classroomRepository.findById(id).orElseThrow();
    }


    public void delete(Long id) {

        classroomRepository.deleteById(id);
    }
}
