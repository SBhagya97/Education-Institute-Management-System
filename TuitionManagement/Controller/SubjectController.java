/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TuitionManagement.Controller;

import TuitionManagement.DB.DBConnection;
import TuitionManagement.Model.Subject;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.naming.spi.DirStateFactory;


public class SubjectController {

    public static Subject searchSubject(String subject_name) throws ClassNotFoundException, SQLException {
        String SQL = "select * from subject where subject_name='" + subject_name + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            Subject s1 = new Subject(rst.getString(1), rst.getString(2), rst.getDouble(3), rst.getString(4));
            return s1;
        } else {
            return null;
        }
    }
    public static ArrayList<Subject> searchSubjectName(String subject_id)throws ClassNotFoundException,SQLException{
        String SQL = "select * from subject where subject_id='" + subject_id+ "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<Subject>subjectList=new ArrayList<>();
        while(rst.next()) {
            Subject s1 = new Subject(rst.getString(1), rst.getString(2), rst.getDouble(3), rst.getString(4));
            subjectList.add(s1);
        }
            return subjectList;
        
    }

    public static ArrayList<Subject> getAllSubject() throws ClassNotFoundException, SQLException {
        String SQL = "select * from subject";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<Subject> subjectList = new ArrayList<>();
        while (rst.next()) {
            Subject s1 = new Subject(rst.getString(1), rst.getString(2), rst.getDouble(3), rst.getString(4));
            subjectList.add(s1);
        }
        return subjectList;
    }

    public static Subject searchSubjectIDs(String reg_id) throws ClassNotFoundException, SQLException {
        String SQL = "select s.subject_id from subject s,registration r where r.subject_Id=s.subject_Id && reg_id='" + reg_id + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            Subject s1 = new Subject(rst.getString(1));
            return s1;
        }
        return null;
    }

    public static ArrayList<Subject> searchSubjectNames(String reg_id) throws ClassNotFoundException, SQLException {
        String SQL ="select subject_name,r.subject_id,subject_fee from registration r,subject s where r.subject_id=s.subject_id && reg_id='"+reg_id+"'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<Subject> subjectList = new ArrayList<>();
        while (rst.next()) {
            Subject s1 = new Subject(rst.getString(1),rst.getString(2),rst.getDouble(3));
            subjectList.add(s1);
        }
        return subjectList;
    }

    /*  public static  boolean deleteTeacher(String id)throws ClassNotFoundException,SQLException{
        String SQL="Delete from teacher where teacher_id='" + id + "'";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        int res=stm.executeUpdate(SQL);*/
    /*    public static boolean deleteSubject(Subject s1) throws ClassNotFoundException, SQLException {
    Connection conn = DBConnection.getDBConnection().getConnection();
    conn.setAutoCommit(false);
    try {
    boolean isDeleted = TeacherController.deleteTeacher(s1.getT1());
    if (isDeleted) {
    String SQL = "delete from subject where subject_id=?";
    PreparedStatement stm = conn.prepareStatement(SQL);
    stm.setObject(1, s1.getT1().getSubject_id());
    int res = stm.executeUpdate();
    if (res > 0) {
    conn.commit();
    return true;
    }
    }
    conn.rollback();
    return false;
    } finally {
    conn.setAutoCommit(true);
    }
    }*/

    public static boolean updateSubject(Subject s1) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        conn.setAutoCommit(false);
        try {
            boolean isUpdate = TeacherController.updateTeacher(s1.getT1());
            if (isUpdate) {
                String SQL = "update subject set subject_name=?,subject_fee=?,teacher_id=? where subject_id=?";
                PreparedStatement stm = conn.prepareStatement(SQL);
                stm.setObject(1, s1.getSubject_name());
                stm.setObject(2, s1.getSubject_fee());
                stm.setObject(3, s1.getT1().getTeacher_id());
                stm.setObject(4, s1.getSubject_id());
                int res = stm.executeUpdate();
                if (res > 0) {
                    conn.commit();
                    return true;
                }
            }
            conn.rollback();
            return false;
        } finally {
            conn.setAutoCommit(true);
        }
    }

    public static boolean addSubject(Subject s1) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        conn.setAutoCommit(false);
        try {
            boolean isAdded = TeacherController.addNewTeacher(s1.getT1());
            if (isAdded) {
                String SQL = "insert into subject values(?,?,?,?)";
                PreparedStatement stm = conn.prepareStatement(SQL);
                stm.setObject(1, s1.getSubject_id());
                stm.setObject(2, s1.getSubject_name());
                stm.setObject(3, s1.getSubject_fee());
                stm.setObject(4, s1.getT1().getTeacher_id());
                int res = stm.executeUpdate();
                if (res > 0) {
                    conn.commit();
                    return true;
                }
            }
            conn.rollback();
            return false;
        } finally {
            conn.setAutoCommit(true);
        }
    }
}
