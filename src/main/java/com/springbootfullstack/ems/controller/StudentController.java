package com.springbootfullstack.ems.controller;

import com.springbootfullstack.ems.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("student")
    public Student getStudent(){
        Student student=new Student(
                "Grigary",
                "M",
                101
        );
        return student;
    }

    @GetMapping("list-students")
    public List<Student> getStudents(){
        List<Student> students=new ArrayList<>();
        students.add(new Student("grig","hey",2));
        students.add(new Student("hell","no",3));
        students.add(new Student("mannn","whatss",4));
        return students;
    }
    @GetMapping("/student/{id}/{firstName}")
    public Student getStudentName(@PathVariable int id,@PathVariable("firstName") String name){
        return new Student(name,"hoooiii",id);
    }

    @GetMapping("/stud")
    public Student getStud(@RequestParam int id,@RequestParam String name){
        return new Student(name,"done",id);
    }
}
