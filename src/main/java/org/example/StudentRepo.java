package org.example;

import java.util.*;

public class StudentRepo {

    private final Map<String, Student> students = new HashMap<>();

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public Student save(Student student) {
        students.put(student.id(), student);
        return student;
    }

    public Optional<Student> findStudentById(String id) {
        return Optional.ofNullable(students.get(id));
    }

    public Student getStudentById(String id) throws Exception {
        if (students.containsKey(id)) {
            return students.get(id);
        }
        else throw new Exception("Element with id " + id + " not found");
    }
}
