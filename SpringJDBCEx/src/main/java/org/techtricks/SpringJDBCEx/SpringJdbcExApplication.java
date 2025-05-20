package org.techtricks.SpringJDBCEx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.techtricks.SpringJDBCEx.model.Student;
import org.techtricks.SpringJDBCEx.service.StudentService;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringJdbcExApplication.class, args);


		Student student = context.getBean(Student.class);

		student.setRollNo(105);
		student.setName("Nani");
		student.setMarks(123);


		StudentService studentService = context.getBean(StudentService.class);
		studentService.addStudent(student);


		List<Student> studentList = studentService.getStudents();

		System.out.println(studentList);
	}




}

