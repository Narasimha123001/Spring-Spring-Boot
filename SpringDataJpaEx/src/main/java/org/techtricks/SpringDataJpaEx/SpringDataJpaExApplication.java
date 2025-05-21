package org.techtricks.SpringDataJpaEx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.techtricks.SpringDataJpaEx.model.Student;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);


		Student  s1 = context.getBean(Student.class);
//		Student  s2 = context.getBean(Student.class);
//		Student  s3 = context.getBean(Student.class);
//
		StudentRepo repo = context.getBean(StudentRepo.class);
//
//
//
//
		s1.setRollNo(1);
		s1.setName("Naras");
		s1.setMarks(99);
//
//		s2.setRollNo(2);
//		s2.setName("Raj");
//		s2.setMarks(80);
//
//		s3.setRollNo(3);
//		s3.setName("eww");
//		s3.setMarks(90);
//
//
//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);


//		//finalAll
//		System.out.println(repo.findAll());
//
//		//findbyId
//		System.out.println(repo.findById(2));
//
//
//		//optional findbyId
//		Optional<Student> student = repo.findById(200);
//		System.out.println(student.orElse(new Student()));
//
//
//
//		//delete
//		repo.deleteById(1);
//		System.out.println(repo.findAll());

//
//		System.out.println(repo.findByName("Raj"));
//
//		System.out.println(repo.findByMarksGreaterThan(80));


		repo.save(s1);
	}

}
