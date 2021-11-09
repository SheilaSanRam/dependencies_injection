package org.generation.dependencies_injection.service;

import org.generation.dependencies_injection.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    private final List<Student> studentList = new ArrayList<>();

    public StudentServiceImpl(){
        addStudents();
    }

    @Override
    public void add(Student student) {
        studentList.add(student);
    }

    @Override
    public void delete(Student student) {
        studentList.remove(student);
    }

    @Override
    public List<Student> all() {
        return studentList;
    }

    @Override
    public Student findById(String id) {
        //Se hace el parse Int porque de origen está definido como string
        return studentList.get(Integer.parseInt(id));
    }

    //Solo se agregan usuarios dentro de la clase
    private void addStudents(){
        //studentList.add(new Student());
        studentList.add(new Student("1", 1, "Carlos Eduardo", "Jesus", 1 ));
        studentList.add(new Student("2", 2, "Rodrigo", "Leyva", 2 ));
        studentList.add(new Student("3", 3, "Marina", "Pardo", 3 ));

    }
}
