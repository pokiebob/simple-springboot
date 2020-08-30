package com.yourname.Service;

import com.yourname.Dao.StudentDao;
import com.yourname.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;


    public Collection<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }

    public Student getStudentById(int id){
        return this.studentDao.getStudentById(id);
    }

}
