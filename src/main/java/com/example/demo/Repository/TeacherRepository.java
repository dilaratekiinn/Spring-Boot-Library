package com.example.demo.Repository;

import com.example.demo.Model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@EnableJpaRepositories
public interface TeacherRepository extends JpaRepository<Teacher,Long> {


}

