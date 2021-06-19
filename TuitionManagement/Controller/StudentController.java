/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TuitionManagement.Controller;

import TuitionManagement.DB.DBConnection;
import TuitionManagement.Model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class StudentController {

    public static int updateStudent(Student s1) throws ClassNotFoundException, SQLException {
        String SQL = "update student set student_name=?,date_of_birth=?,address=?,contact_number=?,email=? where student_id=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(SQL);
        stm.setObject(1, s1.getStudent_name());
        stm.setObject(2, s1.getDateOfBirth());
        stm.setObject(3, s1.getAddress());
        stm.setObject(4, s1.getContact_number());
        stm.setObject(5, s1.getEmail());
        stm.setObject(6, s1.getStudent_id());
        int res = stm.executeUpdate();
        return res;

    }

    public static int deleteStudent(String id) throws ClassNotFoundException, SQLException {
        String SQL = "delete from student where student_id='" + id + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        int res = stm.executeUpdate(SQL);
        return res;
    }

    public static Student searchStudent(String student_id) throws ClassNotFoundException, SQLException {
        String SQL = "select * from student where student_id='" + student_id + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            Student s1 = new Student(rst.getString("student_id"), rst.getString("student_name"), rst.getString("gender"), rst.getString("date_of_birth"), rst.getString("address"), rst.getString("contact_number"), rst.getString("email"));
            return s1;
        } else {
            return null;
        }
    }
    public static Student selectName(String student_name) throws ClassNotFoundException, SQLException {
        String SQL = "select * from student where student_id='" + student_name+ "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            Student s1 = new Student(rst.getString("student_id"), rst.getString("student_name"), rst.getString("gender"), rst.getString("date_of_birth"), rst.getString("address"), rst.getString("contact_number"), rst.getString("email"));
            return s1;
        } else {
            return null;
        }
    }

    public static ArrayList<Student> getAllStudent() throws ClassNotFoundException, SQLException {
        String SQL = "select distinct * from student";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<Student> studentList = new ArrayList<>();
        while (rst.next()) {
            Student s1 = new Student(rst.getString("student_id"), rst.getString("student_name"), rst.getString("gender"), rst.getString("date_of_birth"), rst.getString("address"), rst.getString("contact_number"), rst.getString("email"));
            studentList.add(s1);
        }
        return studentList;
    }

    public static boolean addNewStudent(Student s1) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        String SQL = "insert into student values(?,?,?,?,?,?,?)";
        PreparedStatement stm = conn.prepareStatement(SQL);
        stm.setObject(1, s1.getStudent_id());
        stm.setObject(2, s1.getStudent_name());
        stm.setObject(3, s1.getGender());
        stm.setObject(4, s1.getDateOfBirth());
        stm.setObject(5, s1.getAddress());
        stm.setObject(6, s1.getContact_number());
        stm.setObject(7, s1.getEmail());
        int res = stm.executeUpdate();
        if (res > 0) {
            return true;
        }
        return false;
    }
}
