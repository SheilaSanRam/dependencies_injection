package org.generation.dependencies_injection.service;

import org.generation.dependencies_injection.model.Student;

import java.util.HashMap;
import java.util.List;

public class StudentServiceImplMap implements StudentService {
    @Override
    public void add(Student student) {
        HashMap<String, Integer > studentHashMap = new  HashMap<String, Integer > ();
    }

    @Override
    public void delete(Student student) {

    }

    @Override
    public List<Student> all() {
        return null;
    }

    @Override
    public Student findById(String id) {
        return null;
    }
}
