/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TuitionManagement.Controller;

import TuitionManagement.DB.DBConnection;
import TuitionManagement.Model.Teacher;
import com.sun.net.httpserver.Authenticator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class TeacherController {

    public static boolean addNewTeacher(Teacher t1) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        String SQL = "insert into teacher values(?,?,?,?,?)";
        PreparedStatement stm = conn.prepareStatement(SQL);
        stm.setObject(1, t1.getTeacher_id());
        stm.setObject(2, t1.getTeacher_name());
        stm.setObject(3, t1.getSubject_name());
        stm.setObject(4, t1.getContact_number());
        stm.setObject(5, t1.getEmail());
        int res = stm.executeUpdate();
        if (res > 0) {
            return true;
        }
        return false;
    }

    public static boolean updateTeacher(Teacher t1) throws ClassNotFoundException, SQLException {
        String SQL = "update teacher set teacher_name=?,subject_name=?,contact_number=?,email=? where teacher_id=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(SQL);
        stm.setObject(1, t1.getTeacher_name());
        stm.setObject(2, t1.getSubject_name());
        stm.setObject(3, t1.getContact_number());
        stm.setObject(4, t1.getEmail());
        stm.setObject(5, t1.getTeacher_id());
        int res = stm.executeUpdate();
        if(res>0){
            return true;
        }
        return false;
    }
    
    public static  int deleteTeacher(String teacher_id)throws ClassNotFoundException,SQLException{
        String SQL="delete from teacher where teacher_id='"+teacher_id+"'";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        int res=stm.executeUpdate(SQL);
        return res;
       
        
    }
    
    /* public static Teacher searchTeacher(String id)throws ClassNotFoundException,SQLException{
    String SQL="select * from teacher where student_id='"+id+"'";
    Connection conn=DBConnection.getDBConnection().getConnection();
    Statement stm=conn.createStatement();
    ResultSet rst=stm.executeQuery(SQL);
    if(rst.next()){
    Teacher t1=new Teacher(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5));
    return t1;
    }else{
    return null;
    }
    }*/
    public static  ArrayList<Teacher>getAllTeachers()throws ClassNotFoundException,SQLException{
        String SQL="select * from teacher";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        ArrayList<Teacher>teacherList=new ArrayList<>();
        while(rst.next()){
            Teacher t1=new Teacher(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5));
            teacherList.add(t1);
        }
        return teacherList;
                
    }

    public static ArrayList<Teacher>searchSelectdTeacher(String teacher_id)throws ClassNotFoundException,SQLException{
        Connection conn=DBConnection.getDBConnection().getConnection();
        String SQL="select t.teacher_id,teacher_name,subject_id,s.subject_name,subject_fee,contact_number,email from teacher t,subject s where t.teacher_id=s.teacher_id && t.teacher_id='"+teacher_id+"'";
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        ArrayList<Teacher>teacherList=new ArrayList<>();
        while(rst.next()){
            Teacher t1=new Teacher(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getDouble(5),rst.getString(6),rst.getString(7));
            teacherList.add(t1);
        }
        return teacherList;
    }
    
     public static ArrayList<Teacher> viewAllTeacherDetails() throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        String SQL = "Select * from   teacher";
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<Teacher> teachersList = new ArrayList<>();
        while (rst.next()) {
            Teacher t1 = new Teacher(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5));
            teachersList.add(t1);
        }
        return teachersList;
    }
    
}


