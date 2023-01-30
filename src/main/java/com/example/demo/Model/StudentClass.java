package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
public class StudentClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private long id;
    @OneToOne (fetch = FetchType.EAGER)
     private Classroom classroom;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(unique = true)
     private Student student;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
