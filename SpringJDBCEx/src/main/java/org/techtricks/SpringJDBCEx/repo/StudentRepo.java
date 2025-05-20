package org.techtricks.SpringJDBCEx.repo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.techtricks.SpringJDBCEx.model.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.SimpleTimeZone;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Student student) {

        String sql = "insert into student(rollno, name , marks) values(?,?,?)";
        int row = jdbcTemplate.update(sql, student.getRollNo(), student.getName(), student.getMarks());
        System.out.println(row);
    }

    public List<Student> findAll() {

        String sql = "select * from student";

//        RowMapper<Student> rowMapper =new RowMapper<Student>() {
//            @Override
//            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//
//                Student student = new Student();
//
//                student.setRollNo(rs.getInt("rollno"));
//                student.setName(rs.getString("name"));
//                student.setMarks(rs.getInt("marks"));
//
//                return student;
//            }
//        };


        return jdbcTemplate.query(sql, (rs, rowNum) ->{

            Student student = new Student();

                student.setRollNo(rs.getInt("rollno"));
                student.setName(rs.getString("name"));
                student.setMarks(rs.getInt("marks"));
                return student;

        } );

       //return jdbcTemplate.query(sql,rowMapper);
    }
}
