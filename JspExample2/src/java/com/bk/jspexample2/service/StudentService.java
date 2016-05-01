/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bk.jspexample2.service;

import com.bk.jspexample2.dao.StudentDAO;
import com.bk.jspexample2.dao.impl.StudentDAOImpl;
import com.bk.jspexample2.entity.Student;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author bkawan
 * @date Apr 28, 2016
 * @time 3:52:58 PM
 */
public class StudentService {

    private StudentDAO studentDAO = new StudentDAOImpl();
    
    
    public List<Student> getAll() throws ClassNotFoundException, SQLException{
        
        return studentDAO.getAll();
    }
    
    public Student getById(int id) throws ClassNotFoundException, SQLException{
    
        return studentDAO.getById(id);
    }
    
    public int insert(Student student) throws ClassNotFoundException, SQLException {
        return studentDAO.insert(student);
    }
}
