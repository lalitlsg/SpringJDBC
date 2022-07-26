package org.example;

import org.example.dao.StudentDao;
import org.example.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Program started..." );

//        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcConfig.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao studentDao = context.getBean("studentDaoImpl", StudentDao.class);

// Insert
//        Student s = new Student();
//        s.setId(4);
//        s.setName("Nikhil Raj");
//        s.setCity("Mumbai");
//
//        int result = studentDao.insert(s);
//
//        System.out.println("Student inserted " + result);

// Update
//        Student s = new Student();
//        s.setId(1);
//        s.setName("Lalit Garghate");
//        s.setCity("Banglore");
//
//        int result = studentDao.update(s);
//        System.out.println("Student updated " + result);

// Delete
//        int result = studentDao.delete(4);
//        System.out.println("Student deleted... " + result);

// Select Single Row
//        Student student = studentDao.getStudent(2);
//        System.out.println("Student : " + student);

// Select Multiple Rows
        List<Student> allStudents = studentDao.getAllStudents();
        for (Student s: allStudents) {
            System.out.println(s);
        }

    }
}
