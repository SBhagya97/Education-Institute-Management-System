/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TuitionManagement.Controller;

import TuitionManagement.DB.DBConnection;
import TuitionManagement.Model.Registration;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class RegistrationController {

    public static boolean addRegistrationDeatils(Registration r1) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        conn.setAutoCommit(false);
        try {
            boolean isAlreadyIn = StudentController.searchStudent(r1.getS().getStudent_id()) != null;
            boolean isAdded = false;
            if (!isAlreadyIn) {
                isAdded = StudentController.addNewStudent(r1.getS());
            }
            if (isAdded || isAlreadyIn) {
                String sql = "INSERT INTO registration VALUES(?,?,?,?,?,?)";
                PreparedStatement stm = conn.prepareStatement(sql);
                stm.setObject(1, r1.getReg_id());
                stm.setObject(2, r1.getS().getStudent_id());
                stm.setObject(3, r1.getSubject_id());
                stm.setObject(4, r1.getBatch_id());
                stm.setObject(5, r1.getDate());
                stm.setObject(6, r1.getReg_fee());
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

    public static ArrayList<Registration> viewAllRegistrationDetails() throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        String SQL = "select reg_id,r.student_id,student_name,batch_type,b.batch_id,b.subject_id,date,reg_fee from registration r,batch b,student s where r.batch_id=b.batch_id && r.student_id=s.student_id";
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<Registration> registrationList = new ArrayList<>();
        while (rst.next()) {
            Registration r1 = new Registration(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6),rst.getString(7),rst.getDouble(8));
            registrationList.add(r1);
        }
        return registrationList;
    }

    public static ArrayList<Registration> searchAllRegistration(String regid) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        String SQL = "select reg_id,student_id,batch_type,b.batch_id,b.subject_id,date,reg_fee from registration r,batch b where r.batch_id=b.batch_id && reg_id='" + regid + "'";
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<Registration> registrationList = new ArrayList<>();
        while (rst.next()) {
            Registration r1 = new Registration(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getDouble(7));
            registrationList.add(r1);
        }
        return registrationList;

    }

    public static int deleteRegistration(String regid) throws ClassNotFoundException, SQLException {
        String SQL = "delete from registration where reg_id='" + regid + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        int res = stm.executeUpdate(SQL);
        return res;
    }

}
