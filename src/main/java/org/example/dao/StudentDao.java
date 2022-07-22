package org.example.dao;

import org.example.entities.Student;

public interface StudentDao {
    public int insert(Student student);
    public int update(Student student);
    public int delete(int studentId);
}
